package com.example.rdm_service_platform.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rdm_service_platform.model.Service;

public interface ServiceRepository extends JpaRepository<Service, Long> {
    List<Service> findByProviderId(Long providerId);
    
}
