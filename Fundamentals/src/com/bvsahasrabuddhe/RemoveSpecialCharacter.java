package com.bvsahasrabuddhe;

import java.util.Scanner;

public class RemoveSpecialCharacter {

    public static String removeSpecialCharacter(String s) {
        String t = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                t = t + c;
            }

        }
        return t;
    }
        public static void main (String[]args){

            Scanner scan = new Scanner(System.in);
            String s = scan.next();

            // s = s.replaceAll("[^a-zA-Z0-9]", "");
            String result = removeSpecialCharacter(s);
            System.out.println(result);
        }
    }
