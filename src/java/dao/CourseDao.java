/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.DBConnector;
import dto.CourseDto;
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
public class CourseDao {
     public   List<CourseDto> getAllCourseData() 
  {
      List<CourseDto> l1 = new ArrayList<CourseDto>();
      Connection con = null;
      Statement st = null; 
      String query = "SELECT * from course";
      st=DBConnector.getStatement();
      try
      {
       ResultSet rs = st.executeQuery(query);
       while(rs.next())
       {
           CourseDto c1  = new CourseDto();
           c1.setCourseId(rs.getInt(1));
           c1.setCourseName(rs.getString(2));
           c1.setNumberOfStudent(rs.getInt(3));
           
           l1.add(c1);
           
       }
       
       
       
      }
      catch(SQLException e )
      {
          System.out.println(e);
      }
      
      
      
      
      
      return l1 ;
  }
}
