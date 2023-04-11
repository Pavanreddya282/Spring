package com.LibraryBook;

import java.util.*;

public interface BookDAO {
	
	List<Book>getAllBooks();
	void saveBook(Book book);

}
