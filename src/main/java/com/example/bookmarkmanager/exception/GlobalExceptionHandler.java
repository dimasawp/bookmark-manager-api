package com.example.bookmarkmanager.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.bookmarkmanager.dto.ApiResponse;
import com.example.bookmarkmanager.dto.ApiResponseFactory;

@RestControllerAdvice
public class GlobalExceptionHandler {
    // 404
    @ExceptionHandler(NotFoundException.class)
    public ApiResponse<?> handleNotfound(NotFoundException ex) {
        return ApiResponseFactory.error(ex.getMessage(), HttpStatus.NOT_FOUND.value());
    } 

    // 400
    @ExceptionHandler(BadRequestException.class)
    public ApiResponse<?> handleBadRequest(BadRequestException ex) {
        return ApiResponseFactory.error(ex.getMessage(), HttpStatus.BAD_REQUEST.value());
    }

    // Validation errors (Spring @Valid)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ApiResponse<?> handleValidation(MethodArgumentNotValidException ex) {
        String errorMessage = ex.getBindingResult().getFieldError().getDefaultMessage();
        return ApiResponseFactory.error(errorMessage, HttpStatus.BAD_REQUEST.value());
    }

    // Catch all fallback error
    @ExceptionHandler(Exception.class)
    public ApiResponse<?> handleOther(Exception ex) {
        return ApiResponseFactory.error("Internal Server Error", HttpStatus.INTERNAL_SERVER_ERROR.value());
    }
}
