package com.econsulting.Hospital.Services;

import com.econsulting.Hospital.Entities.Doctor;

import java.util.List;

public interface DoctorService {
    List<Doctor> getAllDoctors();
    Doctor getDoctorById(Long id);
    Doctor saveDoctor(Doctor doctor);
    void deleteDoctor(Long id);
}