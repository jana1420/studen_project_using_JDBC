package students_project;

import java.rmi.StubNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class dataconnection_student {
	
	Connection getconnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/newdatabase","root","root");
	}
	
	int insertdata(student_details s1) throws ClassNotFoundException, SQLException
	{
		Connection con=getconnection();
		PreparedStatement pst=con.prepareStatement("insert into student values(?,?,?,?,?)");
		pst.setInt(1, s1.getid());
		pst.setString(2, s1.getname());
		pst.setString(3, s1.getcity());
		pst.setInt(4, s1.getclasses());
		pst.setDouble(5, s1.getpercentage());
		
		return pst.executeUpdate();
	}
	int deletedata(int id) throws SQLException, ClassNotFoundException
	{
		Connection con=getconnection();
		PreparedStatement pst=con.prepareStatement("delete from employee where id=?");
		pst.setInt(1, id);
		return pst.executeUpdate();
		
	}
	
	student_details fetchbyid(int id) throws ClassNotFoundException, SQLException
	{
		Connection con=getconnection();
		PreparedStatement pst=con.prepareStatement("select * from employee where id=?");
		pst.setInt(1, id);
		ResultSet rs= pst.executeQuery();
		rs.next();
		
		return new student_details(rs.getInt("id"), rs.getString("name"), rs.getString("city"), rs.getInt("class"), rs.getDouble("percentage"));
	}
	
	ArrayList<student_details> fetchall() throws ClassNotFoundException, SQLException
	{
		ArrayList<student_details> a1=new ArrayList<student_details>();
		Connection con=getconnection();
		PreparedStatement pst=con.prepareStatement("select * from student ");
		ResultSet rs=pst.executeQuery();
		
		while(rs.next())
		{
             student_details s1=new student_details(rs.getInt("id"), rs.getString("name"), rs.getString("city"), rs.getInt("class"), rs.getDouble("percentage"));
             a1.add(s1);
		}
		
		return a1;
		
		
		
	}

}
