package com.bvsahasrabuddhe;

import java.io.PrintStream;
import java.util.Scanner;
import java.lang.Integer;
public class DiscountCalculator {


    public static void main(String[] args) {

        int n1, n2, n3, n4, card1, card2 = 0,   sale2;
        Scanner sc= new Scanner(System.in);

        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        n4=sc.nextInt();

        card1 = (n1*7/100) + (n2*3/100) + (n3*2/100) + (n4*1/100) ;


        sale2 = n1+n2+n3+n4;


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
}
