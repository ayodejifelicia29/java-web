package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "demo", urlPatterns = {"/demo"})
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String ageFromRequest = request.getParameter("age");
		
		String ageFromServlet = ageFromRequest + " ans";
		
		request.setAttribute("formatedAge", ageFromServlet);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/demo.jsp").forward(request, response);
	}
}
