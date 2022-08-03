package com.amazon.app.controller;

import java.util.*;

import com.amazon.app.mockers.ContentCustomerMocker;
import com.amazon.app.mockers.CustomerMocker;
import com.amazon.app.model.Content;
import com.amazon.app.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CheckPointController {

    private static List<Customer> customerList = CustomerMocker.getCustomerList();

    @RequestMapping("/{userId}")
    public String home(Map<String, Object> model, @PathVariable String userId) {

        Customer customer = customerList.stream().filter(c->c.getCustomerName().equals(userId)).findFirst().get();
        model.put("rank", getUserRank(userId));
        model.put("username", customer.getCustomerName());
        model.put("timespan", "JULY 2022");
        model.put("followers", customer.getFollowers());

        List<Content> contentList = ContentCustomerMocker.getCustomerListMap().get(customer);
        Map<Content, Long> contentHitsMap = ContentCustomerMocker.getContentHitsMap();

        PriorityQueue<Map.Entry<Content, Long>> pq = new PriorityQueue<>(new Comparator<Map.Entry<Content, Long>>() {
            @Override
            public int compare(Map.Entry<Content, Long> o1, Map.Entry<Content, Long> o2) {
                return Long.compare(o2.getValue() , o1.getValue());
            }
        });

        for(Map.Entry<Content,Long> contentLongEntry : contentHitsMap.entrySet()) pq.add(contentLongEntry);
        Map<Content,Long> linkedMap = new LinkedHashMap<>();
        while(!pq.isEmpty()){
            Map.Entry<Content,Long> entry = pq.poll();
            linkedMap.put(entry.getKey(), entry.getValue());
        }

        Map<String, Integer> languageMap = new LinkedHashMap<>();
        for(Content content : contentList){
            languageMap.put(content.getLanguage(), languageMap.getOrDefault(content.getLanguage(), 0) + 1);
        }

        model.put("languageGroupedContents", languageMap);
        model.put("totalSongsListened", contentList.size());
        model.put("watchedContents", contentList);
        model.put("mostWatchedContents", linkedMap);
        return "index";
    }

    @RequestMapping("/leaderboard/{userId}")
    public String leaderboard(Map<String, Object> model,@PathVariable String userId) {
        getCustomersSortedByScored();
        Customer customer = customerList.stream().filter(c->c.getCustomerName().equals(userId)).findFirst().get();
        model.put("username", customer.getCustomerName());
        model.put("topRankedCustomers", customerList);
        return "tables-basic";
    }


    @RequestMapping("/account_settings_account/{userId}")
    public String account(Map<String, Object> model,@PathVariable String userId) {
        Customer customer = customerList.stream().filter(c->c.getCustomerName().equals(userId)).findFirst().get();
        model.put("username", customer.getCustomerName());
        return "pages-account-settings-account";
    }

    @RequestMapping("/account_settings_conn/{userId}")
    public String conn(Map<String, Object> model,@PathVariable String userId) {
        Customer customer = customerList.stream().filter(c->c.getCustomerName().equals(userId)).findFirst().get();
        model.put("username", customer.getCustomerName());
        return "pages-account-settings-connections";
    }

    @RequestMapping("/account_settings_notify/{userId}")
    public String notify(Map<String, Object> model,@PathVariable String userId) {
        Customer customer = customerList.stream().filter(c->c.getCustomerName().equals(userId)).findFirst().get();
        model.put("username", customer.getCustomerName());
        return "pages-account-settings-notifications";
    }

    private int getUserRank(String userId) {
        int rank = 1;
       getCustomersSortedByScored();
        for (Customer c: customerList) {
            if (c.getCustomerName().equals(userId)) {
                break;
            }
            rank++;
        }
        return rank;
    }

    private void getCustomersSortedByScored() {
        customerList.sort(new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return (int)((long)o2.getScores() - (long) o1.getScores());
            }
        });
    }

}