package com.example.bookmarkmanager.dto;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ApiResponse<T> {
    private boolean success;
    private String message;
    private int status;
    private LocalDateTime timestamp;
    private T data; 
}
