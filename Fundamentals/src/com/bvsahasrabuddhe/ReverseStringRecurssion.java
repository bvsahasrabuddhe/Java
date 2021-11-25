package com.bvsahasrabuddhe;

import java.util.Scanner;

public class ReverseStringRecurssion {

    static String reverseString(String s, String r, int i){
        if(i<0){
            return r;
         }
          return   reverseString(s, r+s.charAt(i), i-1) ;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println(reverseString(s, "", s.length()-1));
    }
}
