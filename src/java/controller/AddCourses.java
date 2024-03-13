/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.CourseDto;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.InsertData;

/**
 *
 * @author nishc
 */
public class AddCourses extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int courseId = Integer.parseInt((String)req.getParameter("courseId"));
        String courseName= (String)req.getParameter("courseName");
        int numberOfStudnet =Integer.parseInt((String)req.getParameter("numberOfStudent"));
        CourseDto c = new CourseDto();
        c.setCourseId(courseId);
        c.setCourseName(courseName);
        c.setNumberOfStudent(numberOfStudnet);
        InsertData  i = new InsertData();
        boolean check = i.insertCourse(c);
        
           if(check)
     {
          PrintWriter out =resp.getWriter();
                         out.println("<script type=\"text/javascript\">");
                         out.println("alert('Course Inserted ');");
                         out.println("location='homeAdmin.jsp';"); 
                         out.println("</script>");
     }
     else
     {
          PrintWriter out =resp.getWriter();
                         out.println("<script type=\"text/javascript\">");
                         out.println("alert('Error Inserting Course  ');");
                         out.println("location='homeAdmin.jsp';"); 
                         out.println("</script>");
     }
        
        
        
    }

    
    
    
}
