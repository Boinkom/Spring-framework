package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Sorted {
    private final ResultsProcessor resultsProcessor;

    @Autowired
    public Sorted(ResultsProcessor resultsProcessor) {
        this.resultsProcessor = resultsProcessor;
    }

    public List<Person> sortParticipantsByTime() {
        return resultsProcessor.getSortedParticipantsByTime();
    }
}
