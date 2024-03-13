/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.DBConnector;
import dto.SectionDto;
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
public class SectionDao {
     public   List<SectionDto> getAllSectionData() 
  {
      List<SectionDto> l1 = new ArrayList<SectionDto>();
      Connection con = null;
      Statement st = null; 
      String query = "SELECT * from section";
      st=DBConnector.getStatement();
      try
      {
       ResultSet rs = st.executeQuery(query);
       while(rs.next())
       {
           SectionDto i1  = new SectionDto();
           i1.setSectionId(rs.getInt(1));
           i1.setSectionName(rs.getString(2));
           i1.setNumberOfStudents(rs.getInt(3));
           
           l1.add(i1);
           
       }
       
       
       
      }
      catch(SQLException e )
      {
          System.out.println(e);
      }
      
      
      
      
      
      return l1 ;
  }
 public   List<SectionDto> getAllSectionDataBranchWise(String branch) 
  {
      List<SectionDto> l1 = new ArrayList<SectionDto>();
      Connection con = null;
      Statement st = null; 
      System.out.println("asudfaudhfgai");
      String query = "SELECT * from section WHERE branch='"+branch +"' ";
      st=DBConnector.getStatement();
      try
      {
       ResultSet rs = st.executeQuery(query);
       while(rs.next())
       {
           SectionDto i1  = new SectionDto();
           i1.setSectionId(rs.getInt(1));
           i1.setSectionName(rs.getString(2));
           i1.setNumberOfStudents(rs.getInt(3));
           
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
