package com.bvsahasrabuddhe;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class OddOneOut {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        int a[] = new int[n-1];
        for (int i=0; i<a.length; i++){
            a[i] = scan.nextInt();
            sum = sum + a[i] ;// scan.nextInt();
        }
         //System.out.println(sum);
        int s = n*(2+(n-1)*2) / 2 ;
       // System.out.println(s);
         int MissingNumber = s - sum;
        System.out.println(MissingNumber);
    }
}
