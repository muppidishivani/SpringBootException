package com.exception.ex;

import com.exception.entity.Book;
import com.exception.model.BookModel;

public class BookIdAlreadyExistException extends RuntimeException{

	
	private Book duplicateBook;

	public BookIdAlreadyExistException(String message,Book book)
	{
		super(message);
		this.duplicateBook = book;
    }

    public Book getDuplicateBook() {
        return duplicateBook;
    }
    }