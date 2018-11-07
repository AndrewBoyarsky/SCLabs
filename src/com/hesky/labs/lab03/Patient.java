/*
 * Copyright © 2018 Apollo Foundation
 */

package com.hesky.labs.lab03;

public class Patient {
    private long id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String address;
    private String phoneNumber;
    private long medicalCardId;
    private String diagnosis;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getMedicalCardId() {
        return medicalCardId;
    }

    public void setMedicalCardId(long medicalCardId) {
        this.medicalCardId = medicalCardId;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Patient() {
    }

    public Patient(long id, String lastName, String firstName, String middleName, String address, String phoneNumber, long medicalCardId, String diagnosis) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.medicalCardId = medicalCardId;
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", medicalCardId=" + medicalCardId +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }
}
