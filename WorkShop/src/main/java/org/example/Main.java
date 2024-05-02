package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        SearchToFast search = new SearchToFast();
        ArrayList<Person> personSet = search.searchToFast(9, "M", "5");

        for (Person person : personSet) {
            System.out.println(person);
        }
    }
}