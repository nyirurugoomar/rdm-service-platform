package com.example.rdm_service_platform.dto.request;

import jakarta.validation.constraints.NotNull;

public class ServiceRequestCreateRequest {
    @NotNull
    private Long serviceId;

}
