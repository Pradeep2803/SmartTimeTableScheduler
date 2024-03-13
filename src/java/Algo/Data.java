/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algo;

import Classes.Course;
import Classes.Department;
import Classes.Instructor;
import Classes.MeetingTime;
import Classes.Room;
import dao.InstructorDao;
import dao.SubjectsDao;
import dto.InstructorDto;
import dto.SectionsUserData;
import dto.SubjectDto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 *
 * @author nishc
 */
public class Data {

    private ArrayList<Room> rooms;
    private ArrayList<Instructor> instructors;
    private ArrayList<Course> courses;
    private ArrayList<Department> depts;
    private ArrayList<MeetingTime> meetingTimes;
    private static Data data;
    private int numberOfClasses = 0;

    public Data(List<SectionsUserData> l) {
    depts = new ArrayList<Department>();
    initialize();
    int i = 1 ;
    Iterator<SectionsUserData>  itr  = l.iterator();
    while(itr.hasNext())
    {
         ArrayList<Course> coursess = new ArrayList<Course>();
        SectionsUserData s = itr.next();
        String deptId = "CS"+i;
        String deptName = s.getName();
        String branch  = s.getBranch();
//        System.out.println(s.getName());
        s.getCourses().forEach(x->{
        courses.forEach(y->{
        if(x.equalsIgnoreCase(y.getName()))
        {
            coursess.add(y);;
        };
            
        });
        
            
        });
        Department dept11 = new Department(deptName,coursess,branch);
        depts.add(dept11);
        
        
    }
    
    depts.forEach(p->{
        System.out.println(p.getName());
        p.getCourse().forEach(t->{
            
            System.out.println(t.getName());
            
        });
        
        
    });
    
//        initialize();
    }
    public static void main(String[] args) {
        
//        Data d = new Data();
//        d.initialize();
//        d.courses.forEach(x->{
//        x.getInstructors().forEach(y->{
//            System.out.println(y);
//        });
////        });
//d.courses.forEach(x->{
//    System.out.println("course is "+x);
//    System.out.println("course instructor are" );
//    x.getInstructors().forEach(y->{
//        System.out.println("instructors are "+y);
//    });
//});
        
        
    }
public void extractData(List<SectionsUserData> l )
{
    initialize();
    int i = 1 ;
    Iterator<SectionsUserData>  itr  = l.iterator();
    while(itr.hasNext())
    {
        ArrayList<Course> coursess = new ArrayList<Course>();
        SectionsUserData s = itr.next();
        String deptId = "CS"+i;
        String deptName = s.getName();
        String branch = s.getBranch();
//        System.out.println(s.getName());
        s.getCourses().forEach(x->{
        courses.forEach(y->{
        if(x.equalsIgnoreCase(y.getName()))
        {
            coursess.add(y);;
        };
            
        });
        
            
        });
        Department dept11 = new Department(deptName,coursess,branch);
        depts.add(dept11);
        
        
    }
    
    depts.forEach(p->{
        System.out.println(p.getName());
        p.getCourse().forEach(t->{
            
            System.out.println(t.getName());
            
        });
        
        
    });
    
    Driver d = new Driver();
//    d.intiateTheGen();
    
}

    public Data initialize() {

        Room room1 = new Room("R1", 999);
        Room room2 = new Room("R2", 999);
        Room room3 = new Room("R3", 999);
        Room room4 = new Room("R4", 999);
        Room room5 = new Room("R5", 999);
        Room room6 = new Room("R6", 999);
        Room room7 = new Room("R7", 999);
        Room room8 = new Room("R8", 999);
        Room room9 = new Room("R9", 999);
        Room room10 = new Room("R10", 999);

        rooms = new ArrayList<Room>(Arrays.asList(room1, room2, room3, room4, room5, room6, room7, room8, room9, room10));
        MeetingTime meetingTimel = new MeetingTime("MT1", "Mon 09:00 - 10:00", 1);
        MeetingTime meetingTime2 = new MeetingTime("MT2", "Mon 10:00 - 11:00", 1);
        MeetingTime meetingTime3 = new MeetingTime("MT3", "Mon 11:00 - 12:00", 1);
        MeetingTime meetingTime4 = new MeetingTime("MT4", "Mon 12:00 - 13:00", 1);
        MeetingTime meetingTime5 = new MeetingTime("MT5", "Mon 13:00 - 14:00", 1);
        MeetingTime meetingTime6 = new MeetingTime("MT6", "Mon 14:00 - 15:00", 1);

        MeetingTime meetingTime7 = new MeetingTime("MT7", "tue 09:00 - 10:00", 1);
        MeetingTime meetingTime8 = new MeetingTime("MT8", "tue 10:00 - 11:00", 1);
        MeetingTime meetingTime9 = new MeetingTime("MT9", "tue 11:00 - 12:00", 1);
        MeetingTime meetingTime10 = new MeetingTime("MT10", "tue 12:00 - 13:00", 1);
        MeetingTime meetingTime11 = new MeetingTime("MT11", "tue 13:00 - 14:00", 1);
        MeetingTime meetingTime12 = new MeetingTime("MT12", "tue 14:00 - 15:00", 1);

        MeetingTime meetingTime13 = new MeetingTime("MT13", "wed 09:00 - 10:00", 1);
        MeetingTime meetingTime14 = new MeetingTime("MT14", "wed 10:00 - 11:00", 1);
        MeetingTime meetingTime15 = new MeetingTime("MT15", "wed 11:00 - 12:00", 1);
        MeetingTime meetingTime16 = new MeetingTime("MT16", "wed 12:00 - 13:00", 1);
        MeetingTime meetingTime17 = new MeetingTime("MT17", "wed 13:00 - 14:00", 1);
        MeetingTime meetingTime18 = new MeetingTime("MT18", "wed 14:00 - 15:00", 1);

        MeetingTime meetingTime19 = new MeetingTime("MT19", "thru 09:00 - 10:00", 1);
        MeetingTime meetingTime20 = new MeetingTime("MT20", "thru 10:00 - 11:00", 1);
        MeetingTime meetingTime21 = new MeetingTime("MT21", "thru 11:00 - 12:00", 1);
        MeetingTime meetingTime22 = new MeetingTime("MT22", "thru 12:00 - 13:00", 1);
        MeetingTime meetingTime23 = new MeetingTime("MT23", "thru 13:00 - 14:00", 1);
        MeetingTime meetingTime24 = new MeetingTime("MT24", "thru 14:00 - 15:00", 1);

        MeetingTime meetingTime25 = new MeetingTime("MT25", "fri 09:00 - 10:00", 1);
        MeetingTime meetingTime26 = new MeetingTime("MT26", "fri 10:00 - 11:00", 1);
        MeetingTime meetingTime27 = new MeetingTime("MT27", "fri 11:00 - 12:00", 1);
        MeetingTime meetingTime28 = new MeetingTime("MT28", "fri 12:00 - 13:00", 1);
        MeetingTime meetingTime29 = new MeetingTime("MT29", "fri 13:00 - 14:00", 1);
        MeetingTime meetingTime30 = new MeetingTime("MT30", "fri 14:00 - 15:00", 1);

        MeetingTime meetingTime31 = new MeetingTime("MT31", "sat 09:00 - 10:00", 1);
        MeetingTime meetingTime32 = new MeetingTime("MT32", "sat 10:00 - 11:00", 1);
        MeetingTime meetingTime33 = new MeetingTime("MT33", "sat 11:00 - 12:00", 1);
        MeetingTime meetingTime34 = new MeetingTime("MT34", "sat 12:00 - 13:00", 1);
        MeetingTime meetingTime35 = new MeetingTime("MT35", "sat 13:00 - 14:00", 1);
        MeetingTime meetingTime36 = new MeetingTime("MT36", "sat 14:00 - 15:00", 1);

            meetingTimes = new ArrayList<MeetingTime>(Arrays.asList(meetingTimel, meetingTime2, meetingTime3, meetingTime4, meetingTime5, meetingTime6, meetingTime7, meetingTime8, meetingTime9, meetingTime10, meetingTime11, meetingTime12, meetingTime13, meetingTime14, meetingTime15, meetingTime16, meetingTime17, meetingTime18, meetingTime19, meetingTime20, meetingTime21, meetingTime22, meetingTime23, meetingTime24, meetingTime25, meetingTime26, meetingTime27, meetingTime28, meetingTime29, meetingTime30, meetingTime31, meetingTime32, meetingTime33, meetingTime34, meetingTime35, meetingTime36));
       instructors = new ArrayList<>();
            InstructorDao iDao1 = new InstructorDao();
                      List<InstructorDto> l2 = iDao1.getAllInstructorData();
                      Iterator<InstructorDto> itr2=l2.iterator();
                      while(itr2.hasNext())
                      {
                          InstructorDto insDto = new InstructorDto();
                              
                          insDto=itr2.next();
            String instructorId = insDto.getInstructorId();
            String instructorName = insDto.getInstructorName();
                        Instructor ins = new Instructor(instructorId, instructorName);
                        
                        instructors.add(ins);
                      }
//                      }
//                        
    //            Instructor instructor1 = new Instructor("I1", "Dr Ssish k Penchala ");
//        Instructor instructor2 = new Instructor("I2", "Mrs margi patel");
//        Instructor instructor3 = new Instructor("I3", "Mr rakesh jain ");
//        Instructor instructor4 = new Instructor("I4", "Mr puneet duggal");
//        Instructor instructor5 = new Instructor("I5", "Mr Himanshu. r");
//        Instructor instructor6 = new Instructor("I6", "Mr Pankaj Wadhwani");
//        Instructor instructor7 = new Instructor("I7", "Mr L.J Brown");
//        Instructor instructor8 = new Instructor("I8", "Mr Abhishek bhatnagar");
//        Instructor instructor9 = new Instructor("I9", "Dr Rohit Verma");
//        Instructor instructor10 = new Instructor("I10", "Mrs Dipti Rege");
//        Instructor instructor11 = new Instructor("I11", "Dr Rajkumar Jain");
//        Instructor instructor12 = new Instructor("I12", "Mrs Deepak aggrawal");
//        Instructor instructor13 = new Instructor("I13", "Ms Jaya Singh");
//        Instructor instructor14 = new Instructor("I14", "Mrs Alpana Meena");
//        Instructor instructor15 = new Instructor("I15", "Mrs Poorva Shukla");
//        Instructor instructor16 = new Instructor("I16", "Mrs Neha talreja");
//        Instructor instructor17 = new Instructor("I17", "Mrs Pradeep Baniya");
//
//        instructors = new ArrayList<>(Arrays.asList(instructor1, instructor2, instructor3, instructor4, instructor5, instructor6, instructor7, instructor8, instructor9, instructor10, instructor11, instructor12, instructor13, instructor14, instructor15, instructor16, instructor17));

// void getUserData?

        courses = new ArrayList<Course>();
             SubjectsDao iDao = new SubjectsDao();
                      List<SubjectDto> l1 = iDao.getAllSubjectData();
                       Iterator<SubjectDto> itr1=l1.iterator();
                      while(itr1.hasNext())
                      {
                          SubjectDto insDto = new SubjectDto();
                              
                          insDto=itr1.next();
                          String courseId = insDto.getSubjectId();
                          String courseName=insDto.getSubjectName();
                          String subjectFaculty1=insDto.getSubjectFaculty1();
                          String subjectFaculty2=insDto.getSubjectFaculty2();
                          String subjectFaculty3=insDto.getSubjectFaculty3();
                          String subjectFaculty4=insDto.getSubjectFaculty4();
                          String subjectFaculty5=insDto.getSubjectFaculty5();
                          int credit = insDto.getCredit();
//                          System.out.println(subjectFaculty1);
                          ArrayList<Instructor> i = new ArrayList<Instructor>();
                          System.out.println("this is the course name " +courseName);
                          if(subjectFaculty1==null || subjectFaculty1.equals("null"))
                          {
                              System.out.println("fac1 is null");
                          } 
                          else
                          {
                               instructors.forEach(x->{
                                  
                              if(x.getId().equals(subjectFaculty1))
                              {
                                  
                                  System.out.println(x.getId());
                                  i.add(x);
                              }
                              
                              });
                          }
                   
                          
                        
                          if(subjectFaculty2==null || subjectFaculty2.equals("null") )
                          {
                              System.out.println("Fac 2 is null");
                          }
                          
                          else{ 
                             instructors.forEach(x->{
                                  if(x.getId().equals(subjectFaculty2))
                                  {  
                                  System.out.println(x.getId());
                                      i.add(x);
                                  }
                                  
                              });
                              
                          }
                          if(subjectFaculty3==null || subjectFaculty3.equals("null"))
                          { 
                              System.out.println("Fac 3 is null");
                          }
                          else
                          {
                                instructors.forEach(x->{
                              if(x.getId().equals(subjectFaculty3))
                              { 
                                  System.out.println(x.getId());
                                  i.add(x);
                              }
                              
                              });
                          }
                          
                          if(subjectFaculty4==null || subjectFaculty4.equals("null"))
                          { 
                              System.out.println("Fac 4 is null");
                          }
                          else
                          {
                              
                              instructors.forEach(x->{
                              if(x.getId().equals(subjectFaculty4))
                              { 
                                  
                                  System.out.println(x.getId());
                                  i.add(x);
                              }
                              
                              });
                          }
                          if(subjectFaculty5==null || subjectFaculty5.equals("null"))
                          { 
                              System.out.println("fac5 is null");
                          }
                          else
                          {
                              instructors.forEach(x->{
                              if(x.getId().equals(subjectFaculty5))
                              {  
                                  
                                  System.out.println(x.getId());
                                  i.add(x);
                              }
                              
                              });
                          }
//                          Random rn = new Random();
                          Course course = new Course(courseId,courseName,i,25,credit);
                          courses.add(course);
                      }

//
//        Course course1 = new Course("C1", "601", new ArrayList<Instructor>(Arrays.asList(instructor1, instructor9)), 25, 2);
//        Course course2 = new Course("C2", "602", new ArrayList<Instructor>(Arrays.asList(instructor2, instructor10)), 35, 2);
//        Course course3 = new Course("C3", "603", new ArrayList<Instructor>(Arrays.asList(instructor3, instructor11)), 25, 2);
//        Course course4 = new Course("C4", "604", new ArrayList<Instructor>(Arrays.asList(instructor4)), 30, 2);
//        Course course5 = new Course("C5", "605", new ArrayList<Instructor>(Arrays.asList(instructor5)), 35, 2);//8+12+5+2+2
//        Course course6 = new Course("C6", "606", new ArrayList<Instructor>(Arrays.asList(instructor6)), 45, 1);
//        Course course7 = new Course("C7", "608", new ArrayList<Instructor>(Arrays.asList(instructor2, instructor12, instructor14)), 45, 1);
//        Course course8 = new Course("C8", "CDC1", new ArrayList<Instructor>(Arrays.asList(instructor7, instructor13, instructor16)), 45, 1);
//        Course course9 = new Course("C9", "CDC2", new ArrayList<Instructor>(Arrays.asList(instructor8)), 45, 1);
//        
//        courses = new ArrayList<Course>(Arrays.asList(course1, course2, course3, course4, course5, course6, course7, course8, course9));

//        
//        Department dept1 = new Department("CS1", new ArrayList<Course>(Arrays.asList(course1, course2, course3, course4, course5, course6, course7, course8, course9)));
//        Department dept2 = new Department("CS2", new ArrayList<Course>(Arrays.asList(course1, course2, course3, course4, course5, course6, course7, course8, course9)));
//        Department dept3 = new Department("CS3", new ArrayList<Course>(Arrays.asList(course1, course2, course3, course4, course5, course6, course7, course8, course9)));
//  
//
//        Department dept1 = new Department("CS1", new ArrayList<Course>(Arrays.asList(courses.get(0),courses.get(1),courses.get(3),courses.get(2))));
//        Department dept2 = new Department("CS2", new ArrayList<Course>(Arrays.asList(courses.get(4),courses.get(2),courses.get(1),courses.get(3))));
//        Department dept3 = new Department("CS3", new ArrayList<Course>(Arrays.asList(courses.get(0),courses.get(2),courses.get(3),courses.get(4))));
//  
//
//        depts = new ArrayList<Department>(Arrays.asList(dept1, dept2, dept3));
//        depts.forEach(x -> numberOfClasses += x.getCourse().size());

        return this;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public ArrayList<Instructor> getInstructors() {
        return instructors;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public ArrayList<Department> getDepts() {
        return depts;
    }

    public ArrayList<MeetingTime> getMeetingTimes() {
        return meetingTimes;
    }

    public int getNumberOfClasses() {
        return numberOfClasses;
    }

}
