package tnsif.c2tc.jdbc;
import java.sql.*;

public class Demo {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String user = "root";
		String pass = "afzal123";
		String query = "SELECT * FROM jdbcdemo.details;";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,user,pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		/*
		System.out.println("UID of the student is : "+rs.getInt(1));
		System.out.println("Name of the student is : "+rs.getString(2));
		*/
		while(rs.next())
		{
			System.out.println("-------------------------------------------");
			System.out.println("UID of the student is : "+rs.getInt(1));
			System.out.println("Name of the student is : "+rs.getString(2));
			System.out.println("-------------------------------------------");
		}
		st.close();
		con.close();
		
	}

}
