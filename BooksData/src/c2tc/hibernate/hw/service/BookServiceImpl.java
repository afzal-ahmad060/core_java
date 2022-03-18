package c2tc.hibernate.hw.service;

import java.awt.print.Book;
import java.util.List;

import c2tc.hibernate.hw.dao.Dao;
import c2tc.hibernate.hw.dao.DaoImpl;
import c2tc.hibernate.hw.entity.Books;

public class BookServiceImpl implements BookService {

	Dao dao;
	
	public BookServiceImpl()
	{
		dao = new DaoImpl();
	}
	
	@Override
	public void addBook(Books bk) {
		dao.startTransaction();
		dao.addBook(bk);
		dao.endTransaction();
	}
	
	@Override
	public Long getBookCount() {
		return dao.getBookCount();
	}

	@Override
	public Books getBookById(int i) {
		return dao.getBookById(i);
	}

	@Override
	public List<Books> getAllBooks() {
		List<Books> list = dao.getAllBooks();
		return list;
	}

	@Override
	public List<Books> getAuthorBooks(String string) {
		List<Books> list = dao.getAuthorBooks(string);
		return list;
	}

	@Override
	public Books getBookByTitle(String string) {
		return dao.getBookByTitle(string);
	}

	@Override
	public List<Books> getBooksInPriceRange(double i, double j) {
		List<Books> list = dao.getBooksInPriceRange(i,j);
		return list;
	}


}
