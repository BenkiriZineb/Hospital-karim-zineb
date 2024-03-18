package com.econsulting.Hospital.Controllers;

import com.econsulting.Hospital.Entities.Ordonnance;
import com.econsulting.Hospital.Services.OrdonnanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ordonnances")
public class OrdonnanceController {
    @Autowired
    private OrdonnanceService ordonnanceService;

    @GetMapping("/")
    public List<Ordonnance> getAllOrdonnances() {
        return ordonnanceService.getAllOrdonnances();
    }

    @GetMapping("/{id}")
    public Ordonnance getOrdonnanceById(@PathVariable Long id) {
        return ordonnanceService.getOrdonnanceById(id);
    }

    @PostMapping("/")
    public Ordonnance saveOrdonnance(@RequestBody Ordonnance ordonnance) {
        return ordonnanceService.saveOrdonnance(ordonnance);
    }

    @DeleteMapping("/{id}")
    public void deleteOrdonnance(@PathVariable Long id) {
        ordonnanceService.deleteOrdonnance(id);
    }
}
