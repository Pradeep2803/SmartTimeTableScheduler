/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.DBConnector;
import dto.SubjectDto;
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
public class SubjectsDao {
     public   List<SubjectDto> getAllSubjectData() 
  {
      List<SubjectDto> l1 = new ArrayList<SubjectDto>();
      Connection con = null;
      Statement st = null; 
      String query = "SELECT * from subjects  " ;
      st=DBConnector.getStatement();
      try
      {
       ResultSet rs = st.executeQuery(query);
       while(rs.next())
       {
           SubjectDto i1  = new SubjectDto();
           i1.setSubjectId(rs.getString(1));
           i1.setSubjectName(rs.getString(2));
           i1.setSubjectFaculty1(rs.getString(3));
           i1.setSubjectFaculty2(rs.getString(4));
           i1.setSubjectFaculty3(rs.getString(5));
           i1.setSubjectFaculty4(rs.getString(6));
           i1.setSubjectFaculty5(rs.getString(7));
           i1.setCredit(rs.getInt(8));
           
           l1.add(i1);
           System.out.println("This the subject faculty no 5 " + i1.getSubjectFaculty5());
       }
       
       
       
      }
      catch(SQLException e )
      {
          System.out.println(e);
      }
      
      
      
      
      
      return l1 ;
  }
}
