package com.LibraryBook;

import java.util.*;

public class BookService {
	
	private BookDAO bookDao;

	public void setBookDao(BookDAO bookDao) {
		this.bookDao = bookDao;
	}
	
	public void addBook(Book book) {
		bookDao.saveBook(book);
	}
	
	public List<Book> getAllBooks(){
		return bookDao.getAllBooks();
	}

}
