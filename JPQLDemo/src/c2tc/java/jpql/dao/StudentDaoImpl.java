package c2tc.java.jpql.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import c2tc.java.jpql.entity.Student;

public class StudentDaoImpl implements StudentDao {

	EntityManager em;
	
	public StudentDaoImpl()
	{
		em = Configuration.getEntityManager();
	}
	
	@Override
	public void addStudent(Student s) {
		em.persist(s);
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
	public Long getCount() {
		String query = "Select COUNT(s.uid) from Student s";
		TypedQuery<Long> t = em.createQuery(query,Long.class);
		Long count = t.getSingleResult();
		return count;
	}

	@Override
	public List<Student> getStudentbyTrainerName(String string) {
		String query = "Select s from Student s where s.trainer_name like: name";
		TypedQuery<Student> t =em.createQuery(query,Student.class);
		t.setParameter("name","%"+ string+"%");
		List<Student> st= t.getResultList();
		return st;
	}

	@Override
	public List<Student> getStudentbyTrainerName(Date date1, Date date2) {
		String query = "Select s from Student s where s.dob between : date1 and : date2";
		TypedQuery<Student> t =em.createQuery(query,Student.class);
		t.setParameter("date1",date1);
		t.setParameter("date2",date2);
		List<Student> st= t.getResultList();
		return st;
	}

}
