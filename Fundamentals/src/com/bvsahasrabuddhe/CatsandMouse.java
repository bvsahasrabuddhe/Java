package com.bvsahasrabuddhe;

import java.util.Scanner;


public class CatsandMouse {



        public static String catsandMouse(int x, int y, int z) {

            if (Math.abs(x - z) == Math.abs(y - z)) {
                return "Mouse C";
            }
            else if (Math.abs(x - z) < Math.abs(y - z)) {
                return "Cat A";
            } else      {
                return "Cat B";
            }
        }
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            String result[] = new String[n];

            for (int i = 0; i < n ; i++) {
                int x = scan.nextInt();
                int y = scan.nextInt();
                int z = scan.nextInt();
                String ans = catsandMouse(x,  y,  z);
                result[i] = ans;
            }
            for (int i = 0; i < n ; i++) {

                System.out.println(result[i]);
            }

        }
    }