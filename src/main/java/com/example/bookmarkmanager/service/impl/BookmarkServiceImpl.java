package com.example.bookmarkmanager.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bookmarkmanager.dto.BookmarkRequest;
import com.example.bookmarkmanager.dto.BookmarkResponse;
import com.example.bookmarkmanager.entity.Bookmark;
import com.example.bookmarkmanager.exception.NotFoundException;
import com.example.bookmarkmanager.repository.BookmarkRepository;
import com.example.bookmarkmanager.service.BookmarkService;

@Service
public class BookmarkServiceImpl implements BookmarkService{
    private final BookmarkRepository repository;

    public BookmarkServiceImpl(BookmarkRepository repository) {
        this.repository = repository;
    }

    @Override
    public BookmarkResponse create(BookmarkRequest request) {
        Bookmark bookmark = Bookmark.builder()
                .title(request.getTitle())
                .url(request.getUrl())
                .category(request.getCategory())
                .description(request.getDescription())
                .build();   
        Bookmark saved = repository.save(bookmark);
        return toResponse(saved);
    }

    @Override
    public List<BookmarkResponse> getAll() {
        return repository.findAll().stream()
                .map(this::toResponse)
                .toList();
    }

    @Override
    public BookmarkResponse getById(Long id) {
        Bookmark bookmark = repository.findById(id).orElseThrow(() -> new NotFoundException("Bookmark not found"));
        return toResponse(bookmark);
    }
    
    @Override
    public BookmarkResponse update(Long id, BookmarkRequest request) {
        Bookmark bookmark = repository.findById(id).orElseThrow(() -> new NotFoundException("Bookmark not found"));
        
        bookmark.setTitle(request.getTitle());
        bookmark.setUrl(request.getUrl());
        bookmark.setCategory(request.getCategory());
        bookmark.setDescription(request.getDescription());

        repository.save(bookmark);
        return toResponse(bookmark);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    private BookmarkResponse toResponse(Bookmark bookmark) {
        return BookmarkResponse.builder()
                .id(bookmark.getId())
                .title(bookmark.getTitle())
                .url(bookmark.getUrl())
                .category(bookmark.getCategory())
                .description(bookmark.getDescription())
                .build();
    }
}
