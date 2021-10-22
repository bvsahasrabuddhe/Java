package com.bvsahasrabuddhe;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int counter = 0;
        String  s = scan.nextLine();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) >='A' && s.charAt(i) <='Z'){
                counter++;
            }
        }
        counter = counter + 1;
        System.out.println(counter);
    }
}
