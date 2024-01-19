package org.example.Controller;


import org.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;

@RestController
@RequestMapping("book")
public class BookController {
    @Autowired
    BookService service;

    public void addBook(@RequestBody Book book){
        service.addBook(book);


    }
}
