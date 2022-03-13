package c2tc.java.hibernate.service;

import c2tc.java.hibernate.dao.StudentDao;
import c2tc.java.hibernate.dao.StudentDaoImpl;
import c2tc.java.hibernate.entity.Student;

public class StudentServiceImpl implements StudentService{
	StudentDao sd;
	public StudentServiceImpl()
	{
		sd = new StudentDaoImpl();
	}
	
	@Override
	public void addStudent(Student s) {
		sd.startTransaction();
		sd.addStudent(s);
		sd.endTransaction();
	}

	@Override
	public void updateStudent(Student s) {
		sd.startTransaction();
		sd.updateStudent(s);
		sd.endTransaction();
		
	}

	@Override
	public Student getStudent(int uid) {
		Student s = sd.getStudent(uid);
		return s;
	}

	@Override
	public void deleteStudent(int i) {
		sd.startTransaction();
		sd.deleteStudent(i);
		sd.endTransaction();
		
	}
	
}
