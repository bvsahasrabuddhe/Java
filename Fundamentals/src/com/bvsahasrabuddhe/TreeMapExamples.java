package com.bvsahasrabuddhe;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExamples {
    public static void main(String[] args) {

//        HashMap<String, String> flights = new HashMap<String, String>();
//
//        flights.put("21:00", "indigo");
//        flights.put("23:30", "goair");
//        flights.put("04:30", "spicejet");
//        flights.put("16:00", "vistara");
//        flights.put("21:30", "airindia");
//        flights.put("09:00", "indigo");
//        flights.put("11:00", "spicejet");
//        flights.put("13:00", "goair");
//        System.out.println(flights);

//        {13:00=goair, 11:00=spicejet, 21:00=indigo, 23:30=goair, 16:00=vistara, 09:00=indigo, 04:30=spicejet, 21:30=airindia}
//        13:00=goair
//        11:00=spicejet
//        21:00=indigo
//        23:30=goair
//        16:00=vistara
//        09:00=indigo
//        04:30=spicejet
//        21:30=airindia

        TreeMap<String, String> flights = new TreeMap<String, String>();

        flights.put("21:00", "indigo");
        flights.put("23:30", "goair");
        flights.put("04:30", "spicejet");
        flights.put("16:00", "vistara");
        flights.put("21:30", "airindia");
        flights.put("09:00", "indigo");
        flights.put("11:00", "spicejet");
        flights.put("13:00", "goair");
        System.out.println(flights);

        Set<Entry<String, String>> entrys = flights.entrySet();

        for(Entry<String, String> entry : entrys){
            System.out.println(entry);
        }

//        {04:30=spicejet, 09:00=indigo, 11:00=spicejet, 13:00=goair, 16:00=vistara, 21:00=indigo, 21:30=airindia, 23:30=goair}
//        04:30=spicejet
//        09:00=indigo
//        11:00=spicejet
//        13:00=goair
//        16:00=vistara
//        21:00=indigo
//        21:30=airindia
//        23:30=goair

        System.out.println(flights.firstKey());
//        04:30

        System.out.println(flights.firstEntry());
//        04:30=spicejet

        System.out.println(flights.lastKey());
        System.out.println(flights.lastEntry());
//        23:30
//        23:30=goair

        System.out.println(flights.ceilingKey("11.00"));
        System.out.println(flights.ceilingEntry("11.00"));
//        11:00
//        11:00=spicejet

        System.out.println("higher : not worked as it should be 13.00");
        System.out.println(flights.higherKey("11.00"));
        System.out.println(flights.higherEntry("11.00"));

        System.out.println(flights.ceilingKey("21.00"));
        System.out.println(flights.ceilingEntry("21.00"));
//        21:00
//        21:00=indigo

        System.out.println(flights.floorKey("10.00"));
        System.out.println(flights.floorEntry("10.00"));
//        09:00
//        09:00=indigo

        System.out.println(flights.lowerKey("10.00"));
        System.out.println(flights.lowerEntry("10.00"));
//        09:00
//        09:00=indigo

        System.out.println(flights.lowerKey("21.00"));
        System.out.println(flights.lowerEntry("21.00"));
//        16:00
//        16:00=vistara

        System.out.println();
        System.out.println("Multiple keyset");
        Set<String> keys  = flights.descendingKeySet();

        for(String key: keys)  {
            System.out.println(key);
        }
//        23:30
//        21:30
//        21:00
//        16:00
//        13:00
//        11:00
//        09:00
//        04:30

        Map<String, String> flights2 = flights.descendingMap();
        Set<Entry<String, String>> set = flights2.entrySet();

        for(Entry<String, String> entry : set){
            System.out.println(entry);
        }
//        23:30=goair
//        21:30=airindia
//        21:00=indigo
//        16:00=vistara
//        13:00=goair
//        11:00=spicejet
//        09:00=indigo
//        04:30=spicejet

        // Entires before 13.00 excluding printed
        Map<String, String> flights3 = flights.headMap("13.00");
        Set<Entry<String, String>> entry3 = flights3.entrySet();

        for(Entry<String, String> entry : entry3){
            System.out.println(entry);
        }
//        04:30=spicejet
//        09:00=indigo
//        11:00=spicejet


        // Entires before 13.00 includeing printed  :: Not worked
        Map<String, String> flights4 = flights.headMap("13.00", true);
        Set<Entry<String, String>> entry4 = flights4.entrySet();
        for(Entry<String, String> entry : entry4){
            System.out.println(entry);
        }
//        04:30=spicejet
//        09:00=indigo
//        11:00=spicejet


        // Entires after 13.00 includeing printed  :: Not worked
        Map<String, String> flights5 = flights.tailMap("13.00");
        Set<Entry<String, String>> entry5 = flights5.entrySet();
        for(Entry<String, String> entry : entry5){
            System.out.println(entry);
        }
//        13:00=goair
//        16:00=vistara
//        21:00=indigo
//        21:30=airindia
//        23:30=goair

        // Entires betewen 13.00 and 21.00 includeing printed
        Map<String, String> flights6 = flights.subMap("13.00" ,"21.00");
        Set<Entry<String, String>> entry6 = flights6.entrySet();
        for(Entry<String, String> entry : entry6){
            System.out.println(entry);
        }
//        13:00=goair
//        16:00=vistara

    } // main
}
