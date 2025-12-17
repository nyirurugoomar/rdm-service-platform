package com.example.rdm_service_platform.dto.request;

import java.time.LocalDateTime;

public class ServiceRequestResponse {
    private Long id;
    private String serviceTitle;
    private String customerUsername;
    private String status;
    private LocalDateTime createdAt;
}
