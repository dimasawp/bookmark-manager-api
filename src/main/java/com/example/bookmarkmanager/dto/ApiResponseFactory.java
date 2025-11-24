package com.example.bookmarkmanager.dto;

import java.time.LocalDateTime;

public class ApiResponseFactory {
    public static <T> ApiResponse<T> success(String message, int status, T data) {
        return ApiResponse.<T>builder()
                .success(true)
                .message(message)
                .status(status)
                .timestamp(LocalDateTime.now())
                .data(data)
                .build();
    }

    public static ApiResponse<?> error(String message, int status) {
        return ApiResponse.builder()
                .success(false)
                .message(message)
                .status(status)
                .timestamp(LocalDateTime.now())
                .data(null)
                .build();
    } 
}
