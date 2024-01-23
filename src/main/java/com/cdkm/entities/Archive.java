package com.cdkm.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Archive {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomDocument;
    private LocalDate dateDepart;
    private LocalDate dateArrive;
    private String observation;
    private String objet;
    private String expediteur;
    private String typeArchive;
    @Lob
    @Column(length = 1000000)
    private byte[] fichier;
}
