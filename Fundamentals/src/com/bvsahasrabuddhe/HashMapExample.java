package com.bvsahasrabuddhe;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<String, String> myDetails = new HashMap<String, String>();
        //System.out.println(myDetails);
        myDetails.put("FirstName", "Bhalchandra");
        myDetails.put("SurName", "Sahasrabuddhe");
        myDetails.put("DOB", "19/11/1979");
        myDetails.put("Mobile", "9021192760");

        System.out.println(myDetails);
        //{FirstName=Bhalchandra, DOB=19/11/1979, SurName=Sahasrabuddhe, Mobile=9021192760}

        Collection<String> values = myDetails.values();
        // testing commented :  System.out.println(values);
        //[Bhalchandra, 19/11/1979, Sahasrabuddhe, 9021192760]

        System.out.println("Values");
        for(String value : values){
            System.out.println(value);
        }
//        Bhalchandra
//        19/11/1979
//        Sahasrabuddhe
//        9021192760
        /*   keys
        System.out.println("keys");
        Set<String> keys = myDetails.keySet();  //import java.util.Set;
        for(String key : keys){
            System.out.println(key);
        }
//        FirstName
//        DOB
//        SurName
//        Mobile
        */
        System.out.println("keys and values");
        Set<String> keyss = myDetails.keySet();  //import java.util.Set;
        for(String key : keyss){
            System.out.println(key + " : " + myDetails.get(key));
        }

        Set<Entry<String,String>> entrys = myDetails.entrySet();
        System.out.println(entrys);// Entries one line

        System.out.println("Entries for loop");
        for(Entry entry : entrys){
            System.out.println(entry);
        }

        System.out.println("getKey ");
        for( Entry entry : entrys){
            System.out.println(entry.getKey());

        }
        System.out.println("getvalue ");
        for( Entry entry : entrys){
            System.out.println(entry.getValue());

        }

        System.out.println("getkesys : getvalue ");
        for( Entry entry : entrys){
            System.out.println(entry.getKey() + " : " +entry.getValue());

        }
//        System.out.println(myDetails.size());
//        System.out.println(myDetails.isEmpty());
//        System.out.println(myDetails.containsKey("SurName"));
//        System.out.println(myDetails.containsValue("Bhalchandra"));
//        System.out.println(myDetails);
//        System.out.println(myDetails.remove("SurName", "Sahasrabuddhe"));
//        System.out.println(myDetails);

        /* Adding key and values to hashmap
        System.out.println(myDetails);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the key");
        String key = scan.next();
        System.out.println("Enter the value");
        String value = scan.next();

        if( myDetails.containsKey(key) == false){
            myDetails.put(key, value);
        }
        // myDetails.putIfAbsent(key, value);
        System.out.println(myDetails);
        */
        HashMap<String, String> myData = new HashMap<String, String>();
        // Adding entrys to myData
        myData.put("Email", "b.cont@redm.com");
        myData.put("Blood Group", "B+ve");

        //Merge two Hashmaps
        Set <String> keys = myData.keySet();
        for(String key : keys)
        {
            String value = myData.get(key);
            myDetails.put(key, value);
        }
        System.out.println(myDetails);

        System.out.println(myDetails);
         myDetails.putAll(myData);    // put all key and values in one line
        System.out.println(myDetails);

//        Replace
//        myData.replace("Email","g.contact");
//        System.out.println(myData);

          // Replace (not worked)
          // myData.replace(String key, String oldValue, String newValue);

          // clear all data
//        System.out.println(myData);
//        myData.clear();
//        System.out.println(myData);



    } // main
}
