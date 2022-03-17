package c2tc.java.practice.dao;

import javax.persistence.EntityManager;

import c2tc.java.practice.entity.Courses;
import c2tc.java.practice.entity.Student;

public class DaoLayerImpl implements DaoLayer {

	EntityManager em;
	
	public DaoLayerImpl()
	{
		em = Configuration.getEntityManager();
	}
	
	@Override
	public void addStudent(Student st) {
		em.persist(st);
		
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
	public void addCourse(Courses c1) {
		em.persist(c1);
		
	}
	
	

}
