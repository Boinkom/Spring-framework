package org.example;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
@Service
public class CsvToString {
    public List<Person> csvToString() {
        String filePath = "D:\\course\\csv\\data.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            List<Person> people = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                people.add(convertCsvToPerson(line));
            }
            return people;
        } catch (Exception e) {
            System.out.println("Unable to read data from the file: " + filePath);
            e.printStackTrace();
            return null;
        }
    }

    private Person convertCsvToPerson(String line) {
        String[] tokens = line.split(",");
        return new Person(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4]);
    }
}
