/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Count;

import db.DBConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author nishc
 */
public class GetCountRows {
    public int getCourseCount()
    {
        int count = 0;
        String query1="SELECT COUNT(courseid) FROM course ";
         Statement st=DBConnector.getStatement();
         try
         {
             ResultSet rs =st.executeQuery(query1);
             if(rs.next())
             {
                 count=Integer.parseInt(rs.getString(1));
             }
         }
         catch(SQLException e )
         {
             System.out.println(e);
         }
        return count ;
    };
}
