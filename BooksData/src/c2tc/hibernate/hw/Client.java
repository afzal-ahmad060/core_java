package c2tc.hibernate.hw;

import c2tc.hibernate.hw.entity.Books;
import c2tc.hibernate.hw.service.BookService;
import c2tc.hibernate.hw.service.BookServiceImpl;

public class Client {
	public static void main(String[] args) {
		BookService service = new BookServiceImpl();
		
		//Books bk = new Books();
		//bk.setId(1);
		//bk.setTitle("Happy Potter");
		//bk.setAuthor("J.K. Rowling");
		//bk.setPrice(1200);
		
	    //service.addBook(bk);
		
	    
		System.out.println("************Listing total number of books*************");
		System.out.println("Total books : "+service.getBookCount());
		
		System.out.println("************Listing book with id 105*************");
		System.out.println("Book with ID 105 : "+service.getBookById(105));
		
		System.out.println();
		
		System.out.println("************Listing All books*************");
		for(Books book:service.getAllBooks()) {
			System.out.println(book);
		}
		
		System.out.println();
		
		System.out.println("************Listing book written by Danny Coward*************");
		for(Books book:service.getAuthorBooks("Danny Coward") ) {
			System.out.println(book);
		}
		
		System.out.println();
		
		System.out.println("************Listing book on Android*************");
		System.out.println("Book with Title Android : "+service.getBookByTitle("Android"));
		
		System.out.println();
		
		System.out.println("************Listing All books between 500 and 600*************");
		for(Books book:service.getBooksInPriceRange(500.0, 600.0)) {
			System.out.println(book);
		}
		
	}
}
