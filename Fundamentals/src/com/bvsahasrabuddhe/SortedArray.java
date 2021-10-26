package com.bvsahasrabuddhe;

import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = scan.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i]< a[j])
                {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                 }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]);
        }

    }
}
