package com.bvsahasrabuddhe;

import java.util.Scanner;

public class SumofEvenOdd {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }

        int sum_even = 0, sum_odd = 0 ;
        for(int i=0; i<arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum_even += arr[i];
            } else {

                sum_odd += arr[i];
            }
        }
        System.out.println("Sum of Even " + sum_even);
        System.out.println("Sum of Odd " + sum_odd);
    }
}
