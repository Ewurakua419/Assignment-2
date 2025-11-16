/**
 * @author: Ewurakua Amoah
 * date: 16/11/2025
 * Student ID: 74492028
 * Class EventDriver: Takes objects and makes them into an array then displays each item
 * Version: 0.01
 */
import java.util.Scanner;
public class EventDriver {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        EventHeader p1= new Party("White Party", "All white", "The Hive");
        p1.setDate(2025, 4, 6);
        p1.setTime(22, 00);

        EventHeader p2= new Party("Detty Dezemba", "Go All Out", "The Basketball Court", 90);
        p2.setDate(2025, 5, 6);
        p2.setTime(12, 00);

        EventHeader p3= new Party("End Of Sem Party", "Y2K", "The Grill", 80, 1, 2, input);
        p3.setDate(2025, 9, 6);
        p3.setTime(10, 00);

        EventHeader t1= new Talk("Madame Dubois", "The Art Of Dressmaking", "Home Economics", "Dressmaker");
        t1.setDate(2026, 3, 16);
        t1.setTime(20, 00);

        EventHeader t2= new Talk("Dr. Kosah", "The Importance of  words ", "Literature Department", false, "Lecturer", 90,"We discuss the importance of choosing the right words" );
        t2.setDate(2026, 12, 6);
        t2.setTime(11, 00);

        EventHeader s1= new SportEvent("Basketball", false, 2, competitor.INTERNAL, 030, input);
        s1.setDate(2026, 10, 26);
        s1.setTime(4, 10);

        EventHeader s2= new SportEvent("Tennis", true, 3, competitor.EXTERNAL, 70, input);
        s2.setDate(2026, 5, 20);
        s2.setTime(7, 00);

        EventHeader e1= new EventHeader("Dance class", "Apt 217", "Extra Curricular");
        e1.setDate(2025, 1, 25);
        e1.setTime(15, 45);
        EventHeader e2= new EventHeader("Singing class", "The Hive", "Chorale");
        e2.setDate(2025, 9, 11);
        e2.setTime(13, 20);

        EventHeader[] array= new EventHeader[9];
        array[0]=p1;
        array[1]=p2;
        array[2]=p3;
        array[3]=t1;
        array[4]=t2;
        array[5]=s1;
        array[6]=s2;
        array[7]=e1;
        array[8]=e2;
        for(int i=0; i<array.length;i++){
            array[i].display();
        }
        //Sample input
        //DJs: Uncle Waffles, DJ Blizz, Dj Nkas, Maphorisa, Mojosi
        //Vendors: Buzz and Bloom, Pizza Hut, Chicken In, Frozen Icee, Dominos
        //Teams: Berekuso Warriors, Longshots, Los Astros, Ashesi Varsity, Atennis
    }

}
