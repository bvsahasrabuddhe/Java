package com.bvsahasrabuddhe;

import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[n];

        for(int i=0; i<arr.length; i++){
        arr[i] = scan.nextInt();
        }

//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                if(arr[i]< arr[j])
//                {
//                    int temp = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = temp;
//                }
//            }
//        }

        int max =  arr[0] ;
        for(int i=1; i<arr.length; i++){
        if (arr[i] > max){
            max = arr[i] ;
        }
        }
       // System.out.println(arr[n-1]);
        System.out.println(max);
    }
}
