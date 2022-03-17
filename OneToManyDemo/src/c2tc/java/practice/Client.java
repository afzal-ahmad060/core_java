package c2tc.java.practice;

import c2tc.java.practice.entity.Courses;
import c2tc.java.practice.entity.Student;
import c2tc.java.practice.service.ServiceLayer;
import c2tc.java.practice.service.ServiceLayerImpl;

public class Client {

	public static void main(String[] args) {
		ServiceLayer service = new ServiceLayerImpl();
		Student st = new Student();
		st.setUid(111);
		st.setName("ABC");
		
		Courses c1 = new Courses();
		c1.setCid(1);
		c1.setCname("IT");
		
		Courses c2 = new Courses();
		c2.setCid(2);
		c2.setCname("COMPUTER SCIENCEs");
		
		st.getCourse().add(c1);
		st.getCourse().add(c2);
		
		
		service.addCourse(c1);
		service.addCourse(c2);
		service.addStudent(st);
		
	}

}
