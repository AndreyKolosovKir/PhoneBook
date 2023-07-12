package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    public int add(String name, long proneNumber, HashMap<String, Long> myPhoneBook) {
        myPhoneBook.put(name, proneNumber);
        return myPhoneBook.size();
    }

    public String findByNumber(long proneNumber, HashMap<String, Long> myPhoneBook) {
        String name = null;
        for (Map.Entry<String, Long> item : myPhoneBook.entrySet()) {
            if (proneNumber == item.getValue()) {
                name = item.getKey();
                break;
            }
        }
        return name;
    }

    public Long findByName (){
        return null;
    }
}
