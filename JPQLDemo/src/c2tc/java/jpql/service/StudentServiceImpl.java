package c2tc.java.jpql.service;

import java.util.Date;
import java.util.List;

import c2tc.java.jpql.dao.StudentDao;
import c2tc.java.jpql.dao.StudentDaoImpl;
import c2tc.java.jpql.entity.Student;

public class StudentServiceImpl implements StudentService {

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
	public Long getCount() {
		return sd.getCount();
	}

	@Override
	public List<Student> getStudentbyTrainerName(String string) {
		List<Student> list=sd.getStudentbyTrainerName(string);
		return list;
	}

	@Override
	public List<Student> getStudentInTheRangeOfDate(Date date1, Date date2) {
		List<Student> list=sd.getStudentbyTrainerName(date1, date2);
		return null;
	}

}

