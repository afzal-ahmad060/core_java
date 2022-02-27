package tnsif.c2tc.jdbc;
import java.sql.*;
import java.util.*;

public class Demo {

	public static void main(String[] args) throws Exception {
		//Scanner sc = new Scanner(System.in);
		//String name = sc.nextLine();
		//int uid = sc.nextInt();
		//int age = sc.nextInt();
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String user = "root";
		String pass = "afzal123";
		//String select_query = "SELECT * FROM jdbcdemo.details;";
		//String insert_query = "INSERT INTO `jdbcdemo`.`details` VALUES (?,?,?);";
		//String delete_query = "DELETE FROM `jdbcdemo`.`details` WHERE ('uid' = '605');";
		String update_query = "UPDATE `details` SET `name` = 'Afzal' WHERE ('name' = 'Afzal Ahmad');";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,user,pass);
		/*
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(select_query);
		
		System.out.println("UID of the student is : "+rs.getInt(1));
		System.out.println("Name of the student is : "+rs.getString(2));
		
		while(rs.next())
		{
			System.out.println("-------------------------------------------");
			System.out.println("UID of the student is : "+rs.getInt(1));
			System.out.println("Name of the student is : "+rs.getString(2));
			System.out.println("-------------------------------------------");
		}
		
		PreparedStatement st1 = con.prepareStatement(insert_query);
		st1.setInt(1,uid);
		st1.setString(2,name);
		st1.setInt(3,age);
		int rs1 = st1.executeUpdate();
		System.out.println("Number of Rows Updates is : "+rs1);
		//st.close();
		//st1.close();
		
		Statement st2 = con.createStatement();
		int rs2 = st2.executeUpdate(delete_query);
		System.out.println("Number of Rows Updates is : "+rs2);
		*/
		Statement st = con.createStatement();
		int rs = st.executeUpdate(update_query);
		System.out.println("Number of Rows Updates is : "+rs);
		con.close();
		
	}

}
