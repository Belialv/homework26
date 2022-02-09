package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter person's name, mother's name, father's name: ");
        Person person= new Person(reader.readLine(), reader.readLine(), reader.readLine());
    }
}
