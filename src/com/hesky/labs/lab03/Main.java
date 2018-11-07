/*
 * Copyright © 2018 Apollo Foundation
 */

package com.hesky.labs.lab03;

public class Main {
    public static void main(String[] args) {
        PatientRepository repository = new PatientRepositoryImpl();
        PatientProcessor patientProcessor = new PatientProcessor(repository);
        patientProcessor.printAll();
        patientProcessor.findAndPrint("Diagnos1");
        patientProcessor.findAndPrint(105, 112);
    }
}
