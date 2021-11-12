package com.bvsahasrabuddhe;

import java.util.Scanner;

public class CircularArrayRotation {

    public static int [] circularArrayRotation(int[] a, int k, int[] queries){
        int [] b= new int[a.length];

        for (int i=0; i< a.length ; i++)
        {
            b[ (i+k)%a.length] = a[i];
        }
        int [] result = new int [queries.length];
        for (int i=0; i< result.length ; i++)
        {
            result[i] = b[queries[i]];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int q = scan.nextInt();

        int a[] = new int [n];
        for (int i=0; i< a.length ; i++)
        {
            a[i] = scan.nextInt();
        }
        int queries[] = new int [q];
        for (int i=0; i< queries.length ; i++)
        {
            queries[i] = scan.nextInt();
        }

        int[] result = circularArrayRotation(a,k,queries);
         for(int i=0; i<result.length;i++)
         {
             System.out.print(result[i]);
             System.out.print(" ");
         }

    }
}
