package org.example;

import java.util.ArrayList;

public interface ResultsProcessor {
    ArrayList<Person> getSortedParticipantsByTime();

    public ArrayList<Person> sortParticipantsByTime();
}
