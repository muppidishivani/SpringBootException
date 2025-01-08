package com.exception.model;

public class BookModel {

	    private int bookId;
	    private String bookName;
	    private double price;
	    private String author;
		public BookModel() {
			super();
		}
		public BookModel(int bookId, String bookName, double price, String author) {
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
			return "BookModel [bookId=" + bookId + ", bookName=" + bookName + ", price=" + price + ", author=" + author
					+ "]";
		}
	    
}
