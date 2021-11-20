package com.bvsahasrabuddhe;

import java.util.Scanner;

public class IndexOfCharacher {
    static int indexOfCharacter(String s, char key) {
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == key) {
                return i;
            }
        }
        return -1;
    }
        public static void main (String[]args){
            Scanner scan = new Scanner(System.in);
            String s = scan.next();
            String t = scan.next();
            char key = t.charAt(0);
            // s = s.replaceAll("[^a-zA-Z0-9]", "");
            int result = indexOfCharacter(s, key);
            System.out.println(result);
        }

    }
