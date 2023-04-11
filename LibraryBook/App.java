package com.LibraryBook;

import java.util.*;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	BookService obj = (BookService) context.getBean("Library");
    	
    	Book book = new Book();
    	
    	book.setTitle("My Name");
    	book.setAuthor("Pavan");
    	
    	List<Book> b1=obj.getAllBooks();
    	
    	System.out.println(b1);
    }
}
