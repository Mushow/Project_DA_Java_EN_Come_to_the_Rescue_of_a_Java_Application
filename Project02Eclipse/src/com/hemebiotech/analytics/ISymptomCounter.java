package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public interface ISymptomCounter {

    /**
     * Counts the occurrences of symptoms and returns a map associating each symptom (String) with its count (Integer).
     *
     * @return a map where keys are symptoms (String) and values are counts (Integer).
     */
    Map<String, Integer> countSymptoms();


    /**
     * Sort a list of symptoms alphabetically from a given HashMap
     *
     * @param listedCountedList a given unsorted HashMap
     * @return a sorted map where keys are symptoms (String) and values are counts (Integer).
     */
    Map<String, Integer> sortSymptoms(Map<String, Integer> listedCountedList);


    /**
     * Setter to the symptomsList attribute
     *
     * @param symptomsList a list of symptoms
     */
    void setSymptomsList(List<String> symptomsList);

}
