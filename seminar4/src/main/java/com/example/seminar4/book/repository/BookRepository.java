package com.example.seminar4.book.repository;

import com.example.seminar4.book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}