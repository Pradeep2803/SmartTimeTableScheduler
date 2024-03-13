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
public class Course {

    private String number;
    private String name;
    private int maxNumberOfStudent;
    private ArrayList<Instructor> instructors;
    private int credit;

    public int getCredit() {
        return credit;
    }

    public Course(String number, String name, ArrayList<Instructor> instructors, int maxNumberOfStudent, int credit) {
        this.number = number;
        this.name = name;
        this.instructors = instructors;
        this.credit = credit;
        this.maxNumberOfStudent = maxNumberOfStudent;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getMaxNumberOfStudent() {
        return maxNumberOfStudent;
    }

    public ArrayList<Instructor> getInstructors() {
        return instructors;
    }

    @Override
    public String toString() {
        return "Course{" + "name=" + name + '}';
    }

}
