package com.bvsahasrabuddhe;

import java.util.Arrays;

public class MaxandMinArraySum {

    public static void main(String[] args) {
        int  a[] = {13, 5, 11, 9, 7};
        Arrays.sort(a);
        int sum = 0;
        for (int i=0; i< a.length - 1 ; i++)
        {
            sum = sum + a[i];
        }
        System.out.println(sum);  // Minimum sum is 5 + 7 + 9 + 11 = 32

        int sum1 = 0;
        for (int i= 1; i< a.length   ; i++)
        {
            sum1 = sum1 + a[i];
        }
        System.out.println(sum1);   //maximum sum is 7 + 9 + 11 + 13 = 40


        int add = 0;
        for (int i=0; i< a.length  ; i++)
        {
            add = add + a[i];
        }
        System.out.println(add - a[a.length-1]);
        System.out.println(add - a[0]);


//        for (int i = 0,  j = 1; i< a.length - 1 , j < a.length ; i++, j++)
//        {
//            sum = sum + a[i];
//            sum1 = sum1 + a[j];
//        }
//        System.out.println(sum);
//        System.out.println(sum1);
     }



}
