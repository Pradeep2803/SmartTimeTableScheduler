/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import dto.SubjectDto;
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
public class AddSubjects extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String subjectId =(String)req.getParameter("subjectId");
        String subjectName=(String)req.getParameter("subjectName");
        String subjectFaculty1 = (String)req.getParameter("subjectFaculty1");
        String subjectFaculty2 = (String)req.getParameter("subjectFaculty2");
        String subjectFaculty3 = (String)req.getParameter("subjectFaculty3");
        String subjectFaculty4 = (String)req.getParameter("subjectFaculty4");
        String subjectFaculty5 = (String)req.getParameter("subjectFaculty5");
        int credit = Integer.parseInt((String)req.getParameter("credit"));
        SubjectDto s = new SubjectDto();
        
        s.setSubjectId(subjectId);
        s.setSubjectName(subjectName);
        s.setSubjectFaculty1(subjectFaculty1);
         s.setSubjectFaculty2(subjectFaculty2);
         s.setSubjectFaculty3(subjectFaculty3);
         s.setSubjectFaculty4(subjectFaculty4);
         s.setSubjectFaculty5(subjectFaculty5);
        s.setCredit(credit);
        InsertData i = new InsertData();
        
        boolean check = i.insertSubject(s);
        
           if(check)
     {
          PrintWriter out =resp.getWriter();
                         out.println("<script type=\"text/javascript\">");
                         out.println("alert('Subject Inserted ');");
                         out.println("location='homeAdmin.jsp';"); 
                         out.println("</script>");
     }
     else
     {
          PrintWriter out =resp.getWriter();
                         out.println("<script type=\"text/javascript\">");
                         out.println("alert('Error Inserting Subject  ');");
                         out.println("location='homeAdmin.jsp';"); 
                         out.println("</script>");
     }
        
    }

    
    
}
