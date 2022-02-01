package com.bvsahasrabuddhe;

import java.util.Scanner;

public class GoingToOffice {

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        long d = scan.nextLong();
        long oc = scan.nextLong();
        long of = scan.nextLong();
        long od = scan.nextLong();

        long cs = scan.nextLong();
        long cb = scan.nextLong();
        long cm = scan.nextLong();
        long cd = scan.nextLong();

        long ot = oc + od *(d-of);
        long ct = cb + (d/cs) * cm + (d*cd);
        if(ot<=ct ){
            System.out.println("Online Taxi");
        }
        else
        {
            System.out.println("Classic Taxi");
        }

/*
13
6 7 4
4 2 1 2
Online Taxi
 */
    }
}

