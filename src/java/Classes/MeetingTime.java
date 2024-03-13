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
public class MeetingTime {
    private String id ;
    private String time ;
    int duration;
    public MeetingTime(String id, String time,int duration) {
        this.id = id;
        this.time = time;
        this.duration=duration;
    }

    public String getId() {
        return id;
    }

    public String getTime() {
        return time;
    }
    
    
    
    
}
