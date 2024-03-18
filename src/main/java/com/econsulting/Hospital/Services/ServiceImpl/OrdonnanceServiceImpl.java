package com.econsulting.Hospital.Services.ServiceImpl;

import com.econsulting.Hospital.Entities.Ordonnance;
import com.econsulting.Hospital.Repositories.OrdonnanceRepository;
import com.econsulting.Hospital.Services.OrdonnanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdonnanceServiceImpl implements OrdonnanceService {
    @Autowired
    private OrdonnanceRepository ordonnanceRepository;

    @Override
    public List<Ordonnance> getAllOrdonnances() {
        return ordonnanceRepository.findAll();
    }

    @Override
    public Ordonnance getOrdonnanceById(Long id) {
        return ordonnanceRepository.findById(id).orElse(null);
    }

    @Override
    public Ordonnance saveOrdonnance(Ordonnance ordonnance) {
        return ordonnanceRepository.save(ordonnance);
    }

    @Override
    public void deleteOrdonnance(Long id) {
        ordonnanceRepository.deleteById(id);
    }
}