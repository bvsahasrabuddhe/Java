package com.bvsahasrabuddhe;

import java.util.Scanner;

public class IndexOfElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for (int i=0;i<n; i++){
            a[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        int index = -1;
        for(int i=0;i<n;i++)
        {
            if (k==a[i]){
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
