package org.example;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        user1.stampaInfo();

        User user2 = new User();
        user2.setName("Claudio");
        user2.setAge(30);
        user2.stampaInfo();
    }
}