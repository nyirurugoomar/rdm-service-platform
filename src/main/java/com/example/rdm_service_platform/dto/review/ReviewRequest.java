package com.example.rdm_service_platform.dto.review;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

public class ReviewRequest {
    @Min(1)
    @Max(5)
    private int rating;

    private String comment;
}
