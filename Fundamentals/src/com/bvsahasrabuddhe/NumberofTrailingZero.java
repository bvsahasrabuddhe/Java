package com.bvsahasrabuddhe;

import java.util.Scanner;

public class NumberofTrailingZero {

    static int numberOfTrailingZero(int n){
        return (int) (Math.log10((n & n-1) ^ n) / Math.log10(2));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(numberOfTrailingZero(n));
    }
}
