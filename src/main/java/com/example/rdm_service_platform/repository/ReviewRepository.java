package com.example.rdm_service_platform.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rdm_service_platform.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

    Optional<Review> findByServiceRequestId(Long requestId);
    
}
