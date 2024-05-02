package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        var searchToFast = new AnnotationConfigApplicationContext(ManagerConfig.class);
        var search = searchToFast.getBean(SearchToFast.class);
        ArrayList<Person> personSet = search.searchToFast(9, "M", "5");

        for (Person person : personSet) {
            System.out.println(person);
        }
    }
}