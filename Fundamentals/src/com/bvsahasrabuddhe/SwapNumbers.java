package com.bvsahasrabuddhe;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        int x, y, t;// x and y are to swap
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of X and Y");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("Before Swapping");
        System.out.println(x);
        System.out.println(y);
        /*swapping */
        t = x;
        x = y;
        y = t;
        System.out.println("After Swapping");
        System.out.println(x);
        System.out.println(t);



    }
}
