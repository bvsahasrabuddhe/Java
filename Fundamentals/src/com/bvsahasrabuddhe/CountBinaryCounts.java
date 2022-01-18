package com.bvsahasrabuddhe;

import java.util.Scanner;

public class CountBinaryCounts {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int co = scan.nextInt();
        int c1 = scan.nextInt();
        int tc = 0;
        while(true) {
            int idx = -1;
            if((idx = s.indexOf("01")) != -1){
                tc = tc+co;
                s = s.substring(0, idx) + s.substring(idx+2);
            }
            else if((idx = s.indexOf("10")) != -1) {
                tc = tc+c1;
                s = s.substring(0, idx) + s.substring(idx+2);
            }
            else {
                break;
        }

        }
        System.out.println(tc);
    }
}
