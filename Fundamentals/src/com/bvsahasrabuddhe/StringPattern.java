package com.bvsahasrabuddhe;

import java.util.Scanner;

public class StringPattern {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int counter = 0;
        String  s = scan.nextLine();
//        System.out.println(s.toLowerCase());
//        System.out.println(s.toUpperCase());
        for(int i=0; i<s.length()-1; i= i+3){
            if(s.charAt(i)!='S'){
                counter++;
            }
            if(s.charAt(i+1)!='O'){
                counter++;
            }
            if(s.charAt(i+2)!='S'){
                counter++;
        }

        }
        System.out.println(counter);

    }
}
