package com.bvsahasrabuddhe;

import java.util.Scanner;

public class ResultantArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];
        int totalMultipliation = 1;
        for (int i=0; i< ar.length; i++){
            ar[i] = scan.nextInt();
            totalMultipliation = totalMultipliation * ar[i];
        }
        int resultant = 1;
        for (int i=0; i< ar.length; i++){
            resultant = totalMultipliation / ar[i];
            System.out.print(resultant + " ");
        }
    }
}
/*
5
3 5 1 4 2
40 24 120 30 60
 */