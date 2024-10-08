package students_project;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/employee11")
public class employee_servelet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("sid"));
		String name=req.getParameter("sname");
		String city=req.getParameter("scity");
		int classes=Integer.parseInt(req.getParameter("sclass"));
		double percentage=Double.parseDouble(req.getParameter("spercentage"));
		
		dataconnection_student d1=new dataconnection_student();
		
		try {
			int a=d1.insertdata(new student_details(id, name, city, classes, percentage));
			res.getWriter().print(a+"row inserted");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
