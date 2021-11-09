package com.bvsahasrabuddhe;

import java.util.Scanner;

public class HurdleRace {

    static int hurdleRace(int k, int [] height){
        int max = 0;
        for (int i=0; i< height.length ; i++)
        {
            if (height[i] > max){
                max = height[i];
            }
        }
        if (max > k){
            return max - k;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        int a[] = new int [n];
        for (int i=0; i< a.length ; i++)
        {
            a[i] = scan.nextInt();
        }
        System.out.println(hurdleRace(k, a));

    }
}
