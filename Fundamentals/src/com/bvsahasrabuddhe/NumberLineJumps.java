package com.bvsahasrabuddhe;

import java.util.Scanner;

public class NumberLineJumps {

    static String numberLineJumps(int x1, int v1, int x2, int v2){

        if(v1>v2){
            int checkReminder = (x1-x2)%(v2-v1);

            if(checkReminder==0){
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int v1 = scan.nextInt();
        int x2 = scan.nextInt();
        int v2 = scan.nextInt();

        System.out.println(numberLineJumps(x1, v1,  x2,  v2));
    }
}
