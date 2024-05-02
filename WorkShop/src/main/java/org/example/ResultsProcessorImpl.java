package org.example;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ResultsProcessorImpl implements ResultsProcessor {
    private final CsvToString csvToString;

    public ResultsProcessorImpl(CsvToString csvToString) {
        this.csvToString = csvToString;
    }

    @Override
    public ArrayList<Person> getSortedParticipantsByTime() {
        ArrayList<Person> participants = (ArrayList<Person>) csvToString.csvToString();
        participants.sort(this::compareTime);
        return participants;
    }

    private int compareTime(Person p1, Person p2) {
        String[] time1 = p1.getTime().split(":");
        String[] time2 = p2.getTime().split(":");
        int sec1 = Integer.parseInt(time1[0]) * 60 + Integer.parseInt(time1[1]);
        int sec2 = Integer.parseInt(time2[0]) * 60 + Integer.parseInt(time2[1]);
        return Integer.compare(sec1, sec2);
    }

    @Override
    public ArrayList<Person> sortParticipantsByTime() {
        return null;
    }
}
