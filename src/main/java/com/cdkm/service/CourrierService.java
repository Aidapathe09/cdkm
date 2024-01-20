package com.cdkm.service;

import com.cdkm.entities.Courrier;
import com.cdkm.repository.CourrierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourrierService {

    private final CourrierRepository courrierRepository;

    @Autowired
    public CourrierService(CourrierRepository courrierRepository) {
        this.courrierRepository = courrierRepository;
    }

    public Optional<Courrier> getAllCourrierById(Long id) {

        return courrierRepository.findById(id);
    }

    public Courrier saveCourrier(Courrier courrier) {
        return courrierRepository.save(courrier);
    }

    public void deleteCourrier(Long id) {
        courrierRepository.deleteById(id);
    }

    public List<Courrier> getAllCourriers() {
        return null;
    }

    public <Optionnal> Optionnal getCourrierById(Long id) {
        return null;
    }
}
