package com.bvsahasrabuddhe;

import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
         char ch = scan.next().charAt(0);
        int count = 0;
        for(int i=0 ; i<s.length();i++){
            if(s.charAt(i) == ch){
                count++;
            }
        }
        System.out.println(count);
    }
}
