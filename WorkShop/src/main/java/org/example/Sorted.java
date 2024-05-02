package org.example;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class Sorted {
    CsvToString person = new CsvToString();
    ArrayList<Person> participants = (ArrayList<Person>) person.csvToString();

    public ArrayList<Person> sortParticipantsByTime() {
        int n = participants.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (compareTime(participants.get(j), participants.get(j + 1)) > 0) {
                    // Обмен элементов
                    Person temp = participants.get(j);
                    participants.set(j, participants.get(j + 1));
                    participants.set(j + 1, temp);
                }
            }
        }
        return participants;
    }

    // Метод для сравнения времени двух участников
    private int compareTime(Person p1, Person p2) {
        String[] time1 = p1.getTime().split(":");
        String[] time2 = p2.getTime().split(":");
        int sec1 = Integer.parseInt(time1[0]) * 60 + Integer.parseInt(time1[1]);
        int sec2 = Integer.parseInt(time2[0]) * 60 + Integer.parseInt(time2[1]);
        return Integer.compare(sec1, sec2);
    }
}
