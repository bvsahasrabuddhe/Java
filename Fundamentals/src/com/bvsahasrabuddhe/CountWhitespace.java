package com.bvsahasrabuddhe;

import java.util.Scanner;

public class CountWhitespace {
    public static void main(String[] args) {
        int counter = 0;
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {

                counter++;
            }
        }
        System.out.println(counter);
    }
}