/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.TimeSlotDto;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Time;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.InsertData;

/**
 *
 * @author nishc
 */
public class AddTimeSlot extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int totalSlots=Integer.parseInt(req.getParameter("totalSlots"));
        System.out.println(totalSlots);
        String tStart[]=new String[totalSlots];
        String tEnd[]=new String[totalSlots];
        for(int i = 0 ; i < totalSlots ; i++)
        {
            tStart[i]=(String)req.getParameter("startDuration"+i+"");
        }
     for(int i = 0 ; i < totalSlots ; i++)
        {
            tEnd[i]=(String)req.getParameter("endDuration"+i+"");
        }
     
     InsertData i = new InsertData();
     TimeSlotDto t = new TimeSlotDto();
     t.setTotalSlot(totalSlots);
     t.settStart(tStart);
     t.settEnd(tEnd);
     boolean check=i.insertTimeSlots(t);
     if(check)
     {
          PrintWriter out =resp.getWriter();
                         out.println("<script type=\"text/javascript\">");
                         out.println("alert('Time Slot Inserted ');");
                         out.println("location='homeAdmin.jsp';"); 
                         out.println("</script>");
     }
     else
     {
          PrintWriter out =resp.getWriter();
                         out.println("<script type=\"text/javascript\">");
                         out.println("alert('Error Inserting Time Slots  ');");
                         out.println("location='homeAdmin.jsp';"); 
                         out.println("</script>");
     }
     

    }

}
