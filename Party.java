/**
 * @author: Ewurakua Amoah (74492028)
 * @date: 10/11/2025
 * @title: assignment2
 * Party Class
 */
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
class Party extends EventHeader{
    private String theme=" ";
    private String[] DJs;
    private int numDJS=-1;
    private String name=" ";
    private String location=" ";
    private String[] vendors;
    private int numVendors=-1;
    private String date="DD:MM:YY";
    private String time="HH:MM";
    private int duration=0;

    // Setters and Getters
    /**
     * 
     * @param theme
     */
    public void setTheme(String theme){
        this.theme=theme;
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
     * @param year
     * @param month
     * @param day
     */
    public void setDate(int year, int month, int day){
        LocalDate date=LocalDate.of(year,month,day);
        DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.date=date.format(format);
    }

    public void setDJs(Scanner input){
        if (numDJS==-1){
            System.out.println("No DJs invited");
        }
        else{
            
            DJs=new String[numDJS];
            for(int i=0; i<numDJS; i++){
                System.out.println("Please enter the name of the DJ");
                String val=input.nextLine();
                DJs[i]=val;
            }
            //xxname.close();
        }
        
    }

    public void setVendors(Scanner name){

        if (numVendors==-1){
            System.out.println("No Vendors invited");
        }
        else{
            vendors=new String[numVendors];
            for(int i=0; i<numVendors; i++){
                System.out.println("Please enter the name of the Vendor");
                vendors[i]=name.nextLine();
                
            }
            //name.close();
        }
        
    }

    /**
     * 
     * @param numVendors
     */
    public void setNumVendors(int numVendors){
        this.numVendors=numVendors;
    }

    /**
     * 
     * @param numDJS
     */
    public void setNumDJs(int numDJS){
        this.numDJS=numDJS;
    }

    /**
     * 
     * @param hour
     * @param minute
     */
    public void setTime(int hour, int minute){
        LocalTime time=LocalTime.of(hour,minute,00);
        DateTimeFormatter format= DateTimeFormatter.ofPattern("HH:mm");
        this.time=time.format(format);
    }

    /**
     * 
     * @param duration
     */
    public void setDuration(int duration){
        this.duration=duration;
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
        return (hours+ "hours, "+ minitues+ " minutes");
    }
    public void getVendors(){
        if (numVendors==-1){
            System.out.println("No Vendors invited");
        }
        else{
            System.out.println("Vendors Present:");
            System.out.println(" ");
            for (int i=0; i<vendors.length;i++){
                System.out.println(vendors[i]);

            }
        }
        
    }

    public void getDjs(){
        if (numVendors==-1){
            System.out.println("No DJs invited");
        }
        else{
            System.out.println("DJs Present:");
            System.out.println(" ");
            for (int i=0; i<DJs.length;i++){
                System.out.println(DJs[i]);

            }
        }
        
    }

    public String getTheme(){
        return this.theme;
    }

    public String getName(){
        return this.name;
    }

    public String getLocation(){
        return this.location;
    }

    public int getNumVendors(){
        return this.numVendors;
    }

    public int getNumDJs(){
        return this.numDJS;
    }

    @Override
    public void display(){
        System.out.println("------------------------------------------");
        System.out.println(" ");
        System.out.println("             "+name);
        System.out.println(" ");
        System.out.println("------------------------------------------");
        System.out.println(" ");
        System.out.println("Theme: "+ theme);
        System.out.println(" ");
        System.out.println("------------------------------------------");
        System.out.println(" ");
        System.out.println("Date: "+ date);
        System.out.println("Time: "+ time);
        System.out.println("Duration: "+ getDuration());
        System.out.println("Location: "+ location);
        
        System.out.println(" ");
        System.out.println("------------------------------------------");
        System.out.println(" ");
        getDjs();
        System.out.println(" ");
        getVendors();
        System.out.println(" ");
        System.out.println("------------------------------------------");
        System.out.println(" ");
        System.out.println("        You are invited");
        System.out.println(" ");
        System.out.println("------------------------------------------");
        
    }

    //Constructors
    /** 
    * default constructor
    */ 
    public Party(){
        super(" ", " ", " ");

    }

    /**
     * 
     * @param name
     * @param theme
     * @param location
     */
    public Party(String name, String theme, String location){
        super(" ", " ", " ");
        this.name=name;
        this.theme=theme;
        this.location=location;
    }

    /**
     * 
     * @param name
     * @param theme
     * @param location
     * @param duration
     */
    public Party(String name, String theme, String location, int duration){
        super(" ", " ", " ");
        this.name=name;
        this.theme=theme;
        this.location=location;
        this.duration=duration;
    }

    /**
     * 
     * @param name
     * @param theme
     * @param location
     * @param duration
     * @param numDJS
     * @param numVendors
     */
    public Party(String name, String theme, String location, int duration, int numDJS, int numVendors, Scanner input){
        super(" ", " ", " ");
        this.name=name;
        this.theme=theme;
        this.location=location;
        this.duration=duration;
        this.numDJS=numDJS;
        this.numVendors=numVendors;
        setDJs(input);
        setVendors(input);
    }
}
