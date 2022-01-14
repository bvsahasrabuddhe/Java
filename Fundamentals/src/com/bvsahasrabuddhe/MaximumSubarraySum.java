package com.bvsahasrabuddhe;
import java.util.Scanner;
public class MaximumSubarraySum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();   // number of elements
        int k = scan.nextInt();   // sum
        int ar[] = new int[n];
        for (int i = 0; i < ar.length ; i++) {
            ar[i] = scan.nextInt();
        }
        int sum = 0; int max = 0;
        for (int i = 1; i <= ar.length ; i++) {
            for (int s = 0; s <= (ar.length   - i); s++) {
                for (int e = s; e <= (s + i) - 1; e++) {
                    sum = sum + ar[e];
                    sum = sum%k;

                    if (sum > max){
                        max = sum ;
                }
            }
        }
    }
        System.out.println(max);
}}
