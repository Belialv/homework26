package com.company;

public class Person {
    String father;
    String mother;
    String name;


    Person(String name) {
        this.name = name;
    }

    Person(String name, String mother, String father) {
        this.name = name;
        this.father = father;
        this.mother = mother;
        System.out.println("Person name is " + name + ", mother is " + mother + ", father is " + father);
    }

}
