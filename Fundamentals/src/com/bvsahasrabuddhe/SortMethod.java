package com.bvsahasrabuddhe;

import java.util.Scanner;

public class SortMethod {

    // Selection sort method +
    static void selectionSort(int[] ar) {
        for (int i = 0; i < ar.length - 1; i++) {
            int min_i = i;
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[j] < ar[min_i]) {
                    min_i = j;
                }
            }
                    int temp = ar[min_i];
                    ar[min_i] = ar[i];
                    ar[i] = temp;

        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ar[] = new int[n];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }
        //  insertionSort(ar);
        selectionSort(ar);
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }

    }
}