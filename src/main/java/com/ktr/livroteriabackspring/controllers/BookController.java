package com.ktr.livroteriabackspring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ktr.livroteriabackspring.domain.Book;
import com.ktr.livroteriabackspring.domain.dtos.BookDto;
import com.ktr.livroteriabackspring.services.BookService;

/**
 * 
 * @class
 * @category Controllers
 *
 */
@RestController
@RequestMapping(value = "/v1/book")
public class BookController {
    
    @Autowired
    private BookService service;

     /* get all registered files */
     @GetMapping
     public ResponseEntity<List<BookDto>> getll() {
        return null;

     }

     @GetMapping
     public ResponseEntity<BookDto>  getById() {
        return null;

     }

     @PostMapping
     public ResponseEntity<BookDto> create(@RequestBody Book book) {
        return null;
     }
 
     @DeleteMapping(value = "/{id}")
     public ResponseEntity<Void> deleteFile(@PathVariable String id) {
        return null;

     }
 
     @PutMapping(value = "/{id}")
     public ResponseEntity<BookDto> update(@RequestBody Book book, @PathVariable String id) {

         return null;
     }
}
