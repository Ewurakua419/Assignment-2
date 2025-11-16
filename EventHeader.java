/**
 * @author: Ewurakua Amoah (74492028)
 * @date: 10/11/2025
 * @title: assignment2
 * EventHeader class
 */
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class EventHeader {
    private String name;
    private String location;
    private String type;
    private String date;
    private String time;
    private int duration;

    // Setters and Getters
    public void setDate(int year, int month, int day){
        LocalDate date = LocalDate.of(year,month,day);
        DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.date=date.format(format);
    }

    public void setTime(int hour, int minute){
        LocalTime time=LocalTime.of(hour,minute,00);
        DateTimeFormatter format= DateTimeFormatter.ofPattern("HH:mm:");
        this.time=time.format(format);
    }
    /**
     * 
     * @param name
     */
    public void setName(String name){
        this.name=name;
    }

    /**
     * 
     * @param location
     */
    public void setLocation(String location){
        this.location=location;
    }

    /**
     * 
     * @param type
     */
    public void setType(String type){
        this.type=type;
    }


    /**
     * 
     * @return name
     */
    public String getName(){
        return this.name;
    }

    /**
     * 
     * @return location
     */
    public String getLocation(){
        return location;
    }

    /**
     * 
     * @return type
     */
    public String getType(){
        return this.type;
    }

    public String getDate(){
        return this.date;
    }

    public String getTime(){
        return this.time;
    }

    public String getDuration(){
        int minitues= duration%60;
        int hours=duration/60;
        return (hours+ "hours, "+ minitues+ "minutes");
    }

    //Constructors
    /**
     * 
     * @param name
     * @param department
     * @param type
     */
    public EventHeader(String name, String location, String type){
        this.name=name;
        this.type=type;
        this.location=location;
    }

    /**
     * 
     * Abstract class
     */
    public void display(){
        System.out.println("Name:"+ name+ " type: "+ type+ "location: "+ location);
    };

}

