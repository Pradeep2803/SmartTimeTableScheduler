/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algo;

import Algo.Data;
import static java.lang.Integer.SIZE;
import java.util.ArrayList;
import Classes.Class;
import Classes.MeetingTime;
import dto.SectionsUserData;
import java.util.Iterator;

/**
 *
 * @author nishc
 */
public class Driver {

    static int Sount = 0;
    public static final int POPULATION_SIZE = 36;
    public static final double MUTATTE_RATE = 0.89;
    public static final double CROSSOVER_RATE = 0.5;
    public static final int TOURNAMENT_SELECTION_SIZE = 2;
    public static final int NUMB_OF_ELITE_SCHEDULES = 2;
    private static Data data;
    private int scheduleNumb;
    private int classNumb = 1;

    SectionsUserData s ;
    void initializeSectionsUserData(SectionsUserData s )
    {
        this.s=s;
    }
    public static void main(String[] args,Data d) {
        Driver driver = new Driver();
        
        driver.data = d;
        
        int generationNumber = 0;
        driver.printAvailiableData();

        System.out.println("> Generation # " + generationNumber);
        System.out.print(" Schedule #|                      ");

        System.out.print("Classes [dept, class, room, instructor, meeting-time] ");

        System.out.println("                                      Fitness | Conflicts");

        System.out.print("-----------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------");
        GeneticAlgorithm geneticAlgorithm = new GeneticAlgorithm(driver.data);
        Population population = new Population(Driver.POPULATION_SIZE, driver.data).sortByFitness();
        population.getSchedules().forEach(schedule -> System.out.println("         " + driver.scheduleNumb++ + " |   " + schedule + " | " + String.format("%.5f", schedule.getFitness()) + "  |  " + schedule.getNumberOfConflict()));

        driver.printScheduleAsTable(population.getSchedules().get(0), generationNumber);
        driver.classNumb = 1;
        while (population.getSchedules().get(0).getFitness() != 1.0) {

            System.out.println("> Generation #" + ++generationNumber);

            System.out.print(" Schedule  |");

            System.out.print("classes [dept, class, room, instructor, meeting-time]");

            System.out.println("                        | Fitness | Conflicts");

            System.out.print("------------------------------------------------------------");
            System.out.println("-----------------sfgdfg-------------------------------------------------------------------------------------------------------------------------------------------------------------");

            population = geneticAlgorithm.evolve(population).sortByFitness();

            driver.scheduleNumb = 0;

            population.getSchedules().forEach(schedule -> System.out.println("        " + driver.scheduleNumb++
                    + "     |    " + schedule + "|" + String.format("%.5f", schedule.getFitness()) + " | " + schedule.getNumberOfConflict()));
            driver.printScheduleAsTable(population.getSchedules().get(0), generationNumber);

            population.getSchedules().forEach(schedule -> System.out.println(schedule.getNumberOfConflict()));

        }
        InsertGeneratedTimeTable t = new InsertGeneratedTimeTable();

        Schedule s = population.getSchedules().get(0);
        
        t.extractData(s);

    }

    public void intiateTheGen(Data d )
    {
        main(null,d);
    }
    
    public void printScheduleAsTable(Schedule schedule, int generation) {
        ArrayList<Class> classes = schedule.getClasses();

        System.out.print("\n");

        System.out.println("Class #  | Dept  | Course (number, max # of students) | Room (Capacity) | Instructor(Id)  | Meeting Time(Id)");

        System.out.print("");
        System.out.print("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------");
        classes.forEach(x -> {

            int majorIndex = data.getDepts().indexOf(x.getDept());

            int coursesIndex = data.getCourses().indexOf(x.getCourse());

            int roomsIndex = data.getRooms().indexOf(x.getRoom());
            int instructorsIndex = data.getInstructors().indexOf(x.getInstructor());

            int meetingTimeIndex = data.getMeetingTimes().indexOf(x.getMeetingTime());

            System.out.print("  ");

            System.out.print(String.format("%1$02d ", classNumb) + "  | ");
            System.out.print(String.format("%1$4s", data.getDepts().get(majorIndex).getName()) + "  |  ");
            System.out.print(String.format("%1$21s", data.getCourses().get(coursesIndex).getName() + "(" + data.getCourses().get(coursesIndex).getNumber() + ", " + x.getCourse().getMaxNumberOfStudent()) + ")            |");
            System.out.print(String.format("%1$10s", data.getRooms().get(roomsIndex).getNumber() + " ( " + x.getRoom().getSeatingCapacity()) + ")       |");

            System.out.print(String.format("%1$15s", data.getInstructors().get(instructorsIndex).getName() + "(" + data.getInstructors().get(instructorsIndex).getId() + ")") + " |  ");
            System.out.println(data.getMeetingTimes().get(meetingTimeIndex).getTime() + "(" + data.getMeetingTimes().get(meetingTimeIndex).getId() + ")");

            classNumb++;

        });

        if (schedule.getFitness() == 1) {
            System.out.println("> Solution Found in " + (generation + 1) + " generations");
        }

        System.out.print("-------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------");

    }

    public static void printAvailiableData() {
        System.out.println("Available Departments ==>");

        data.getDepts().forEach(x -> System.out.println("name: " + x.getName() + ", courses: " + x.getCourse()));

        System.out.println("\nAvailable Courses ==>");
        data.getCourses().forEach(x -> System.out.println("course #:" + x.getNumber() + ", name: " + x.getName() + ", max # of students:" + x.getMaxNumberOfStudent() + ", instructors: " + x.getInstructors()));
        System.out.println("\nAvailable Rooms ==>");
        data.getRooms().forEach(x -> System.out.println("room #: " + x.getNumber() + ", max seating capacity: " + x.getSeatingCapacity()));

        System.out.println("\nAvailable Instructors **>");

        data.getInstructors().forEach(x -> System.out.println("id: " + x.getId() + ", name: " + x.getName()));
        System.out.println("\nAvailable Meeting Times ==>");

        data.getMeetingTimes().forEach(x -> System.out.println("id: " + x.getId() + ", Meeting Time: " + x.getTime()));

        System.out.print("----------------------------------------------------------------------------------------------");

        System.out.println("----------------------------------------------------------------------------------------------");

    }
}
