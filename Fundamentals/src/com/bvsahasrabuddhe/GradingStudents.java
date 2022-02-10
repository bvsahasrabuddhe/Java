package com.bvsahasrabuddhe;

import java.util.Scanner;

public class GradingStudents {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=38){
                if(arr[i]%5>=3){
                    arr[i] = arr[i] + (5-arr[i]%5);
                    System.out.println(arr[i]);
                } else
                {
                    System.out.println(arr[i]);
                }
            }
            else
            {
                System.out.println(arr[i]);
            }
        }
    }
}
