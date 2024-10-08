package students_project;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/employee22")
public class employee_servelet2 extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		dataconnection_student d1=new dataconnection_student();
		
		try {
			res.getWriter().print(d1.fetchall());
			
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
