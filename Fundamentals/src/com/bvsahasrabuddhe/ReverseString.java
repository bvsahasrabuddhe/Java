package com.bvsahasrabuddhe;

import java.util.Scanner;
import java.lang.String;
public class ReverseString {
    public static void main(String[] args) {
        String   rev = "";
        char ch;
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        for(int i = 0; i < s.length(); i++){
            ch= s.charAt(i); //extracts each character
            rev= ch+rev; //a
        }
        System.out.println(rev);




    }
}
