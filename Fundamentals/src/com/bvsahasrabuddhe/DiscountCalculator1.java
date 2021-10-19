package com.bvsahasrabuddhe;

import java.util.Scanner;

public class DiscountCalculator1 {

    public static void calculateDiscount(int ic, int sc, int tc, int nc) {
        int  card1, card2 =0 ,   sale2;
        card1 = (ic/100) + (sc*3/100) + (tc*2/100) + (nc*1/100) ;
        sale2 = ic+sc+tc+nc;


        if(sale2 >100000) {
            card2 = sale2 * 9/100;
        }
        else if (sale2 >= 50001 && sale2  <= 100000) {
            card2 = sale2 * 7/100;
        }
        else if (sale2 >= 25001 && sale2  <= 50000) {
            card2 =sale2 * 5/100;
        }
        if(card1>card2) {
            System.out.println(card1);
        }
        else {
            System.out.println(card2);
        }


    }


    public static void main(String[] args) {

//        int ic, sc, tc, nc, card1=1, card2=1 ;
//        Scanner scan= new Scanner(System.in);
//
//        ic= scan.nextInt();
//        sc= scan.nextInt();
//        tc= scan.nextInt();
//        nc= scan.nextInt();
//
//        calculateDiscount( ic, sc,  tc, nc);

       // int ic, sc, tc, nc, card1=1, card2=1 ;
        int n1, n2, n3, n4, card1, card2 = 0,   sale2;
        Scanner sc= new Scanner(System.in);

        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        n4=sc.nextInt();

        calculateDiscount( n1, n2,  n3, n4);
    }
}
