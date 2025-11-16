/**
 * @author: Ewurakua Amoah (74492028)
 * @date: 10/11/2025
 * @title: assignment2
 * Sport Event
 */

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
/**
 * Sports events
 */
enum competitor{
    INTERNAL,EXTERNAL
}

public class SportEvent extends EventHeader{
    private String type;
    private boolean isFriendly;
    private competitor compete;
    private int teamnum=1;
    private String[] teams;
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

    public void setType(String type){
        this.type=type;
    }

    public void setIsFriendly(boolean isFriendly){
        this.isFriendly=isFriendly;
    }

    public void setCompete(competitor compete){
        this.compete=compete;
    }

    

    public void setTeamnum(int teamnum){
        this.teamnum=teamnum;
    }

    public void setTeams(Scanner name){
        if (teamnum<=1){
            System.out.println(" Unsuccessful. Please make sure the number of teams playing is correct");
        }
        else{;
            teams=new String[teamnum];
            for(int i=0; i<teamnum;i++){
                System.out.println("Please enter the name of the team");
                String val=name.nextLine();
                teams[i]=val;
            }
            System.out.println("Success");
        }
        
    }

    public String getType(){
        return type;
    }

    public boolean getIsFriendly(){
        return isFriendly;
    }

    public competitor getCompete(){
        return compete;
    }


    public int getTeamnum(){
        return teamnum;
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



    public void getTeams(){
        if (teamnum<=1){
            System.out.println("No Teams invited");
        }
        else{
            System.out.println("Teams Competing:");
            System.out.println("------------------------------------------");
            System.out.println(" ");
            for (int i=0; i<teams.length; i++){
                System.out.println(teams[i]);

            }
        }
        
    }

    @Override
    public void display(){
        System.out.println("------------------------------------------");
        System.out.println(" ");
        System.out.println("           Sports Event                   ");
        System.out.println(" ");
        System.out.println("------------------------------------------");
        System.out.println(" ");
        System.out.println(type.toUpperCase() +" Game");
        System.out.println(" ");
        System.out.println("Date: "+ date);
        System.out.println("Time: "+ time);
        System.out.println("Duration: "+ getDuration());
        System.out.println(" ");
        System.out.println("------------------------------------------");
        System.out.println(" ");
        if (compete==competitor.EXTERNAL){
            System.out.println("Away Game: ");
            

        }
        else{
            System.out.println("Home Game: ");
            
        }
        getTeams();
        System.out.println("------------------------------------------");
        System.out.println(" ");
        if (isFriendly){
            System.out.println("Friendly game");

        }
        else{
            System.out.println("Not a friendly game");
        }
        System.out.println("------------------------------------------");
        System.out.println(" ");
        System.out.println("You are welcome");
        
    }

    public SportEvent( String type, boolean isFriendly, int teamnum, competitor compete, int duration, Scanner name){
        super(" ", " ", " ");
        this.type=type;
        this.isFriendly=isFriendly;
        this.teamnum=teamnum;
        setTeams(name);
        this.compete=compete;
        this.date="00:00:00";
        this.time="00-00";
        this.duration=duration;
    }
}

