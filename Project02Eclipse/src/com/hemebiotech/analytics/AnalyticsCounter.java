package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * @author mushow
 */
public class AnalyticsCounter {

    private final ISymptomReader iSymptomReader;
    private final ISymptomCounter iSymptomCounter;
    private final ISymptomWriter iSymptomWriter;

    /**
     * Constructor of AnalyticsCounter to instantiate the interfaces
     * @param iSymptomReader an interface of SymptomsReader
     * @param iSymptomCounter an interface of SymptomsCounter
     * @param iSymptomWriter an interface of SymptomsWriter
     */

    public AnalyticsCounter(ISymptomReader iSymptomReader, ISymptomCounter iSymptomCounter, ISymptomWriter iSymptomWriter) {
        this.iSymptomReader = iSymptomReader;
        this.iSymptomCounter = iSymptomCounter;
        this.iSymptomWriter = iSymptomWriter;
    }

    public void main() {
		List<String> symptomsList = this.iSymptomReader.getSymptoms();
        this.iSymptomCounter.setSymptomsList(symptomsList);

		//Count the occurrences of symptoms and sort the list
		Map<String, Integer> listedCountedList = iSymptomCounter.countSymptoms();

		//Write the Map of symptoms/count to the file
		this.iSymptomWriter.writeSymptoms(listedCountedList);
	}

}
