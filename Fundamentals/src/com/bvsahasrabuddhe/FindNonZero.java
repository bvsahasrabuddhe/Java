package com.bvsahasrabuddhe;

import java.util.Scanner;

public class FindNonZero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int j;
        j = scan.nextInt();
        int a[] = new int[j];

        for (int i = 0; i <= a.length - 1; i++) {
            System.out.println("Enter the elements");
            a[i] = scan.nextInt();
        }

        for (int i = 0; i <= a.length; i++) {
            if (a[i] == 0) {

                System.out.println(a[i]);
                System.out.println(a.length - 1);
                //a[i] ++;
                //j++;
            }
        }
        //System.out.println(j);
        System.out.println(a.length);
    }
}


