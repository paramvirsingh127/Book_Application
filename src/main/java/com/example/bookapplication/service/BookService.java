package com.example.bookapplication.service;

import com.example.bookapplication.model.BookModel;
import com.example.bookapplication.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository repository;
    public String AddBook(BookModel book){
        repository.save(book);
        return "Book added successfully";
    }
    public List<BookModel> getBoolList(){
        return repository.findAll();
    }
    public List<BookModel>getByname(String bookName){
        return repository.findBybookName(bookName);
    }
    public List<BookModel>getBysub(String subject){
        return repository.findBySubject(subject);
    }

    public String updateBook(long id, String bookName) {
        BookModel book=repository.getById(id);
        book.setBookName(bookName);
        repository.save(book);
        return "update book data successfully";
    }
    public String deleteBook(long id){
        repository.deleteById(id);
        return "Delete successfully";
    }
}
