package com.bvsahasrabuddhe;

import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int count = 0;
        for(int i=0 ; i<s.length();i++){
            if(s.charAt(i) == 'a'){
                count++;
            }
        }
        System.out.println(count);
    }
}
