/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author nishc
 */
public class Department {

private String name;
ArrayList<Course> courses ;
     String branch  ; 

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
    public Department(String name, ArrayList<Course> courses,String branch) {
        this.name = name;
        this.courses = courses;
        this.branch=branch;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Course> getCourse() {
        return courses;
    }

        
}
