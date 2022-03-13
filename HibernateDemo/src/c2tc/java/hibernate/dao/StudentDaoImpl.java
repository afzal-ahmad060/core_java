package c2tc.java.hibernate.dao;

import javax.persistence.EntityManager;

import c2tc.java.hibernate.entity.Student;

public class StudentDaoImpl implements StudentDao{

	EntityManager entityManager;
	
	public StudentDaoImpl() {
		entityManager = Configuration.getEntityManager();
	}
	
	@Override
	public void addStudent(Student s) {
		entityManager.persist(s);
	}
	
	@Override
	public void updateStudent(Student s) {
		entityManager.merge(s);
	}

	@Override
	public void startTransaction() {
		entityManager.getTransaction().begin();
		
	}

	@Override
	public void endTransaction() {
		entityManager.getTransaction().commit();
		
	}

	@Override
	public Student getStudent(int uid) {
		Student s = entityManager.find(Student.class,uid);
		return s;
	}

	@Override
	public void deleteStudent(int uid) {
		Student s = entityManager.find(Student.class,uid);
		entityManager.remove(s);
		
	}
	
}
