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
        System.out.println(sum);

        int sum1 = 0;
        for (int i= 1; i< a.length   ; i++)
        {
            sum1 = sum1 + a[i];
        }
        System.out.println(sum1);

    }



}
