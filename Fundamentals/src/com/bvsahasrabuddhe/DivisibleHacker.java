package com.bvsahasrabuddhe;

import java.util.Scanner;

public class DivisibleHacker {

    static int divisibleSumPairs(int a[], int k){
        int count = 0;
       //  int a[] = new int [n];
        for (int i=0; i< a.length-1 ; i++){
           for (int j=i+1; j<a.length;j++){
               if((a[i] +a[j])%k ==0){
                   count++;
               }
           }
        }
        return count;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        int a[] = new int [n];
        for (int i=0; i< a.length ; i++)
        {
            a[i] = scan.nextInt();
        }
        System.out.println(divisibleSumPairs(a,k));

    }
}
