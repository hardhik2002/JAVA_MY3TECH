package com.javainuse.main;

import com.javainuse.domain.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("Alice", 25, "alice@example.com");

        System.out.println("Name: " + user.getName());
        System.out.println("Age: " + user.getAge());
        System.out.println("Email: " + user.getEmail());
        System.out.println(user);

        user.setAge(26);
        System.out.println("Updated Age: " + user.getAge());
    }
}

