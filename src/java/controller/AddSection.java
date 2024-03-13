/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.SectionDto;
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
public class AddSection extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            
        int id=Integer.parseInt(req.getParameter("sectionId"));
        String sectionName=req.getParameter("sectionName");
        int numberOfStudents =Integer.parseInt((String)req.getParameter("sectionStudentNumber"));
        String branch=req.getParameter("branch");
        SectionDto s = new SectionDto();
        
        s.setSectionId(id);
        s.setSectionName(sectionName);
        s.setNumberOfStudents(numberOfStudents);
        s.setBranch(branch);
        InsertData i = new InsertData();
        boolean check = i.insertSection(s);
        if(check)
        {
            		 PrintWriter out =resp.getWriter();
                         out.println("<script type=\"text/javascript\">");
                         out.println("alert('Section Inserted ');");
                         out.println("location='homeAdmin.jsp';"); 
                         out.println("</script>");
        }
        else
        {
            PrintWriter out =resp.getWriter();
                         out.println("<script type=\"text/javascript\">");
                         out.println("alert('error');");
                         out.println("location='homeAdmin.jsp';"); 
                         out.println("</script>");
        }
        
    }

    
    
}
