package com.bvsahasrabuddhe;

import java.util.Scanner;

public class PalindromeStringRecurssion {

    static boolean isPalindrome(String s, int i, int j){
        if(s.charAt(i) != s.charAt(j)){
            return false;
        }
        if(j<=i){
            return true;
        }
        return isPalindrome(s,i+1, j-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        System.out.println(isPalindrome(s,0,s.length()-1));
    }
}
