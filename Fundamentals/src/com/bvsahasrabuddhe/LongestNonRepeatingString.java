package com.bvsahasrabuddhe;

import java.util.Scanner;

public class LongestNonRepeatingString {

    static void nonRepSubString(String s){
        String res = "";
        for(int i=0; i< s.length();i++){
            String temp = "";
            for(int j=i; j< s.length();j++){
            if(temp.indexOf(s.charAt(j)) ==-1){
             temp =temp + s.charAt(j);
            }else
            {
                break;
            }
            if(temp.length() > res.length()){
                res = temp;
            }
            }
        }

        System.out.println(res);
    }

    static long RepeatedString(String s, long n) {
        long countA = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                countA++;
            }
        }
        long count1 = n / s.length() * countA;
        long count2 = 0;

        for (int i = 0; i < n % s.length(); i++) {
            if (s.charAt(i) == 'a') {
                count2++;
            }

        }
        return count1 + count2;
    }


    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.next();
    long n = scan.nextInt();
   // String s = "tapacademy";
  // nonRepSubString(s);
        System.out.println(RepeatedString(s,n));
    }
}
