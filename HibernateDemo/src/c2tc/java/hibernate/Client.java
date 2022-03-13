package c2tc.java.hibernate;

import c2tc.java.hibernate.entity.C2TC_batch;
import c2tc.java.hibernate.entity.Student;
import c2tc.java.hibernate.service.StudentService;
import c2tc.java.hibernate.service.StudentServiceImpl;

@SuppressWarnings("unused")
public class Client {

	public static void main(String[] args) {
		StudentService service = new StudentServiceImpl();
		C2TC_batch student = new C2TC_batch();
		student.setUid(2110602);
		student.setName("Yogesh");
		student.setTech_tr("Sanjana");
		student.setSoftSkill_tr("Nitara");
		service.addStudent(student);
		
		/*
		Student s = new Student();
		s.setUid(2110601);
		s.setName("Afzal Ahmad");
		service.addStudent(s);
		service.updateStudent(s);
		Student s = service.getStudent(2110601);
		System.out.println(s);
		service.deleteStudent(2110601);
		*/
	}

}
