package com.cdkm.repository;

import com.cdkm.entities.Documentation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentationRepository
extends JpaRepository<Documentation, Long> {
    
}
