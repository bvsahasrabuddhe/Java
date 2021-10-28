package com.bvsahasrabuddhe;

import java.util.Scanner;

public class TransposeofMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[][] = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                a[i][j] = scan.nextInt();
            }
        }
        int res[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                res[j][i] = a[i][j];
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
