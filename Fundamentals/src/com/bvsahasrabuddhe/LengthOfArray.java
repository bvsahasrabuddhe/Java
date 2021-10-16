package com.bvsahasrabuddhe;

import java.util.Scanner;

public class LengthOfArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int j;
        j = scan.nextInt();
        int a[] = new int[j];
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.println("Enter the elements");
            a[i] = scan.nextInt();
        }
        System.out.println(a.length);
    }
}