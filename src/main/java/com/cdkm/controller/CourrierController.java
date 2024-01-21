package com.cdkm.controller;

import com.cdkm.entities.Archive;
import com.cdkm.service.ArchiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/courriers")
public class CourrierController {

    private final ArchiveService courrierService;

    @Autowired
    public CourrierController(ArchiveService courrierService) {
        this.courrierService = courrierService;
    }

    @GetMapping
    public List<Archive> getAllCourriers() {
        return courrierService.getAllCourriers();
    }

    @GetMapping("/{id}")
    public Optional<Archive> getCourrierById(@PathVariable Long id) {
        return courrierService.getCourrierById(id);
    }

    @PostMapping("/add")
    public Archive saveCourrier(@RequestBody Archive courrier) {
        return courrierService.saveCourrier(courrier);
    }

    @DeleteMapping("/{id} ")
    public void deleteCourrier(@PathVariable Long id) {
        courrierService.deleteCourrier(id);
    }
}


