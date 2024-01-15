package com.hemebiotech.analytics;

public class Main {

    /**
     * The application's entry point.
     * @param args an array of command-line arguments for the application.
     */
    public static void main(String[] args) {
        String fileToRead = "Project02Eclipse/symptoms.txt";
        String fileToWrite = "result.out";

        ISymptomReader symptomsReader = new SymptomsReader(fileToRead);
        ISymptomCounter symptomsCounter = new SymptomsCounter();
        ISymptomWriter symptomsWriter = new SymptomsWriter(fileToWrite);

        AnalyticsCounter analyticsCounter = new AnalyticsCounter(symptomsReader, symptomsCounter, symptomsWriter);
        analyticsCounter.main();
    }

}
