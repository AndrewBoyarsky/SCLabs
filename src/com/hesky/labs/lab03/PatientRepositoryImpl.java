/*
 * Copyright © 2018 Apollo Foundation
 */

package com.hesky.labs.lab03;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

public class PatientRepositoryImpl implements PatientRepository {
    private  AtomicLong counter = new AtomicLong();
    private Map<Long, Patient> repository = new ConcurrentHashMap<>();
    @Override
    public boolean add(Patient patient) {
        long id = counter.incrementAndGet();
        patient.setId(id);
        return repository.put(patient.getId(), patient) == null;
    }

    @Override
    public boolean update(Patient patient) {
        Patient existingPatient = repository.get(patient.getId());
        if (existingPatient != null) {
            return repository.put(patient.getId(), patient) != null;

        }
        return false;
    }

    @Override
    public Patient get(long id) {
        return repository.get(id);
    }

    @Override
    public boolean delete(long id) {
        return repository.remove(id) != null;
    }

    @Override
    public List<Patient> find(String diagnosis) {
        return repository.entrySet().stream().filter(entry-> entry.getValue().getDiagnosis().equalsIgnoreCase(diagnosis)).map(Map.Entry::getValue).collect(Collectors.toList());
    }

    @Override
    public List<Patient> find(int medicalCardIdMin, int medicalCardIdMax) {
        return repository.entrySet()
                .stream()
                .filter(entry-> entry.getValue().getMedicalCardId() >= medicalCardIdMin && entry.getValue().getMedicalCardId() <= medicalCardIdMax)
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
    }

    @Override
    public List<Patient> getAll() {
        return new ArrayList<>(repository.values());
    }
}
