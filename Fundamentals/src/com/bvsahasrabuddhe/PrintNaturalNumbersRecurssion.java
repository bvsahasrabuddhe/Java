package com.bvsahasrabuddhe;

import java.util.Scanner;

public class PrintNaturalNumbersRecurssion {

    // Recurssion example
    static void printN(int n){
        if(n==0){
            return;
        }
        printN(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n  = scan.nextInt();

        printN(n);
    }
}
