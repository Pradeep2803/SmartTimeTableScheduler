/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algo;

import Classes.MeetingTime;
import java.util.ArrayList;
import Classes.Class;
import db.DBConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
/**
 *
 * @author nishc
 */
public class InsertGeneratedTimeTable {
    ArrayList<MeetingTime> mt;
    
    Connection con = DBConnector.getConnection();
    public void deletePreviousBranchData(String branch )
    {
        Statement st = DBConnector.getStatement();
        String query = "DELETE  FROM schedule WHERE branch='"+branch+"' ";
        try
        {
            st.execute(query);
         }
        catch(SQLException e )
        {
            System.out.println(e);
        }
    }
    public void extractData(Schedule s) {
        
  
        
        
        
            ArrayList<Class> classes = s.classes;
            Iterator<Class> itr = classes.iterator();
           String branch  = itr.next().getDept().getBranch();
            deletePreviousBranchData(branch);
            itr = classes.iterator();
            while(itr.hasNext())
            {
                Class c = itr.next() ;
                String scheduleDept = c.getDept().getName();
                String scheduleCourse = c.getCourse().getName();
                String scheduleFaculrt = c.getInstructor().getName();
                String scheduleMt = c.getMeetingTime().getTime();
                String branch2 = c.getDept().getBranch();
                String mtId= c.getMeetingTime().getId();
                
                try
                {
                   PreparedStatement st = con.prepareStatement("INSERT INTO schedule(scheduleDept,scheduleCourse,scheduleFaculty,scheduleMt,branch,mtId) values(?,?,?,?,?,?)");
                   st.setString(1, scheduleDept);
                   st.setString(2, scheduleCourse);
                   st.setString(3, scheduleFaculrt);
                   st.setString(4, scheduleMt);
                   st.setString(5, branch2);
                   st.setString(6,mtId);
                   int i=st.executeUpdate();
            if(i!=0)
            {System.out.println("Data Inserted s");}
                   
                }
                catch(SQLException e)
                {
                    System.out.println(e);
                }
                
                
            }
            
            
    }
}
