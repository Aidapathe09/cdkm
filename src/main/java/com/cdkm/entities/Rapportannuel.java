package com.cdkm.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Rapportannuel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Listesdocs;


}
