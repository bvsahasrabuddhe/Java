package com.bvsahasrabuddhe;

import java.util.Scanner;

public class BirthdayCakeCandles {

    public static void birthdayCakeCandles(int[] candles) {
        // Write your code here
        int max = candles[0];
        int count = 0;
        for (int i = 0; i < candles.length; i++) {
            if (candles[i] > max) {
                max = candles[i];
            }
        }
        for (int i = 0; i < candles.length; i++) {
            if (candles[i] == max) {
                count++;
            }
        }
        System.out.println(count);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] candles = new int[n];

        for (int i = 0; i < candles.length; i++) {
            candles[i] = scan.nextInt();
        }
        birthdayCakeCandles(candles);
    }
}
