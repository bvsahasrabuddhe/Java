package com.bvsahasrabuddhe;

import java.util.Scanner;
// second time commit
public class CountNumberOfDidits {
    static int countDidits(int n){
        int count = 0;
        while(n>0){
            n = n /10;
            count++;
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(countDidits(n)) ;
    }
}
