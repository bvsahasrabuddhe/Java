package com.bvsahasrabuddhe;

import java.util.Scanner;

public class TriangleGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (a+b+c == 180) {
          if   (a == 60 && b == 60 && c == 60) {
                System.out.println("Prize 3");
            } else if (a == 90 || b == 90 || c == 90)
            {
                System.out.println("Prize 2");
            } else
            {
                System.out.println("Prize 1");}
            } else
             {
                System.out.println("No prize");
             }
        }

    }

//    static void checkTriangle(int x, int y, int z, int a1, int b1, int c1)
//    {
//        int a1 = x*x;
//        int b1 = y*y;
//        int c1 = z*z;
//        // Check for equilateral triangle
//        if (x == y && y == z )
//            System.out.println("Equilateral Triangle");
//
//            // Check for isosceles triangle
//        else if (c1== a1+b1 || b1==a1+c1 || a1==b1+c1)
//
//
//            System.out.println("Isosceles Triangle");
//
//            // Otherwise scalene triangle
//        else
//            System.out.println("Scalene Triangle");
//    }
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter three sides:");
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        int z = sc.nextInt();
//        if(x>0 && y>0 && z>0){
//
//            if(c1== a1+b1 || b1==a1+c1 || a1==b1+c1){
//                System.out.println("Right-Angle Triangle");
//            }
//            else {
//                System.out.println("Not a right-angle Triangle");
//            }
//        }
//        else{
//            System.out.println("Invalid");
//        }
//
//
//
//
//    }

