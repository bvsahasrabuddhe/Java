package com.bvsahasrabuddhe;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

class Flight implements Comparable<Flight>{
    private String departure;
    private String name;
    private float duration;
    private int price;

    public Flight(){

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

    public Flight(String departure, String name, float duration, int price){
        this.departure = departure;
        this.name = name;
        this.duration = duration;
        this.price = price;
    }

     public String toString(){
       // return "It returns Flight object";
         return "[departure = " + departure+", name="+name+", duration="+duration+", price="+price+"]" ;
     }
     public int compareTo(Flight f2){
        //Sort by departure
//        String s1 = this.departure;
//        String s2 = f2.departure;
//        return s1.compareTo(s2);
         //Sort by price
         Integer p1 = this.price;
         Integer p2 = f2.price;
         return p1.compareTo(p2);
     }
//            [departure = 04:30, name=spicejet, duration=1.5, price=2500]
//            [departure = 09:00, name=indigo, duration=4.0, price=6500]
//            [departure = 11:00, name=spicejet, duration=3.7, price=9000]
//            [departure = 13:00, name=goair, duration=2.0, price=8000]
//            [departure = 16:00, name=vistara, duration=3.5, price=6000]
//            [departure = 21:00, name=indigo, duration=2.5, price=5000]
//            [departure = 21:30, name=airindia, duration=4.5, price=5500]
//            [departure = 23:30, name=goair, duration=5.0, price=7000]

//            [departure = 04:30, name=spicejet, duration=1.5, price=2500]
//            [departure = 21:00, name=indigo, duration=2.5, price=5000]
//            [departure = 21:30, name=airindia, duration=4.5, price=5500]
//            [departure = 16:00, name=vistara, duration=3.5, price=6000]
//            [departure = 09:00, name=indigo, duration=4.0, price=6500]
//            [departure = 23:30, name=goair, duration=5.0, price=7000]
//            [departure = 13:00, name=goair, duration=2.0, price=8000]
//            [departure = 11:00, name=spicejet, duration=3.7, price=9000]




}
public class PojoClassExample {
    public static void main(String[] args) {
        Flight f1 =   new Flight ("21:00", "indigo", 2.5f, 5000);
        Flight f2 =   new Flight ("23:30", "goair", 5.0f, 7000);
        Flight f3 =   new Flight ("04:30", "spicejet", 1.5f, 2500);
        Flight f4 =   new Flight ("16:00", "vistara", 3.5f, 6000);
        Flight f5 =   new Flight ("21:30", "airindia", 4.5f, 5500);
        Flight f6 =   new Flight ("09:00", "indigo", 4.0f, 6500);
        Flight f7 =   new Flight ("11:00", "spicejet", 3.7f, 9000);
        Flight f8 =   new Flight ("13:00", "goair", 2.0f, 8000);
        // System.out.println(f1);
       // System.out.println(f1.toString());
       // ArrayList<Flight> flightsList = new ArrayList<Flight>();
       // HashSet<Flight> flightsList = new HashSet<Flight>();
        TreeSet<Flight> flightsList = new TreeSet<Flight>();
        flightsList.add(f1);
        flightsList.add(f2);
        flightsList.add(f3);
        flightsList.add(f4);
        flightsList.add(f5);
        flightsList.add(f6);
        flightsList.add(f7);
        flightsList.add(f8);

        for(Flight flight : flightsList){
            System.out.println(flight);
        }
//        [departure = 21:00, name=indigo, duration=2.5, price=5000]
//        [departure = 23:30, name=goair, duration=5.0, price=7000]
//        [departure = 04:30, name=spicejet, duration=1.5, price=2500]
//        [departure = 16:00, name=vistara, duration=3.5, price=6000]
//        [departure = 21:30, name=airindia, duration=4.5, price=5500]
//        [departure = 09:00, name=indigo, duration=4.0, price=6500]
//        [departure = 11:00, name=spicejet, duration=3.7, price=9000]
//        [departure = 13:00, name=goair, duration=2.0, price=8000]


    }
}
