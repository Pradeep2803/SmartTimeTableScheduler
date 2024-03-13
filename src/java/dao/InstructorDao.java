/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.DBConnector;
import dto.InstructorDto;
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
public class InstructorDao {
  public   List<InstructorDto> getAllInstructorData() 
  {
      List<InstructorDto> l1 = new ArrayList<InstructorDto>();
      Connection con = null;
      Statement st = null; 
      String query = "SELECT * from instructor";
      st=DBConnector.getStatement();
      try
      {
       ResultSet rs = st.executeQuery(query);
       while(rs.next())
       {
           InstructorDto i1  = new InstructorDto();
           i1.setInstructorId(rs.getString(1));
           i1.setInstructorName(rs.getString(2));
           i1.setTeachingHours(rs.getInt(3));
           
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
