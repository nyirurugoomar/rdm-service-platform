package com.example.rdm_service_platform.dto.service;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ServiceCreateRequest {
     @NotBlank
    private String title;

    private String description;

    @NotNull
    private BigDecimal price;
}
