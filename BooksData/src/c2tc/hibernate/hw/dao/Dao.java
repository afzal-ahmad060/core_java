package c2tc.hibernate.hw.dao;

import java.awt.print.Book;
import java.util.List;

import c2tc.hibernate.hw.entity.Books;

public interface Dao {

	void addBook(Books bk);
	
	Long getBookCount();

	void startTransaction();

	void endTransaction();

	Books getBookById(int i);

	List<Books> getAllBooks();

	List<Books> getAuthorBooks(String string);

	Books getBookByTitle(String string);

	List<Books> getBooksInPriceRange(double i, double j);


}
