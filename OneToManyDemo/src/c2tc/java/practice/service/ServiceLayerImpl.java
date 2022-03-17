package c2tc.java.practice.service;

import c2tc.java.practice.dao.DaoLayer;
import c2tc.java.practice.dao.DaoLayerImpl;
import c2tc.java.practice.entity.Courses;
import c2tc.java.practice.entity.Student;

public class ServiceLayerImpl implements ServiceLayer {

	DaoLayer dl;
	public ServiceLayerImpl()
	{
		dl = new DaoLayerImpl();
	}
	
	
	@Override
	public void addStudent(Student st) {
		dl.startTransaction();
		dl.addStudent(st);
		dl.endTransaction();
		
	}


	@Override
	public void addCourse(Courses c1) {
		dl.startTransaction();
		dl.addCourse(c1);
		dl.endTransaction();
		
	}

}
