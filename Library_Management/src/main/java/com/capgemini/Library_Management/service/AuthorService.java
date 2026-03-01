package com.capgemini.Library_Management.service;


import java.util.List;

import com.capgemini.Library_Management.entity.Author;

public interface AuthorService {

    Author addAuthor(Author author);

    Author getAuthorById(Long id);

    List<Author> getAllAuthors();

    Author updateAuthor(Long id, Author author);

    void deleteAuthor(Long id);
}