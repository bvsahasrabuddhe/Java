package com.bvsahasrabuddhe;

import java.util.Scanner;

public class StringCount {
    public static void main(String[] args) {
        int counter = 0;
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        for(int i = 0; i < s.length(); i++){
            counter++;
        }
        System.out.println(counter);
    }

}
