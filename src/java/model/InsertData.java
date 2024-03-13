/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBConnector;
import dto.CourseDto;
import dto.InstructorDto;
import dto.RoomDto;
import dto.SectionDto;
import dto.SubjectDto;
import dto.TimeSlotDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author nishc
 */
public class InsertData {
    
    public boolean insertTimeSlots(TimeSlotDto t)
    {
        int totalSlot =t.getTotalSlot();
        String tStart[] = t.gettStart();
        String tEnd[] = t.gettEnd();
        Statement st=DBConnector.getStatement();
        int s = 0 ;
        for(int i = 0 ; i < totalSlot ; i++)
        {
            
            int indexOfColon = tStart[i].indexOf(":");
          //  tStart[i]=tStart[i].replace(":", ".");
            //tEnd[i]=tEnd[i].replace(":", ".");
            String start = tStart[i];
            String end = tEnd[i];
            
            System.out.println(start);
            System.out.println(end);
            float mins=0;
               
          
           
            String query="INSERT INTO slot (slotStartDuration , slotEndDuration) values('"+tStart[i]+"','"+tEnd[i]+"')";
            try
            {
                 s = st.executeUpdate(query);
                
            }
            catch(SQLException e)
            {
                System.out.println(e);
            }
         }
        
        if(s!=0)
        {
            return true;
        }
        
        
        return false ;
    }
    
    
     public boolean insertSection(SectionDto s)
    {
        int sectionId =s.getSectionId();
        String sectionName=s.getSectionName();
        int numberOfStudent=s.getNumberOfStudents();
        String branch = s.getBranch();
        Connection con = DBConnector.getConnection();
        
        try
        {
            PreparedStatement st = con.prepareStatement("INSERT INTO section values(?,?,?,?)");
            st.setInt(1, sectionId);
            st.setString(2, sectionName);
            st.setInt(3, numberOfStudent);
            st.setString(4, branch);
            
            int i=st.executeUpdate();
            if(i!=0)
            {
                return true;
            }
                    
        
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
        return false ;
    }
    
        
     public boolean insertSubject(SubjectDto s)
    {
        String subjectId =s.getSubjectId();
        String subjectName = s.getSubjectName();
        String subjectFaculty1 = s.getSubjectFaculty1();
        String subjectFaculty2 = s.getSubjectFaculty2();
        String subjectFaculty3 = s.getSubjectFaculty3();
        String subjectFaculty4 = s.getSubjectFaculty4();
        String subjectFaculty5 = s.getSubjectFaculty5();
        int credit = s.getCredit();
        Connection con = DBConnector.getConnection();
        
        try
        {
            PreparedStatement st = con.prepareStatement("INSERT INTO subjects values(?,?,?,?,?,?,?,?)");
            st.setString(1, subjectId);
            st.setString(2, subjectName);
            st.setString(3, subjectFaculty1);
            st.setString(4, subjectFaculty2);
            st.setString(5, subjectFaculty3);
            st.setString(6, subjectFaculty4);
            st.setString(7, subjectFaculty5);
            st.setInt(8,credit);
            int i=st.executeUpdate();
            if(i!=0)
            {
                return true;
            }
                    
        
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
        return false ;
    }
     
     public boolean insertCourse(CourseDto s)
    {
        int courseId =s.getCourseId();
        String courseName = s.getCourseName();
        int numberOfStudent = s.getNumberOfStudent();
        Connection con = DBConnector.getConnection();
        
        try
        {
            PreparedStatement st = con.prepareStatement("INSERT INTO course values(?,?,?)");
            st.setInt(1, courseId);
            st.setString(2, courseName);
            st.setInt(3, numberOfStudent);
                
            int i=st.executeUpdate();
            if(i!=0)
            {
                return true;
            }
                    
        
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
        return false ;
    }
    
       public boolean insertInstructor(InstructorDto s)
    {
        String instructorId =s.getInstructorId();
        String instructorName = s.getInstructorName();
        int teachingHours = s.getTeachingHours();
        Connection con = DBConnector.getConnection();
        
        try
        {
            PreparedStatement st = con.prepareStatement("INSERT INTO instructor values(?,?,?)");
            st.setString(1, instructorId);
            st.setString(2, instructorName);
            st.setInt(3,teachingHours);
                
            int i=st.executeUpdate();
            if(i!=0)
            {
                return true;
            }
                    
        
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
        return false ;
    }
     
        public boolean insertRoom(RoomDto s)
    {
        int roomId =s.getRoomId();
        String roomName=s.getRoomName();
        int numberOfStudent=s.getSeatingCapacity();
        Connection con = DBConnector.getConnection();
        
        try
        {
            PreparedStatement st = con.prepareStatement("INSERT INTO room values(?,?,?)");
            st.setInt(1, roomId);
            st.setString(2, roomName);
            st.setInt(3, numberOfStudent);
            
            int i=st.executeUpdate();
            if(i!=0)
            {
                return true;
            }
                    
        
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
        return false ;
    }

}
