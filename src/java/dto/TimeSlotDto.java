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
public class TimeSlotDto {
    String tStart[] ; 
    String tEnd[];
    int totalSlot;
    String start ; 
    String end  ;

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
    public int getTotalSlot() {
        return totalSlot;
    }

    public void setTotalSlot(int totalSlot) {
        this.totalSlot = totalSlot;
    }
    public String[] gettStart() {
        return tStart;
    }

    public void settStart(String[] tStart) {
        this.tStart = tStart;
    }

    public String[] gettEnd() {
        return tEnd;
    }

    public void settEnd(String[] tEnd) {
        this.tEnd = tEnd;
    }
    
}
