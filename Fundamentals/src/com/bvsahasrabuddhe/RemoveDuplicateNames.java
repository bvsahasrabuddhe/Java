package com.bvsahasrabuddhe;

import com.sun.source.util.Trees;

import java.util.Scanner;
import java.util.TreeSet;

public class RemoveDuplicateNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String arr[] = s.split(",");

       TreeSet<String> names = new TreeSet<String>();
       for(int i=0; i< arr.length; i++){
           names.add(arr[i]);
       }
        System.out.println(names);

        //Result
        // bob,mark,bilbo,mark,bob
        //[bilbo, bob, mark]
    }
}
