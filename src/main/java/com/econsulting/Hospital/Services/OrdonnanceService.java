package com.econsulting.Hospital.Services;

import com.econsulting.Hospital.Entities.Ordonnance;

import java.util.List;

public interface OrdonnanceService {
    List<Ordonnance> getAllOrdonnances();
    Ordonnance getOrdonnanceById(Long id);
    Ordonnance saveOrdonnance(Ordonnance ordonnance);
    void deleteOrdonnance(Long id);
}