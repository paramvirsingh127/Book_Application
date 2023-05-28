package com.example.bookapplication.controller;

import com.example.bookapplication.model.BookModel;
import com.example.bookapplication.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService service;
    @PostMapping("/Books")
    public String AddBook(@RequestBody BookModel book){
        service.AddBook(book);
        return "Book added successfully";
    }
    @GetMapping("/ListBook")
    public List<BookModel> getBoolList(){
        return service.getBoolList();
    }
    @GetMapping("/getname/{bookName}")
    public List<BookModel>getByname(@PathVariable String bookName){
        return service.getByname(bookName);
    }
    @GetMapping("/getsub/{subject}")
    public List<BookModel>getBysub(@PathVariable String subject){
        return service.getBysub(subject);
    }
    @PutMapping("/updatebook/{id}/{bookName}")
    public String updateBook(@PathVariable long id,@PathVariable String bookName){
        service.updateBook(id, bookName);

        return "update book data successfully";
    }
    @DeleteMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable long id){
        service.deleteBook(id);
        return "Delete successfully";
    }
}
