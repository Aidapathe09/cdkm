package com.cdkm.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Courrier {
    private String dateArrivee;
    private String nomExpediteur;
    private String objet;
    private String piecesJointes;
    private String observation;
    private String repartition;
}

