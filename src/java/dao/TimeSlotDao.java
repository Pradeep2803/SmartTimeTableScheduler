/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.DBConnector;
import dto.TimeSlotDto;
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
public class TimeSlotDao {
     public   List<TimeSlotDto> getAllTimeSlotData() 
  {
      List<TimeSlotDto> l1 = new ArrayList<TimeSlotDto>();
      Connection con = null;
      Statement st = null; 
      String query = "SELECT * from slot";
      st=DBConnector.getStatement();
      try
      {
       ResultSet rs = st.executeQuery(query);
       while(rs.next())
       {
           TimeSlotDto i1  = new TimeSlotDto();
           
           i1.setStart(rs.getString(1));
            i1.setEnd(rs.getString(2));
           
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
