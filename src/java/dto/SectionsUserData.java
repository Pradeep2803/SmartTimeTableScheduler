/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import Classes.Course;
import Classes.Instructor;
import java.util.ArrayList;

/**
 *
 * @author nishc
 */
public class SectionsUserData {
    String name;
ArrayList<String> courses ;
String branch;

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

    public void setName(String name) {
        this.name = name;
    }

 
}
