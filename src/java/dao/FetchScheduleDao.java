/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.DBConnector;
import dto.FetchScheduleDto;
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
public class FetchScheduleDao {
    
    
    public List<FetchScheduleDto> fetchAllScheduleDataOfGivenSection(String section)
    {
//        System.out.println("ASDA"+section);
        List<FetchScheduleDto> l = new ArrayList<FetchScheduleDto>();
        Statement st = DBConnector.getStatement();
        String query= "SELECT scheduleCourse , scheduleFaculty, mtId  FROM schedule WHERE scheduleDept ='"+section+"' ";
        try
        {
            ResultSet rs = st.executeQuery(query);
            while(rs.next())
            {
                FetchScheduleDto fs = new FetchScheduleDto();
                fs.setCourse(rs.getString(1));
                fs.setFaculty(rs.getString(2));
                fs.setMid(rs.getString(3));
                System.out.println(rs.getString(3));
                l.add(fs);
            }
            
            
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
        return l;
    }
    public static void main(String[] args) {
        
        FetchScheduleDao f = new FetchScheduleDao();
        f.fetchAllScheduleDataOfGivenSection("cs1");
    }
}
