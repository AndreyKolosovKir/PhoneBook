package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Long> myPhoneBook = new HashMap<>();
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Karl1", 89995556688L, myPhoneBook);
        String name = phoneBook.findByNumber(89995556688L, myPhoneBook);
        System.out.println(name);
    }
}