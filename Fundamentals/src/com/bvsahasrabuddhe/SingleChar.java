package com.bvsahasrabuddhe;

import java.util.Scanner;

public class SingleChar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        for(int i = 0; i < s.length(); i++){
            System.out.println(s.charAt(i));
        }
    }
}
