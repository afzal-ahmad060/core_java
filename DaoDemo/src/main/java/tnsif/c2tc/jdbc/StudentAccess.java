package tnsif.c2tc.jdbc;

import java.sql.*;

public class StudentAccess {

	public void addStudent(Student s) throws Exception {
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String user = "root";
		String pass = "afzal123";
		String insert_query = "INSERT INTO `jdbcdemo`.`details` VALUES (?,?,?);";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,user,pass);
		PreparedStatement st = con.prepareStatement(insert_query);
		st.setInt(1,s.getUid());
		st.setString(2,s.getName());
		st.setInt(3,s.getAge());
		int rs = st.executeUpdate();
		System.out.println("Number of Rows Updates is : "+rs);
		
		st.close();
		con.close();
	}

	public ResultSet getStudent() throws Exception {
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String user = "root";
		String pass = "afzal123";
		String query = "SELECT * FROM `details`;";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,user,pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		return rs;
	}

}
