package com.example.reviewmicroservice.Reviews.DTO;

import lombok.Data;

@Data
public class ReviewMessage {
    private Long id;
    private String title;
    private String description;
    private double rating;
    private Long companyId;

}
