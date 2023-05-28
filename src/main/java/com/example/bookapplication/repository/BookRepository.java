package com.example.bookapplication.repository;

import com.example.bookapplication.model.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<BookModel, Long> {
    List<BookModel> findBybookName(String bookName);

    List<BookModel> findBySubject(String subject);
}
