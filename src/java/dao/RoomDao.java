/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.DBConnector;
import dto.RoomDto;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nishc
 */
public class RoomDao {
     public   List<RoomDto> getAllRoomData() 
  {
      List<RoomDto> l1 = new ArrayList<RoomDto>();
      Connection con = null;
      Statement st = null; 
      String query = "SELECT * from room";
      st=DBConnector.getStatement();
      try
      {
       ResultSet rs = st.executeQuery(query);
       while(rs.next())
       {
           RoomDto i1  = new RoomDto();
           i1.setRoomId(rs.getInt(1));
           i1.setRoomName(rs.getString(2));
           i1.setSeatingCapacity(rs.getInt(3));
           
           l1.add(i1);
           
       }
       
       
       
      }
      catch(SQLException e )
      {
          System.out.println(e);
      }
      
      
      
      
      
      return l1 ;
  }
}
