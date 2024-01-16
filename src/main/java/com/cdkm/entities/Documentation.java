package com.cdkm.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Documentation {
    private String Arrete;
    private String Decision;
    private String Demandes;

}
