/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.RoomDto;
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
public class AddRooms extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        int roomId = Integer.parseInt((String)req.getParameter("roomId"));
        int roomCapacity = Integer.parseInt((String)req.getParameter("roomCapacity"));
        String roomName=(String)req.getParameter("roomName");
        RoomDto r = new RoomDto();
        r.setRoomId(roomId);
        r.setRoomName(roomName);
        r.setSeatingCapacity(roomCapacity);
        
        InsertData i = new InsertData();
        boolean iCheck = i.insertRoom(r);
        
           if(iCheck)
     {
          PrintWriter out =resp.getWriter();
                         out.println("<script type=\"text/javascript\">");
                         out.println("alert('Room Inserted ');");
                         out.println("location='homeAdmin.jsp';"); 
                         out.println("</script>");
     }
     else
     {
          PrintWriter out =resp.getWriter();
                         out.println("<script type=\"text/javascript\">");
                         out.println("alert('Error Inserting Room  ');");
                         out.println("location='homeAdmin.jsp';"); 
                         out.println("</script>");
     }
        
        
        
    }

    
}
