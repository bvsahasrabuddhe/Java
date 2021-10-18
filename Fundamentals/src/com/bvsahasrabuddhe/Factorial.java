package com.bvsahasrabuddhe;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        number = scan.nextInt();

        int i,fact=1;

        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println(fact);

    }
}
