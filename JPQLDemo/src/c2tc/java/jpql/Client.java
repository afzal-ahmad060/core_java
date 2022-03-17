package c2tc.java.jpql;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


import c2tc.java.jpql.entity.Student;
import c2tc.java.jpql.service.StudentService;
import c2tc.java.jpql.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) throws ParseException {
		
		Student student = new Student();
		StudentService service = new StudentServiceImpl();
		
		String dateStr1 = "01/01/1890";
		String dateStr2 = "01/01/2020";
		SimpleDateFormat format =new SimpleDateFormat("dd/MM/yyyy");
		Date date1 = format.parse(dateStr1);
		Date date2 = format.parse(dateStr2);
		
		/*
		student.setUid(1000);
		student.setName("Afzal");
		student.setTrainer_name("Sanjana");
		student.setDob(date);
		student.setMarks(98.8f);
		service.addStudent(student);
		*/
		
		System.out.println(service.getCount());
		System.out.println(service.getStudentbyTrainerName("Sanjana"));
		System.out.println(service.getStudentInTheRangeOfDate(date1,date2));
		

	}

}
