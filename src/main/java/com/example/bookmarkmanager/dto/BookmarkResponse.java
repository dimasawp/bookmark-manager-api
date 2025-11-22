package com.example.bookmarkmanager.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BookmarkResponse {
    private Long id;
    private String title;
    private String url;
    private String category;
    private String description;
}
