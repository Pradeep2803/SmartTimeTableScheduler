 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algo;

import Classes.Course;
import Classes.Department;
import java.util.ArrayList;
import Classes.Class;
import java.util.Random;

/**
 *
 * @author nishc
 */
public class Schedule {

    public ArrayList<Class> classes;
    public Data data;

    public Data getData() {
        return data;
    }
    Random rn = new Random();
    boolean isFitnessChanged = true;
    private double fitness = -1;
  boolean flag = false;
    private int classNumb = 0;
    public int numberOfConflict = 0;
boolean CheckLoop=false;
    public Schedule(Data data) {
        this.data = data;
        classes = new ArrayList<Class>(data.getNumberOfClasses());
    }

    public Schedule initialize() {
        ArrayList<Class> alreadyMadeClasses = new ArrayList<Class>();
      
        
        new ArrayList<Department>(data.getDepts()).forEach(dept -> {
  
            dept.getCourse().forEach(course -> {

                int randCredit = rn.nextInt(2);
                while (randCredit == 0) {
                    randCredit = rn.nextInt(2);
                }
              
                Class newClass = new Class(classNumb++, dept, course, 1);
                int remainingCredit = course.getCredit();

                newClass.setMeetingTime(data.getMeetingTimes().get((int) (data.getMeetingTimes().size() * Math.random())));
                newClass.setRoom(data.getRooms().get((int) (data.getRooms().size() * Math.random())));
                newClass.setInstructor(course.getInstructors().get((int) (course.getInstructors().size() * Math.random())));
                classes.add(newClass);
                alreadyMadeClasses.add(newClass);
                flag=true;
                remainingCredit = remainingCredit - 1;
                while (remainingCredit > 0) {
                    
                    randCredit = rn.nextInt(2);
                    while (randCredit == 0) {
                        randCredit = rn.nextInt(2);
                    }
                    
                    Class newClass2 = new Class(classNumb++, dept, course, 1);
                    newClass2.setMeetingTime(data.getMeetingTimes().get((int) (data.getMeetingTimes().size() * Math.random())));
                    newClass2.setRoom(data.getRooms().get((int) (data.getRooms().size() * Math.random())));
                    newClass2.setInstructor(newClass.getInstructor());
                    remainingCredit = remainingCredit - 1;
                    
    
                    classes.add(newClass2);
                }

            });

        });

        return this;

    }

    public int getNumberOfConflict() {
        return numberOfConflict;
    }

    public ArrayList<Class> getClasses() {
        isFitnessChanged = true;
        return classes;
    }

    public double getFitness() {
        if (isFitnessChanged == true) {
            fitness = calculateFitness();
            isFitnessChanged = false;
        }
        return fitness;
    }

    public double calculateFitness() {
        numberOfConflict = 0;
        classes.forEach(x -> {
//            if (x.getRoom().getSeatingCapacity() < x.getCourse().getMaxNumberOfStudent()) {
//                numberOfConflict++;
//            }
            classes.stream().filter(y -> classes.indexOf(y) >= classes.indexOf(x)).forEach(y -> {
//                if (x.getDept() == y.getDept() && x.getCourse() != y.getCourse() &&  x.getInstructor()!=y.getInstructor() && x.getId() != y.getId()) {
                
if ( x.getDept()==y.getDept() && x.getInstructor()!=y.getInstructor() && x.getCourse()!=y.getCourse() && x.getMeetingTime() == y.getMeetingTime()) {
                       
                        numberOfConflict++;
                    }
//                    if (x.getInstructor() == y.getInstructor()) {
//                        numberOfConflict++;
//                        System.out.println("Instructor Conflict");
//                    }

//                }

            });
        });

        return 1 / (double) (numberOfConflict);
    }

    public String toString() {
        String returnValue = new String();
        for (int x = 0; x < classes.size() - 1; x++) {
            returnValue += classes.get(x) + ",";
        }
        returnValue += classes.get(classes.size() - 1);

        return returnValue;
    }
}
