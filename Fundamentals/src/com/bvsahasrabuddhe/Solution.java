package com.bvsahasrabuddhe;

import java.util.Scanner;


import java.util.Scanner;
class Solution{
//    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        int number = scan.nextInt();
//        int i, prime = 1;
//
//
//        for(i = 2; i < number; i++) {
//            if((number % i) == 0) {
//                prime = 0;
//            }
//        }
//
//        if (prime == 1){
//            System.out.format("%d is prime number." , number);
//        }
//        else
//        {   System.out.format("%d is not a prime number." , number);
//        }


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int i, prime = 1;


        for(i = 2; i < number; i++) {
            if((number % i) == 0) {
                prime = 0;
            }
        }

        if (prime == 1){
            System.out.format("%d is prime number." , number);
        }
        else
        {   System.out.format("%d is not a prime number." , number);
        }
    }
}