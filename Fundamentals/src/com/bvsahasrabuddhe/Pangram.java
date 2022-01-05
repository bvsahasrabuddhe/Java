package com.bvsahasrabuddhe;

import java.util.Scanner;

public class Pangram {


    static boolean isPangram(String s){
        String t = "abcdefghijklmnopqrstuvwxyz";
        s = s.toLowerCase();
        System.out.println(s);
        int count =0;
        for(int i = 0; i< t.length(); i++)
        {
            if(s.indexOf(t.charAt(i)) >= 0){
               // System.out.println(t.charAt(i));
                count++;}
              else
                break;
              }

            System.out.println(count);
            if (count==26)
                return true;
              else
                return false;
        }
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
              String s = "A quick brown fox jumps over the lazy dog";
            //String s = "abc";
             System.out.println(isPangram(s));
    }
}
