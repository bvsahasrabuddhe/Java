package com.bvsahasrabuddhe;

import java.util.Scanner;

public class InsertionSort {

    static boolean insertionSort(int[]ar){
        for(int i = 1; i<ar.length;i++){
            int key = ar[i];
            int j = i-1;
            while(j>=0 && ar[j]>key){
                ar[j+1] = ar[j];
                j--;
            }
            ar[j+1] = key;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ar[] = new int[n];

        for(int i =0 ; i<ar.length;i++){
            ar[i]= scan.nextInt();
        }
        insertionSort(ar);
        for(int i =0 ; i<ar.length;i++){
            System.out.print(ar[i] + " ");
        }

    }

}
