package c2tc.java.jpql.dao;

import java.util.Date;
import java.util.List;

import c2tc.java.jpql.entity.Student;

public interface StudentDao {

	void addStudent(Student s);

	void startTransaction();

	void endTransaction();

	Long getCount();

	List<Student> getStudentbyTrainerName(String string);

	List<Student> getStudentbyTrainerName(Date date1, Date date2);

}
