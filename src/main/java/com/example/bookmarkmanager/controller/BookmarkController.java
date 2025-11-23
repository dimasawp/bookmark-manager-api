package com.example.bookmarkmanager.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

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

    @PostMapping
    public BookmarkResponse create(@Valid @RequestBody BookmarkRequest request) {
        return service.create(request);
    }

    @GetMapping
    public List<BookmarkResponse> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public BookmarkResponse getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public BookmarkResponse update(@PathVariable Long id, @Valid @RequestBody BookmarkRequest request) {
        return service.update(id, request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}
