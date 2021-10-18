package com.bvsahasrabuddhe;

import java.util.Arrays;
import java.util.Scanner;

public class Ascendingorder {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int i, j;
        j = scan.nextInt();
        int a[] = new int[j];

        for ( i = 0; i <= a.length - 1; i++) {
            System.out.println("Enter the elements");
            a[i] = scan.nextInt();
        }
       Arrays.sort(a) ;

        for ( i = 0; i <= a.length - 1; i++) {
            System.out.println(a[i]);

        }

    }
}
