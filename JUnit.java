/**
 * @author: Ewurakua Amoah
 * Student ID: 74492028
 * Class EventDriver: Takes objects and makes them into an array then displays each item
 * Version: 0.01
 */
import java.util.Scanner;
public class JUnit {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        //initializing the event 1
        EventHeader event1= new EventHeader("Chess","RB 216", "After Class Activities");
        //testing out getters and setters
        event1.setDate(2025, 2, 1);
        event1.setLocation("The Hive");
        event1.setType("Meeting");
        System.out.println("Date: "+event1.getDate());
        System.out.println("Type: "+event1.getType());
        System.out.println("Duration: "+event1.getDuration());
        //testing out the display method
        event1.display();

        //initializing event 2
        EventHeader event2= new EventHeader("Foot health talk", "The Hive", "Talk");
        //testing getters and setters
        event2.setName("Painting night");
        event2.setTime(15, 50);
        System.out.println("Name: "+event2.getName());
        System.out.println("Location: "+ event2.getLocation());
        //testing the display method
        event2.display();

        //initializing the talk object 1
        Talk talk1= new Talk("Kojo Asante","The importance of a new tale","Literature Department", "Lecturer");
        //viewing the details of the object beforehand
        System.out.println("Before edit");
        talk1.display();

        //testing getters and setters
        talk1.setAbstract("Discussion on the importance of creating new stories");
        talk1.setDate(2023, 4, 21);
        talk1.setDepartment("Law Department");
        talk1.setDuration(210);
        talk1.setIsPassportEvent(false);
        System.out.println("Abstract: "+talk1.getAbstracts());
        System.out.println("Date: "+talk1.getDate());
        System.out.println("Department: "+talk1.getDepartment());
        System.out.println("Is this a Passport Event: "+talk1.getPassportEvent());
        System.out.println("Duration: "+talk1.getDuration());
        //viewing details of the new edited object
        System.out.println("After Edits");
        talk1.display();

        //initializing the talk object 2
        Talk talk2=new Talk("Ama Blanc", "Fireide Stories", "Economics", true, "President", 90, "Discussing stories which have helped with the growth of the country.");
        //viewing the details of the object beforehand
        System.out.println("Before edit");
        talk2.display();

        //testing getters and setters
        talk2.setName("Dr.Ebo");
        talk2.setPosition("Faculty");
        talk2.setTime(2, 040);
        talk2.setTopic("Around the fire");
        System.out.println("Name: "+talk2.getSpeakerName());
        System.out.println("Position: "+talk1.getPosition());
        System.out.println("Time: "+talk2.getTime());
        System.out.println("Topic: "+talk2.getTime());

        //viewing details of the new edited object
        System.out.println("After edit");
        talk2.display();
        

        //initializing the Party object 1
        Party party1= new Party("Aschella", "Y2k", "The New CarPark");
        //viewing the details of the object beforehand
        System.out.println("Before edit party1");
        party1.display();
        //testing getters and setters
        party1.setDuration(60);
        party1.setTime(12,30);
        party1.setDate(2024, 12, 30);
        party1.setLocation("Apt 217");
        party1.setNumDJs(3);
        party1.setDJs(input);
        party1.setNumVendors(2);
        party1.setVendors(input);
        System.out.println("Duration: "+party1.getDuration());
        System.out.println("Time: "+party1.getTime());
        System.out.println("Date: "+party1.getDate());
        party1.getDjs();
        party1.getVendors();
        System.out.println("Number of Vendors: "+party1.getNumVendors());
        System.out.println("Number of DJs: "+party1.getNumDJs());
        //viewing details of the new edited object
        System.out.println("After edit");
        party1.display();

        //initializing the Party object 2
        Party party2= new Party("Opening Night", "90's ", "The Hive", 90, 2, 3,input);

        //viewing the details of the object beforehand
        System.out.println("Before edit party2");
        party2.display();
        //testing getters and setters
        party2.setName("Ashesiscaladizzy");
        party2.setTheme("White Party");
        party2.setDate(2025, 01, 02);
        party2.setTime(00, 30);
        System.out.println("Name: "+party2.getName());
        System.out.println("Theme: "+party2.getTheme());

        //viewing details of the new edited object
        System.out.println("After edit");
        party2.display();


        //initializing the Sport object 1 and 2
        SportEvent sport1= new SportEvent("Basketball", false,2, competitor.INTERNAL, 240, input);
        SportEvent sport2=new SportEvent("Chess", true, 1, competitor.EXTERNAL, 90, input);

        //viewing the details of the object beforehand
        System.out.println("Before edit");
        sport1.display();
        //testing getters and setters
        sport1.setDate(2026, 6, 9);
        sport1.setTime(4, 030);
        sport1.setCompete(competitor.EXTERNAL);
        sport1.setDuration(40);
        System.out.println("Date: "+sport1.getDate());
        System.out.println("Time: "+sport1.getTime());
        System.out.println("Compete: "+sport1.getCompete());
        System.out.println("Duration: "+sport1.getDuration());
        //viewing details of the new edited object
        System.out.println("After edit");
        sport1.display();
  
        //viewing the details of the object beforehand
        System.out.println("Before edit");
        sport2.display();
        //testing getters and setters
        sport2.setDate(2024, 8, 8);
        sport2.setTime(4, 030);
        sport2.setIsFriendly(false);
        sport2.setTeamnum(2);
        sport2.setTeams(input);
        System.out.println("Is it Friendly: "+sport2.getIsFriendly());
        System.out.println("Number of Teams: "+sport2.getTeamnum());
        sport2.getTeams();
        //viewing details of the new edited object
        System.out.println("After edit");
        sport2.display();
    }

}
