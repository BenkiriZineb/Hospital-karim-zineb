package com.econsulting.Hospital.Services;

import com.econsulting.Hospital.Entities.Medicament;

import java.util.List;

public interface MedicamentService {
    List<Medicament> getAllMedicaments();
    Medicament getMedicamentById(Long id);
    Medicament saveMedicament(Medicament medicament);
    void deleteMedicament(Long id);
}