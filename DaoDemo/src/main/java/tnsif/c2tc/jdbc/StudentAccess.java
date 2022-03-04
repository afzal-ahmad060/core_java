package tnsif.c2tc.jdbc;

import java.sql.*;

public class StudentAccess {

	public Connection setup() throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String user = "root";
		String pass = "afzal123";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,user,pass);
		return con;
		
	}
	public void addStudent(Student s) throws Exception {
		Connection con = setup();
		String insert_query = "INSERT INTO `jdbcdemo`.`details` VALUES (?,?,?);";
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
		Connection con = setup();
		String query = "SELECT * FROM `details`;";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		return rs;
	}

	public void updateStudent(int uid, String name) throws Exception {
		Connection con = setup();
		String query = "UPDATE `jdbcdemo`.`details` SET `name` = ? WHERE(uid = ?);";
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(2, uid);
		st.setString(1, name);
		st.executeUpdate();
		st.close();
		con.close();
	}
	
	
	public void deleteStudent(int uid) throws Exception {
		Connection con = setup();
		String query = "DELETE FROM `jdbcdemo`.`details` WHERE (uid = ?);";
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1, uid);
		st.executeUpdate();
		st.close();
		con.close();
	}
}
