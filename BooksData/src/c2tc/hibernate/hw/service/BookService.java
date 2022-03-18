package c2tc.hibernate.hw.service;

import java.awt.print.Book;
import java.util.List;

import c2tc.hibernate.hw.entity.Books;

public interface BookService {

	void addBook(Books bk);
	
	Long getBookCount();

	Books getBookById(int i);

	List<Books> getAllBooks();

	List<Books> getAuthorBooks(String string);

	Books getBookByTitle(String string);

	List<Books> getBooksInPriceRange(double d, double e);

}
