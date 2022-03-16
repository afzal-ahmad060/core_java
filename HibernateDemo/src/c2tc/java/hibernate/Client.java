package c2tc.java.hibernate;

import c2tc.java.hibernate.entity.Laptop;
//import c2tc.java.hibernate.entity.C2TC_batch;
import c2tc.java.hibernate.entity.Student;
import c2tc.java.hibernate.service.StudentService;
import c2tc.java.hibernate.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		StudentService service = new StudentServiceImpl();
		Student s = new Student();
		Laptop l1 = new Laptop();
		Laptop l2 = new Laptop();
		s.setUid(100);
		s.setName("Afzal Ahmad");
		
		l1.setLid(2);
		l1.setLname("HP");
		
		l2.setLid(3);
		l2.setLname("Lenovo");
		
		s.getLaptop().add(l1);
		s.getLaptop().add(l2);
		
		service.addLaptop(l1);
		service.addLaptop(l2);
		service.addStudent(s);
		
		//C2TC_batch student = new C2TC_batch();
		/*
		student.setUid(2110602);
		student.setName("Yogesh");
		student.setTech_tr("Sanjana");
		student.setSoftSkill_tr("Nitara");
		service.addStudent(student);
		
		
		Student s = new Student();
		s.setUid(2110601);
		s.setName("Afzal Ahmad");
		service.addStudent(s);
		service.updateStudent(s);
		Student st = service.getStudent(2110601);
		System.out.println(st);
		service.deleteStudent(2110601);
		*/
	}

}
