package com.bvsahasrabuddhe;

import java.util.Scanner;

public class MiniMaxSum {

//    public static void miniMaxSum(Long[] arr) {

//        long totalSum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            totalSum = totalSum + arr[i];
//        }
//        //System.out.println(maxCount);
//
//        long max = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//
//        long min = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//        }
//        System.out.println((totalSum - max) + " " + (totalSum - min));
//    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        int result = -1;
        for (int i = 0; i < arr.length; i++) {

               if (k==arr[i]) {
               result = i;
                break;
            }


        }System.out.println(result);
    }

}
/*
public class MiniMaxSum {

    public static void miniMaxSum(Long[] arr) {

        long totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum = totalSum + arr[i];
        }
        //System.out.println(maxCount);

        long max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        long min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println((totalSum - max) + " " + (totalSum - min));
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Long[] arr = new Long[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextLong();
        }
        miniMaxSum(arr);
    }

}
 */