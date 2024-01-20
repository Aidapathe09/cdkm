package com.cdkm.controller;

import com.cdkm.entities.Courrier;
import com.cdkm.service.CourrierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/courriers")
public class CourrierController {

    private final CourrierService courrierService;

    @Autowired
    public CourrierController(CourrierService courrierService) {
        this.courrierService = courrierService;
    }

    @GetMapping
    public List<Courrier> getAllCourriers() {
        return courrierService.getAllCourriers();
    }

    @GetMapping("/{id}")
    public Optional<Courrier> getCourrierById(@PathVariable Long id) {
        return courrierService.getCourrierById(id);
    }

    @PostMapping("/add")
    public Courrier saveCourrier(@RequestBody Courrier courrier) {
        return courrierService.saveCourrier(courrier);
    }

    @DeleteMapping("/{id} ")
    public void deleteCourrier(@PathVariable Long id) {
        courrierService.deleteCourrier(id);
    }
}


