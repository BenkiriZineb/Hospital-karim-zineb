package com.econsulting.Hospital.Controllers;

import com.econsulting.Hospital.Entities.Medicament;
import com.econsulting.Hospital.Services.MedicamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicaments")
public class MedicamentController {
    @Autowired
    private MedicamentService medicamentService;

    @GetMapping("/")
    public List<Medicament> getAllMedicaments() {
        return medicamentService.getAllMedicaments();
    }

    @GetMapping("/{id}")
    public Medicament getMedicamentById(@PathVariable Long id) {
        return medicamentService.getMedicamentById(id);
    }

    @PostMapping("/")
    public Medicament saveMedicament(@RequestBody Medicament medicament) {
        return medicamentService.saveMedicament(medicament);
    }

    @DeleteMapping("/{id}")
    public void deleteMedicament(@PathVariable Long id) {
        medicamentService.deleteMedicament(id);
    }
}
