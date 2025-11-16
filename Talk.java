/**
 * @author: Ewurakua Amoah (74492028)
 * @date: 10/11/2025
 * @title: assignment2
 * Talk Class
 */

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
/**
 * Talk class
 * For events under talk
 */
 public class Talk extends EventHeader{
    private String speakername;
    private String topic;
    private String position;
    private String abstracts=" ";
    private boolean isPassportEvent;
    private String department;
    private String date;
    private String time;
    private int duration;

    // Setters and Getters
    public void setDate(int year, int month, int day){
        LocalDate date=LocalDate.of(year,month,day);
        DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.date=date.format(format);
    }

    public void setTime(int hour, int minute){
        LocalTime time=LocalTime.of(hour,minute,00);
        DateTimeFormatter format= DateTimeFormatter.ofPattern("HH:mm:");
        this.time=time.format(format);
    }

    public void setDuration(int duration){
        this.duration=duration;
    }

    /**
     * 
     * @param isPassportEvent
     */
    public void setIsPassportEvent(boolean isPassportEvent){
        this.isPassportEvent=isPassportEvent;
    }

    /**
     * 
     * @param name
     */
    public void setName(String speakername){
        this.speakername=speakername;
    }

    public void setTopic(String topic){
        this.topic=topic;
    }

   
   
    /**
     * 
     * @param position
     */
    public void setPosition(String position){
        this.position=position;
    }

    /**
     * 
     * @param achievement
     */
    public void setAbstract(String abstracts){
        this.abstracts=abstracts;
    }

    /**
     * 
     * @param department
     */
    public void setDepartment(String department){
        this.department=department;
    }

    /**
     * 
     * @return name
     */
    public String getSpeakerName(){
        return this.speakername;
    }

    public String getDate(){
        return this.date;
    }

    public String getTime(){
        return this.time;
    }

    public String getTopic(){
        return topic;
    }

    /**
     * 
     * @return isPassportEvent
     */
    public boolean getPassportEvent(){
        return this.isPassportEvent;
    }

    /**
     * 
     * @return position
     */
    public String getPosition(){
        return this.position;
    }

    /**
     * 
     * @return achievement
     */
    public String getAbstracts(){
        return this.abstracts;
    }

    /**
     * 
     * @return department
     */
    public String getDepartment(){
        return this.department;
    }

    public String getDuration(){
        int minitues= duration%60;
        int hours=duration/60;
        return (hours+ "hours, "+ minitues+ "minutes");
    }
    /**
     * 
     * Display method to output the details of the event
     * 
     */
    @Override
    public void display(){
        System.out.println("------------------------------------------");
        System.out.println(" ");
        System.out.println("            Talk Event                     ");
        System.out.println(" ");
        System.out.println("------------------------------------------");
        System.out.println(" ");
        System.out.println(" Topic: "+ topic);
        System.out.println( "Hosted by " + department);
        System.out.println("Date: "+ date);
        System.out.println("Time: "+ time);
        System.out.println(" Duration: "+ getDuration());
        System.out.println(" ");
        
        System.out.println("------------------------------------------");
        System.out.println(" ");
        System.out.println("Guest Details");
        System.out.println(" ");
        System.out.println("Name: "+ speakername);
        System.out.println("Job: "+ position);
        System.out.println(" ");
        System.out.println("------------------------------------------");
        System.out.println(" ");
        System.out.println("            Abstract              ");
        //System.out.println(" ");
        System.out.println(abstracts);
        System.out.println(" ");
        System.out.println("------------------------------------------");
        System.out.println(" ");
        if(isPassportEvent){
            System.out.println("Passport EventOpen to all ");
        }
        else{
            System.out.println("not a Passport Event, for only "+department+ " members");
        }
        System.out.println(" ");
        System.out.println("------------------------------------------");
        System.out.println(" ");
        
        
        
        
    }

    /**
     * 
     * @param speakername
     * @param age
     * @param department
     * @param position
     * @param isPassportEvent
     * @param duration
     */
    public Talk(String speakername, String topic, String department, boolean isPassportEvent,String position, int duration, String abstracts){
        super(speakername, position, abstracts);
        this.speakername=speakername;
        this.department=department;
        this.topic=topic;
        this.abstracts=abstracts;
        this.position=position;
        this.isPassportEvent=isPassportEvent;
        this.duration=duration;

        
    }

    /**
     * 
     * @param speakername
     * @param topic
     * @param department
     * @param position
     */
    public Talk(String speakername, String topic, String department, String position){

        super(speakername, department, position);
        this.speakername=speakername;
        this.department=department;
        this.topic=topic;
        this.position=position;
        this.isPassportEvent=false;
       
    }


}
