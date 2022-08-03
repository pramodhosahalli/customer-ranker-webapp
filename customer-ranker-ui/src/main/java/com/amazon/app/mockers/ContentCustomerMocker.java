package com.amazon.app.mockers;

import com.amazon.app.model.Content;
import com.amazon.app.model.Customer;
import com.amazon.app.util.ContentType;

import java.util.*;

public class ContentCustomerMocker {

    private static Map<Customer, List<Content>> customerListMap = new HashMap<>();
    private static Map<Content, Long> contentHitsMap = new LinkedHashMap<>();

    public static void doMock(){
        List<Customer> customerList = CustomerMocker.getCustomerList();
        List<Content> contentList = ContentMocker.getMocks(ContentType.SONG);

        for(Customer customer : customerList){
            for(Content content : contentList){
                double value = Math.random();
                if(value >= 0.1){
                    contentHitsMap.put(content, contentHitsMap.getOrDefault(content, 0L)+1); // customer visits once
                    if(!customerListMap.containsKey(customer))
                        customerListMap.put(customer, customerListMap.getOrDefault(customer,new ArrayList<Content>()));
                    customerListMap.get(customer).add(content);
                    customer.setScores(customer.getScores() + content.getContentLength());
                }
            }
        }
    }

    public static Map<Customer, List<Content>> getCustomerListMap() {
        return customerListMap;
    }

    public static Map<Content, Long> getContentHitsMap() {
        return contentHitsMap;
    }
}
