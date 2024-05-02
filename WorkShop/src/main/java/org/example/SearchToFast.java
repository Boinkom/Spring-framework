package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class SearchToFast{

    private final ResultsProcessor resultsProcessor;

    @Autowired
    public SearchToFast(ResultsProcessor resultsProcessor) {
        this.resultsProcessor = resultsProcessor;
    }

    public ArrayList<Person> searchToFast(int n, String gender, String distance) {
        ArrayList<Person> fastPerson = new ArrayList<>();
        ArrayList<Person> personList = (ArrayList<Person>) resultsProcessor.getSortedParticipantsByTime();
        for (int i = 0; i <= n; i++) {
            Person person = personList.get(i);
            if (person.getGender().equals(gender) && person.getDistance().equals(distance)) {
                fastPerson.add(person);
            }
        }
        return fastPerson;
    }
}
