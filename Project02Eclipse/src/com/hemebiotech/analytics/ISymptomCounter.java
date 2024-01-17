package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public interface ISymptomCounter {

    /**
     * Counts the occurrences of symptoms and returns a map associating each symptom (String) with its count (Integer).
     *
     * @return a map where keys are symptoms (String) and values are counts (Integer).
     */
    Map<String, Integer> countSymptoms(List<String> symptomsList);

}
