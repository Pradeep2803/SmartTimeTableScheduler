/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author nishc
 */
public class Class {
    private int id ;
    private Department dept ;
    private Course course ;
    private Instructor instructor ;
    private MeetingTime meetingTime;
    private Room room  ;
    int credit ;
    public Class(int id, Department dept, Course course,int credit) {
        this.id = id;
        this.dept = dept;
        this.course = course;
        this.credit=credit;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public void setMeetingTime(MeetingTime meetingTime) {
        this.meetingTime = meetingTime;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getId() {
        return id;
    }

    public Department getDept() {
        return dept;
    }

    public Course getCourse() {
        return course;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public MeetingTime getMeetingTime() {
        return meetingTime;
    }

    public Room getRoom() {
        return room;
    }

    @Override
    public String toString() {
        return  "["+ dept.getName() + ", course=" + course.getName() + ", instructor=" + instructor.getId() + ", meetingTime=" + meetingTime.getId() + ", room=" + room.getNumber() + "]";
    }
    
    
    
}
