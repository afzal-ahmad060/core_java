package tnsif.c2tc.jdbc;
import java.sql.ResultSet;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		//Student s = new Student();
		//s.setUid(606);
		//s.setName("Frank");
		//s.setAge(22);
		StudentAccess sa = new StudentAccess();
		//sa.addStudent(s);
		ResultSet rs = sa.getStudent();
		
		while(rs.next())
		{
			System.out.println("-------------------------------------------");
			System.out.println("UID of the student is : "+rs.getInt(1));
			System.out.println("Name of the student is : "+rs.getString(2));
			System.out.println("Age of the student is : "+rs.getInt(3));
			System.out.println("-------------------------------------------");
		}
		/*
		String name = sc.nextLine();
		int uid = sc.nextInt();
		sa.updateStudent(uid,name);
		System.out.println("The Student details are Updated");
		*/
		
		int uid = sc.nextInt();
		sa.deleteStudent(uid);
		System.out.println("The Student details are Updated");
		
	}

}
