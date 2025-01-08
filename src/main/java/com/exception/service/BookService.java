package com.exception.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.exception.entity.Book;
import com.exception.ex.BookIdAlreadyExistException;
import com.exception.model.BookModel;
import com.exception.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	BookRepository repository;
	
	public Book saveBook(BookModel bookModel)
	{ Book book = new Book();
    book.setBookId(bookModel.getBookId());
    book.setBookName(bookModel.getBookName());
    book.setPrice(bookModel.getPrice());
    book.setAuthor(bookModel.getAuthor());

   
    if (repository.existsById(book.getBookId())) {
      
        throw new BookIdAlreadyExistException("Book with ID " + book.getBookId() + " already exists.", book);
    }

   
    return repository.save(book);

	}
}
