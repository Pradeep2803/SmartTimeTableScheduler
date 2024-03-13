/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataGetMethods;

import Algo.Data;
import Algo.Driver;
import Classes.Course;
import Classes.Department;
import dto.SectionsUserData;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author nishc
 */
public class GetScheduleData extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      int numberOfClasses=Integer.parseInt(req.getParameter("numberOfClasses"));
      int j = 0;
      List<SectionsUserData> SUD =new ArrayList<SectionsUserData>();
      for(int i = 0 ; i < numberOfClasses ; i++)
      {
//          String deptId=req.getParameter(name)
        String deptName=req.getParameter("Department"+i);
        String Sub1=req.getParameter("sub_code"+(j+1));
        String Sub2=req.getParameter("sub_code"+(j+2));
        String Sub3=req.getParameter("sub_code"+(j+3));
        String Sub4=req.getParameter("sub_code"+(j+4));
        String Sub5=req.getParameter("sub_code"+(j+5));
        String branch = req.getParameter("branch");
//          System.out.println(deptName);
//          System.out.println(Sub1);
//          System.out.println(Sub2);
//          System.out.println(Sub3);
//          System.out.println(Sub4);
//          System.out.println(Sub5);
          
        SectionsUserData s = new SectionsUserData();
        s.setName(deptName);
        s.setCourses(new ArrayList<>(Arrays.asList(Sub1,Sub2,Sub3,Sub4,Sub5)));
        s.setBranch(branch);
        SUD.add(s);
        
        
      }
//      SUD.forEach(x->{
//          System.out.println(x.getName());
//         x.getCourses().forEach(k->{
//          
//             System.out.println(k);
//          });
//      });
     
Data d = new Data(SUD);
Driver drv =  new Driver();
drv.intiateTheGen(d);

resp.sendRedirect("ViewGeneratedTimeTable.jsp");

    }

    
    

//
//
//public void extractData(List<SectionsUserData> l )
//{
//   Iterator<SectionsUserData> i = l.iterator();
//   int d=1 ;
//   while(i.hasNext())
//   {
//       ArrayList<Course> c = new ArrayList<Course>();
//       SectionsUserData s = i.next();
//       String deptId ="CS"+i; 
//       String deptName = s.getName();
//       ArrayList<String> subjects  = s.getCourses();
//       subjects.forEach(x->{
//      courses.forEach(y->{
//          if(x.equals(y.getName()))
//          {System.out.println(y.getName());
//              c.add(y);
//          }
//          
//          
//      });
//      
//           
//       });
////       Department dept = new Department(deptName, c);
////  depts.add(dept);
//   }
////   
////    depts.forEach(x -> numberOfClasses += x.getCourse().size());
////    Driver drj = new Driver();
////    drj.intiateTheGen();
//}
}