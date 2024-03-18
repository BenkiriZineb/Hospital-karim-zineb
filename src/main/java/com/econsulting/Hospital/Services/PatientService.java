package com.econsulting.Hospital.Services;

import com.econsulting.Hospital.Entities.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> getAllPatients();
    Patient getPatientById(Long id);
    Patient savePatient(Patient patient);
    void deletePatient(Long id);
}