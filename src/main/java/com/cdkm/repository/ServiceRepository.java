package com.cdkm.repository;

import com.cdkm.service.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository
extends JpaRepository<Service, Long> {
}
