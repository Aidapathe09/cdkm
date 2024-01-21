package com.cdkm.service;

import com.cdkm.entities.Archive;
import com.cdkm.repository.ArchiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArchiveService {

    private final ArchiveRepository archiveRepository;

    @Autowired
    public ArchiveService(ArchiveRepository archiveRepository) {
        this.archiveRepository = archiveRepository;
    }

    public Optional<Archive> getAllCourrierById(Long id) {

        return archiveRepository.findById(id);
    }

    public Archive saveCourrier(Archive courrier) {
        return archiveRepository.save(courrier);
    }

    public void deleteCourrier(Long id) {
        archiveRepository.deleteById(id);
    }

    public List<Archive> getAllCourriers() {
        return null;
    }

    public <Optionnal> Optionnal getCourrierById(Long id) {
        return null;
    }
}
