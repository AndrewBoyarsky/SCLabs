/*
 * Copyright © 2018 Apollo Foundation
 */

package com.hesky.labs.lab03;

import java.util.List;

public class PatientProcessor {
    private PatientRepository repository;
    private static final String FORMAT = "%3.3s | %10.10s | %10.10s | %4.4s | %8.8s";
    private static final String NO_ENTRIES = "No entries";
    private static final String[] FIELDS = {"id", "name", "diagnosis", "medicalCard", "address"};
    public PatientProcessor(PatientRepository repository) {
        this.repository = repository;
        populateRepository();
    }

    void populateRepository() {
        repository.add(PatientConstants.PATIENT1);
        repository.add(PatientConstants.PATIENT2);
        repository.add(PatientConstants.PATIENT3);
    }

    public void print(List<Patient> patients) {
        printHeader(patients);
        patients.forEach(patient -> {
            System.out.println(String.format(FORMAT, String.valueOf(patient.getId()), patient.getFirstName(), patient.getDiagnosis(),
                    String.valueOf(patient.getMedicalCardId()), patient.getAddress()));
        });
    }

    private void printHeader(List<Patient> patients) {
        System.out.println(String.format(FORMAT, FIELDS));
        if (patients.isEmpty()) {
            System.out.println(NO_ENTRIES);
        }
    }

    public void findAndPrint(String diagnosis) {
        List<Patient> patients = repository.find(diagnosis);
        print(patients);
    }

    public void findAndPrint(int medicalCardMinNumber, int medicalCardMaxNumber) {
        List<Patient> patients = repository.find(medicalCardMinNumber, medicalCardMaxNumber);
        print(patients);
    }

    public void printAll() {
        print(repository.getAll());
    }
}
