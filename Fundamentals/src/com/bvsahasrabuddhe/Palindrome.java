package com.bvsahasrabuddhe;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long r,sum=0,temp, n;
        n = scan.nextLong();
        temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

}

