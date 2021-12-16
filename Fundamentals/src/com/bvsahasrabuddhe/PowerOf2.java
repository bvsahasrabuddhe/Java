package com.bvsahasrabuddhe;

import java.util.Scanner;

// Program to check power of two or not
public class PowerOf2 {
        static boolean powerOf2(int n){
            if(n==0){
                return false ;
            }
            return  (n & (n-1)) ==0;
        }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(powerOf2(n));
    }
}
