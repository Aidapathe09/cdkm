package com.cdkm.controller;

import com.cdkm.entities.Archive;
import com.cdkm.service.ArchiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/archives")
public class ArchiveController {

    private final ArchiveService archiveService;

    @Autowired
    public ArchiveController(ArchiveService archiveService) {
        this.archiveService = archiveService;
    }

    @GetMapping
    public String getAllCourriers(Model model) {
        model.addAttribute("archives", archiveService.getAllCourriers());
        return "archives";
    }

    @GetMapping("/{id}")
    public Optional<Archive> getCourrierById(@PathVariable Long id) {
        return archiveService.getCourrierById(id);
    }

    @GetMapping("/new")
    public String createStudentForm(Model model) {
        Archive archive = new Archive();
        model.addAttribute("archive", archive);
        return "create_archive";

    }
    @PostMapping
    public String saveStudent(@ModelAttribute("archive") Archive archive) {
        archiveService.saveCourrier(archive);
        return "redirect:/archives";
    }
    @PostMapping("/add")
    public Archive saveCourrier(@RequestBody Archive courrier , Model model) {
        return archiveService.saveCourrier(courrier);
    }

    @DeleteMapping("/{id} ")
    public void deleteCourrier(@PathVariable Long id) {
        archiveService.deleteCourrier(id);
    }
}


