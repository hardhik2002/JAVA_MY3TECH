package java1;

import java1.java2.Person;  // Import Person from the java2 package

public class main {
    public static void main(String[] args) {
        Person john;
        john = new Person();
        john.name = "john pauly";
        john.age = 37;

        Person mary = new Person();
        mary.name = "mary yellow";
        mary.age = 75;

        mary.birthday();
        john.birthday();
    }
}
