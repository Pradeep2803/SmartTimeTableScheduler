/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author nishc
 */
public class FetchScheduleDto {
    String course ; 
    String faculty ; 
    String Mid ;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getMid() {
        return Mid;
    }

    public void setMid(String Mid) {
        this.Mid = Mid;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

}
