package com.example.bookmarkmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookmarkmanager.entity.Bookmark;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long>{

}
