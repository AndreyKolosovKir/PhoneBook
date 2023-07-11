package org.example;

import java.util.HashMap;

public class PhoneBook {
    protected HashMap<String, Long> myPhoneBook = new HashMap<>();

    public int add(String name, long proneNumber) {
        myPhoneBook.put(name, proneNumber);
        return myPhoneBook.size();
    }
}
