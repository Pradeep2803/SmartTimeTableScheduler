package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.LoginDto;
import java.io.PrintWriter;
import model.LoginAuthentication;
/**
 * Servlet implementation class LoginAuthenticationGetData
 */
@WebServlet("/LoginAuthenticationGetData")
public class LoginAuthenticationGetData extends HttpServlet {
	
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.sendRedirect("login.html");
	
}

@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//	resp.sendRedirect("index.html");	
	String email=req.getParameter("email");
		String password = req.getParameter("password");
		LoginDto l = new LoginDto();
		 
		l.setEmail(email);
		l.setPassword(password);
		
		LoginAuthentication la = new LoginAuthentication();
		boolean check = la.authenticate(l);
		if(check)
		{
			System.out.println("Tbis is return ed truwe ");
			resp.sendRedirect("homeAdmin.jsp");
		}
		else 
		{
			 PrintWriter out =resp.getWriter();
   out.println("<script type=\"text/javascript\">");
   out.println("alert('User or password incorrect');");
   out.println("location='login.jsp';");
   out.println("</script>");
		}
}
        
}
