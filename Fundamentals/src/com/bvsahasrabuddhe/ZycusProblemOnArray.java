package com.bvsahasrabuddhe;

import java.util.Scanner;

public class ZycusProblemOnArray {

    static void reverserArray(int [] ar){
        int i = 0;
        int j = ar.length - 1;
        //System.out.println("This is " + j);
        while(i<=j){
            int temp = ar[i];
            //    System.out.println("Temp  "  + temp);
            ar[i]= ar[j];
            //     System.out.println(ar[i]);
            ar[j] = temp;
            i++;
            j--;
        }
    }

    static void swapElements(int[] ar, int i , int j) {
        int temp = ar[i];
        ar[i]= ar[j];
        ar[j] = temp;
    }
    static void printElement(int[] ar, int x){
        System.out.println(ar[x-1]);
    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n = 3;
        int [] ar =  {1,2,3};
        int q = 3;
        int[][] quries = {  {2 ,1, 2},
                {1, 1, 0}, {3 ,2 ,0 }};
        for (int i = 0; i < q; i++) {
            if(quries[i][0] == 1) {
                reverserArray(ar);
            } else if(quries[i][0] == 2){
                swapElements(ar, quries[i][1], quries[i][2]);

            } else
            {
                printElement(ar, quries[i][1]);

            }
        }
    }
}
