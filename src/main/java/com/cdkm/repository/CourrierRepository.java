package com.cdkm.repository;

import com.cdkm.entities.Courrier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourrierRepository
extends JpaRepository<Courrier, Long> {
    
}
