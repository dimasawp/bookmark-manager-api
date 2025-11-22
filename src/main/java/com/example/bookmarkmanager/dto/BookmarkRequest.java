package com.example.bookmarkmanager.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class BookmarkRequest {

    @NotBlank
    private String title;

    @NotBlank
    private String url;

    private String category;
    private String description;
}
