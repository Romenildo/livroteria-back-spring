package com.ktr.livroteriabackspring.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ktr.livroteriabackspring.domain.Book;

@Service
public class BookService {
    
    /**
     * Function to create a new File
     * 
     * @param file data to file
     */
    public Book create(Book book) {
        return null;
    }

    public Book findById(String id) {
        return null;
    }

    /**
     * Function to get all 
     * 
     * @return list 
     */
    public List<Book> findAll() {
        return null;
    }

    /**
     * Function to update
     * 
     * @param book 
     */
    public Book update(Book book) {
        return book;

    }

    /**
     * Function to delete
     * 
     * @param fileName
     */
    public void delete(String id) {

    }
}
