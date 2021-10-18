package com.bvsahasrabuddhe;

import java.util.Scanner;

public class Smallestnumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int j;
        j = scan.nextInt();
        int a[] = new int[j];

        for (int i = 0; i <= a.length - 1; i++) {
            System.out.println("Enter the elements");
            a[i] = scan.nextInt();
        }


        System.out.println("Given array ");

        for (int i = 0; i < a.length; i++) {

            System.out.println(a[i]);
        }

        // Initialize minValue with first element of array.
        int minValue = a[0];

        // Loop through the array
        for (int i = 0; i < a.length; i++) {

            // Compare elements of array with minValue and
            // if condition true, make minValue to that
            // element

            if (a[i] < minValue)

                minValue = a[i];
        }

        System.out.println(
                "Smallest element present in given array: "
                        + minValue);
    }


    }

