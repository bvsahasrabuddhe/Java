package com.bvsahasrabuddhe;

import java.util.Scanner;

public class FindCharacters {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        int upperCase = 0, lowerCase = 0, number = 0, specialCase = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c >= 'A' && c <='Z'){
                upperCase++;
            } else if(c >= 'a' && c <='z'){
                lowerCase++;
            } else if (c >= '0' && c <='9'){
                number++;
            } else {
                specialCase++;
            }
        }
        System.out.println("Upper Case = " + upperCase);
        System.out.println("Lower Case = " + lowerCase);
        System.out.println("Numbers = " + number);
        System.out.println("Special Case = " + specialCase);
    }
}
