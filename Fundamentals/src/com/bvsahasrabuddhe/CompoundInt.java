package com.bvsahasrabuddhe;

import java.util.Scanner;

public class CompoundInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p, r, t, n ;
        p = scan.nextInt();
        r = scan.nextInt();
        t = scan.nextInt();
        n = scan.nextInt();
        double amt =   (p * Math.pow(1+(r/n), n*t));
        double cint = amt - p ;
        System.out.println(cint);
    }
}
