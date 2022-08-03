package com.amazon.app.mockers;

import com.amazon.app.model.Customer;
import com.amazon.app.util.Status;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CustomerMocker {

    private static List<Customer> customerList = null;
    private static Random random = new Random(100000000);
    private static int customerCount = 300;

    private static String[] customerNames = {
            "Liam","Noah","Oliver","Elijah","James","William","Benjamin","Lucas","Henry","Theodore","Jack","Levi","Alexander","Jackson","Mateo","Daniel","Michael","Mason","Sebastian","Ethan","Logan","Owen","Samuel","Jacob","Asher","Aiden","John","Joseph","Wyatt","David","Leo","Luke","Julian","Hudson","Grayson","Matthew","Ezra","Gabriel","Carter","Isaac","Jayden","Luca","Anthony","Dylan","Lincoln","Thomas","Maverick","Elias","Josiah","Charles","Caleb","Christopher","Ezekiel","Miles","Jaxon","Isaiah","Andrew","Joshua","Nathan","Nolan","Adrian","Cameron","Santiago","Eli","Aaron","Ryan","Angel","Cooper","Waylon","Easton","Kai","Christian","Landon","Colton","Roman","Axel","Brooks","Jonathan","Robert","Jameson","Ian","Everett","Greyson","Wesley","Jeremiah","Hunter","Leonardo","Jordan","Jose","Bennett","Silas","Nicholas","Parker","Beau","Weston","Austin","Connor","Carson","Dominic","Xavier","Jaxson","Jace","Emmett","Adam","Declan","Rowan","Micah","Kayden","Gael","River","Ryder","Kingston","Damian","Sawyer","Luka","Evan","Vincent","Legend","Myles","Harrison","August","Bryson","Amir","Giovanni","Chase","Diego","Milo","Jasper","Walker","Jason","Brayden","Cole","Nathaniel","George","Lorenzo","Zion","Luis","Archer","Enzo","Jonah","Thiago","Theo","Ayden","Zachary","Calvin","Braxton","Ashton","Rhett","Atlas","Jude","Bentley","Carlos","Ryker","Adriel","Arthur","Ace","Tyler","Jayce","Max","Elliot","Graham","Kaiden","Maxwell","Juan","Dean","Matteo","Malachi","Ivan","Elliott","Jesus","Emiliano","Messiah","Gavin","Maddox","Camden","Hayden","Leon","Antonio","Justin","Tucker","Brandon","Kevin","Judah","Finn","King","Brody","Xander","Nicolas","Charlie","Arlo","Emmanuel","Barrett","Felix","Alex","Miguel","Abel","Alan","Beckett","Amari","Karter","Timothy","Abraham","Jesse","Zayden","Blake","Alejandro","Dawson","Tristan","Victor","Avery","Joel","Grant","Eric","Patrick","Peter","Richard","Edward","Andres","Emilio","Colt"
    };

    private static String[] customerURL = {
            "../assets/img/avatars/7.png",
            "../assets/img/avatars/5.png",
            "../assets/img/avatars/6.png"
    };


    private CustomerMocker(){}

    public static List<Customer> getCustomerList(){
        if(customerList == null){
            customerList = new ArrayList<>();
            for(int index = 1; index <= customerCount; index++){
                Customer customer = new Customer();
                int nameIndex = Math.abs(random.nextInt() % customerNames.length);
                customer.setCustomerId(random.nextLong());
                customer.setCustomerName(customerNames[nameIndex]);
                customer.setCustomerPic(customerURL[Math.abs(random.nextInt() % customerURL.length)]);
                double value = Math.random();
                if(value >= 0.5) customer.setCustomerStatus(Status.ACTIVE);
                else customer.setCustomerStatus(Status.AWAY);
                customer.setFollowers((int)(Math.random() * customerCount));
                customerList.add(customer);
            }
            System.out.println(customerList.size() + "Customers created!");
        }
        return customerList;
    }


}
