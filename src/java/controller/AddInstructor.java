/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.InstructorDto;
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
public class AddInstructor extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String instructorId = (String)req.getParameter("instructorId");
        String instructorName = (String)req.getParameter("instructorName");
        int teachingHours=Integer.parseInt((String)req.getParameter("teachingHours"));
             
        InstructorDto i = new InstructorDto();
                i.setInstructorId(instructorId);
                i.setInstructorName(instructorName);
                i.setTeachingHours(teachingHours);
                InsertData iData = new InsertData();
                boolean check = iData.insertInstructor(i);
                
               if(check)
     {
          PrintWriter out =resp.getWriter();
                         out.println("<script type=\"text/javascript\">");
                         out.println("alert('Instructor Inserted ');");
                         out.println("location='homeAdmin.jsp';"); 
                         out.println("</script>");
     }
     else
     {
          PrintWriter out =resp.getWriter();
                         out.println("<script type=\"text/javascript\">");
                         out.println("alert('Error Inserting Instructor  ');");
                         out.println("location='homeAdmin.jsp';"); 
                         out.println("</script>");
     } 
    }

    
    
}
