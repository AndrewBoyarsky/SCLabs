package com.hesky.labs.lab03;

import java.util.List;

public interface PatientRepository {
    boolean add(Patient patient);

    boolean update(Patient patient);

    Patient get(long id);

    boolean delete(long id);

    List<Patient> find(String diagnosis);

    List<Patient> find(int medicalCardIdMin, int medicalCardIdMax);

    List<Patient> getAll();
}
