package com.bvsahasrabuddhe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

// Creat new class
class CompareName implements Comparator<FlightIn>{
   public int compare(FlightIn f1, FlightIn f2) {
       String name1 = f1.getName();
       String name2 = f2.getName();
       return name1.compareTo(name2);
    }
}

class CompareDuration implements Comparator<FlightIn>{
    public int compare(FlightIn f1, FlightIn f2) {
        Float duration1 = f1.getDuration();
        Float duration2 = f2.getDuration();
//        if(duration1>duration2){
//            return 1;
//        }
//        else if(duration1<duration2){
//            return -1;
//        }
//        else   {
//            return 0;
//        }
        return duration1.compareTo(duration2);

    }
}


class ComparePrice implements Comparator<FlightIn>{
    public int compare(FlightIn f1, FlightIn f2) {
        Integer price1 = f1.getPrice();
        Integer price2 = f2.getPrice();
        return price1.compareTo(price2);
    }
}

// name is given FlightIn instead of Flight

class FlightIn implements Comparable<FlightIn>{
    private String departure;
    private String name;
    private float duration;
    private int price;

    public FlightIn(){
    }

    public String getDeparture() {
        return departure;
    }

    public String getName() {
        return name;
    }

    public float getDuration() {
        return duration;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public FlightIn(String departure, String name, float duration, int price){
        this.departure = departure;
        this.name = name;
        this.duration = duration;
        this.price = price;
    }

    public String toString(){
        // return "It returns Flight object";
        return "[departure = " + departure+", name="+name+", duration="+duration+", price="+price+"]" ;
    }


    public int compareTo(FlightIn f2){
        //Sort by departure
        String s1 = this.departure;
        String s2 = f2.departure;
        return s1.compareTo(s2);
    }
}

public class FlightComparator {

    public static void main(String[] args) {
        FlightIn f1 =   new FlightIn ("21:00", "indigo", 2.5f, 5000);
        FlightIn f2 =   new FlightIn ("23:30", "goair", 5.0f, 7000);
        FlightIn f3 =   new FlightIn ("04:30", "spicejet", 1.5f, 2500);
        FlightIn f4 =   new FlightIn ("16:00", "vistara", 3.5f, 6000);
        FlightIn f5 =   new FlightIn ("21:30", "airindia", 4.5f, 5500);
        FlightIn f6 =   new FlightIn ("09:00", "indigo", 4.0f, 6500);
        FlightIn f7 =   new FlightIn ("11:00", "spicejet", 3.7f, 9000);
        FlightIn f8 =   new FlightIn ("13:00", "goair", 2.0f, 8000);

        ArrayList<FlightIn> flightsList = new ArrayList<FlightIn>();

        flightsList.add(f1);
        flightsList.add(f2);
        flightsList.add(f3);
        flightsList.add(f4);
        flightsList.add(f5);
        flightsList.add(f6);
        flightsList.add(f7);
        flightsList.add(f8);

        System.out.println("Enter your choice");
        System.out.println("1. Departure");
        System.out.println("2. Name");
        System.out.println("3. Duration");
        System.out.println("4. Price");

        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();

        if(choice == 1){
            Collections.sort(flightsList);
        }
        else if (choice == 2){
            Collections.sort(flightsList, new CompareName());
        }
        else if (choice == 3){
            Collections.sort(flightsList, new CompareDuration());
        }
        else if (choice == 4){
            Collections.sort(flightsList, new ComparePrice());
        }

        for(FlightIn flight : flightsList){
            System.out.println(flight);
        }
    }

}
