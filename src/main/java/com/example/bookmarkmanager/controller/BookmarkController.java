package com.example.bookmarkmanager.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.example.bookmarkmanager.dto.ApiResponse;
import com.example.bookmarkmanager.dto.ApiResponseFactory;
import com.example.bookmarkmanager.dto.BookmarkRequest;
import com.example.bookmarkmanager.dto.BookmarkResponse;
import com.example.bookmarkmanager.service.BookmarkService;

import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/api/bookmarks")
public class BookmarkController {
    private final BookmarkService service;

    public BookmarkController(BookmarkService service) {
        this.service = service;
    }

    @GetMapping
    public ApiResponse<List<BookmarkResponse>> getAll() {
        return ApiResponseFactory.success("Bookmarks retrieved successfully", 200, service.getAll());
    }
    
    @GetMapping("/{id}")
    public ApiResponse<BookmarkResponse> getById(@PathVariable Long id) {
        return ApiResponseFactory.success("Bookmark retrieved", 200, service.getById(id));
    }
    
    @PostMapping
    public ApiResponse<BookmarkResponse> create(@Valid @RequestBody BookmarkRequest request) {
        return ApiResponseFactory.success("Bookmark created", 201, service.create(request));
    }

    @PutMapping("/{id}")
    public ApiResponse<BookmarkResponse> update(@PathVariable Long id, @Valid @RequestBody BookmarkRequest request) {
        return ApiResponseFactory.success("Bookmark updated", 200, service.update(id, request));
    }

    @DeleteMapping("/{id}")
    public ApiResponse<String> delete(@PathVariable Long id){
        service.delete(id);
        return ApiResponseFactory.success("Bookmark deleted", 200, null);
    }
}
