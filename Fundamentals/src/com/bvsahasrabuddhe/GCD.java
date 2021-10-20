package com.bvsahasrabuddhe;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n  = scan.nextInt();
        int m  = scan.nextInt();
        int min = 0;
        if(n<m){
            min = n;
        }
        else
        {
            min = m;
        }
        int gcd=0;
        for (int i = 1; i<=min; i++)
        {
            if(n%i == 0 && m%i ==0)
            {
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}
