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

////        byte b = 127;
////        b++;
////        b++;
////        System.out.println(b);
//        int arr[] = new int[5];
//        System.out.println(arr);
        Scanner scan = new Scanner(System.in);
        int j;
        j = scan.nextInt();
        int a [] = new int[j];
        for(int i=0; i<=a.length-1; i++) {
            System.out.println("Enter the elements");
                a[i] = scan.nextInt();
        }
        System.out.println(a.length);


    }
}