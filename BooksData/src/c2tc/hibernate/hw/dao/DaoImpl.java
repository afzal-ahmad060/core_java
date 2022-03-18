package c2tc.hibernate.hw.dao;

import java.awt.print.Book;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import c2tc.hibernate.hw.entity.Books;


public class DaoImpl implements Dao {

	
	EntityManager em;
	
	public DaoImpl()
	{
		em = Configuration.getEntityManager();
	}
	
	@Override
	public void addBook(Books bk) {
		em.persist(bk);
	}
	
	@Override
	public void startTransaction() {
		em.getTransaction().begin();
		
	}

	@Override
	public void endTransaction() {
		em.getTransaction().commit();
		
	}
	
	@Override
	public Long getBookCount() {
		String query = "Select COUNT(b.id) from Books b";
		TypedQuery<Long> t = em.createQuery(query, Long.class);
		Long count = t.getSingleResult();
		return count;
	}

	@Override
	public Books getBookById(int i) {
		String query = "Select b from Books b where b.id like: id";
		TypedQuery<Books> t =em.createQuery(query,Books.class);
		t.setParameter("id",i);
		Books st= t.getSingleResult();
		return st;
	}

	@Override
	public List<Books> getAllBooks() {
		String query = "Select b from Books b";
		TypedQuery<Books> t = em.createQuery(query, Books.class);
		List<Books> list = t.getResultList();
		return list;
	}

	@Override
	public List<Books> getAuthorBooks(String string) {
		String query = "Select b from Books b where b.author like: name";
		TypedQuery<Books> t = em.createQuery(query, Books.class);
		t.setParameter("name","%"+ string+"%");
		List<Books> list = t.getResultList();
		return list;
	}

	@Override
	public Books getBookByTitle(String string) {
		String query = "Select b from Books b where b.title like: title";
		TypedQuery<Books> t = em.createQuery(query, Books.class);
		t.setParameter("title", "%"+ string+"%");
		Books b = t.getSingleResult();
		return b;
	}

	@Override
	public List<Books> getBooksInPriceRange(double i, double j) {
		String query = "Select b from Books b where b.price between :i and :j";
		TypedQuery<Books> t = em.createQuery(query, Books.class);
		t.setParameter("i", i);
		t.setParameter("j", j);
		List<Books> list = t.getResultList();
		return list;
	}


}
