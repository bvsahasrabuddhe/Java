package com.bvsahasrabuddhe;

import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }

        int p = 0;
        int vp = 0;

        if(ar[0] > ar[1]) {
            p = ar[0];
            vp = ar[1];
        }
        else {
            p = ar[1];
            vp = ar[0];
        }

        for(int i = 2; i < ar.length; i++)
        {
            if(ar[i] > p)
            {
                vp = p;
                p = ar[i];
            }
            else if(ar[i] > vp)
            {
                p = ar[i];
            }
        }

        System.out.println(vp);
    }

}
