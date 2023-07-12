package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

    public Long findByName(String name, HashMap<String, Long> myPhoneBook) {
        Long number = null;
        for (Map.Entry<String, Long> item : myPhoneBook.entrySet()) {
            if (name == item.getKey()) {
                number = item.getValue();
                break;
            }
        }
        return number;
    }

    public List printAllNames(HashMap<String, Long> myPhoneBook) {
        List<String> names = new ArrayList<>();
        for (Map.Entry<String, Long> item : myPhoneBook.entrySet()) {
            names.add(item.getKey());
            System.out.println(item.getKey() + ", ");
        }
        return names;
    }
}
