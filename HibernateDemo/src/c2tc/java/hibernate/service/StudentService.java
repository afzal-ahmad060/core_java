package c2tc.java.hibernate.service;

import c2tc.java.hibernate.entity.Student;

public interface StudentService {

	void addStudent(Student s);

	void updateStudent(Student s);

	Student getStudent(int uid);

	void deleteStudent(int i);

}
