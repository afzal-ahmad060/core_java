package c2tc.java.jpql.service;

import java.util.Date;
import java.util.List;

import c2tc.java.jpql.entity.Student;

public interface StudentService {
	
	public void addStudent(Student s);

	public Long getCount();

	public List<Student> getStudentbyTrainerName(String string);

	public List<Student> getStudentInTheRangeOfDate(Date date1, Date date2);

	
	
}