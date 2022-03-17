package c2tc.java.practice.dao;

import c2tc.java.practice.entity.Courses;
import c2tc.java.practice.entity.Student;

public interface DaoLayer {

	void addStudent(Student st);

	void startTransaction();

	void endTransaction();

	void addCourse(Courses c1);
	

}
