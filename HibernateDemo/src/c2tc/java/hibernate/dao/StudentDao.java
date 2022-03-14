package c2tc.java.hibernate.dao;

import c2tc.java.hibernate.entity.Laptop;
import c2tc.java.hibernate.entity.Student;

public interface StudentDao {

	void addStudent(Student s);

	void startTransaction();

	void endTransaction();

	void updateStudent(Student s);

	Student getStudent(int uid);

	void deleteStudent(int i);

	void addLaptop(Laptop l);

}
