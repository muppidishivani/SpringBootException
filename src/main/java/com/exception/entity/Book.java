package com.exception.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
	@Id

	    private int bookId;
	    private String bookName;
	    private double price;
	    private String author;
		public Book() {
			super();
		}
		public Book(int bookId, String bookName, double price, String author) {
			super();
			this.bookId = bookId;
			this.bookName = bookName;
			this.price = price;
			this.author = author;
		}
		public int getBookId() {
			return bookId;
		}
		public void setBookId(int bookId) {
			this.bookId = bookId;
		}
		public String getBookName() {
			return bookName;
		}
		public void setBookName(String bookName) {
			this.bookName = bookName;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		@Override
		public String toString() {
			return "Book [bookId=" + bookId + ", bookName=" + bookName + ", price=" + price + ", author=" + author
					+ "]";
		}
	    
	    
}
