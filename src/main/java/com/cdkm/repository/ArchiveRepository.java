package com.cdkm.repository;

import com.cdkm.entities.Archive;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArchiveRepository
extends JpaRepository<Archive, Long> {
    
}
