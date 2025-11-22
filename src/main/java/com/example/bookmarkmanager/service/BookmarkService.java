package com.example.bookmarkmanager.service;

import java.util.List;

import com.example.bookmarkmanager.dto.BookmarkRequest;
import com.example.bookmarkmanager.dto.BookmarkResponse;

public interface BookmarkService {
    BookmarkResponse create(BookmarkRequest request);

    List<BookmarkResponse> getAll();

    BookmarkResponse getById(Long id);
    
    BookmarkResponse update(Long id, BookmarkRequest request);

    void delete(Long id);
}
