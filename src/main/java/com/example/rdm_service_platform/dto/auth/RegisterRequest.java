package com.example.rdm_service_platform.dto.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class RegisterRequest {
    @NotBlank
    private String username;

    @Email
    private String email;

    @NotBlank
    private String password;

    // CUSTOMER or PROVIDER
    private String role;
}
