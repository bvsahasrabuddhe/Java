package com.bvsahasrabuddhe;

import java.util.Scanner;

public class SumOfArray {
    public static int sumOfArray(int[] a) {
        int sum = 0;
        for (int i=0; i< a.length ; i++)
        {
            sum = sum +  a[i] ;
        }
        //System.out.println(sum);


        return sum;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int a[] = new int [n];
        for (int i=0; i< a.length ; i++)
        {
            a[i] = scan.nextInt();
        }
        System.out.println(sumOfArray(a));
    }
}
