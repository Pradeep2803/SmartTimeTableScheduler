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
public class Instructor {
    private String id ; 
    private String name ;
    public Instructor(String id, String instructorName) {
        this.id = id;
        this.name = instructorName;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return  name;
    }
    
}
