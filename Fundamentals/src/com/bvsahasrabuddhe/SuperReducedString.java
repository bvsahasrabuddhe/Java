package com.bvsahasrabuddhe;

import java.util.Arrays;
import java.util.Scanner;

public class SuperReducedString {

    public static String superReducedString(String s){
        char[] ar = s.toCharArray();
        Arrays.sort(ar);
        int i = 0;
        String reducedString ="";
        while(i< ar.length)
        {
            if(i< ar.length - 1  && ar[i] == ar[i+1])
            {
                i = i + 2;
            }
            else
            {
                char ch= s.charAt(i); //extracts each character
                reducedString = reducedString + ch;
                i++;
            }
        }
        if(reducedString ==""){
            return "Empty String";
        }
        else
        {
            return reducedString;
        }
    }
    public static void main(String[] args) {
        //String s = "aaabccddd";
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println(superReducedString(s));
    }
}
