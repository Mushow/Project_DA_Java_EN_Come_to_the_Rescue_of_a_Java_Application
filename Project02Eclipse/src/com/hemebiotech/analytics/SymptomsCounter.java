package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class SymptomsCounter implements ISymptomCounter {

    private List<String> symptomsList;

    /**
     * Count the symptoms from the list.
     * @return a Map of String/Integer representing Symptoms/Count.
     */
    @Override
    public Map<String, Integer> countSymptoms() {
        Map<String, Integer> symptomCountMap = new HashMap<>();
        for (String symptom : symptomsList) {
            symptomCountMap.put(symptom, symptomCountMap.getOrDefault(symptom, 0) + 1);
        }

        symptomCountMap = sortSymptoms(symptomCountMap);
        return symptomCountMap;
    }

    /**
     * Sort a Map using TreeMap.
     * @param originalMap an unsorted Map.
     * @return a sorted Map of String/Integer representing Symptoms/Count.
     */
    @Override
    public Map<String, Integer> sortSymptoms(Map<String, Integer> originalMap) {
        return new TreeMap<>(originalMap);
    }

    /**
     * Set the list of symptoms.
     * @param symptomsList a list of symptoms.
     */
    @Override
    public void setSymptomsList(List<String> symptomsList) {
        this.symptomsList = symptomsList;
    }
}
