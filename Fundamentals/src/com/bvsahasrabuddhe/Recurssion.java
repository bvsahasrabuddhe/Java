package com.bvsahasrabuddhe;

public class Recurssion {
 //   static void fun(int n){
    static int factorial(int n){
        if (n==0 || n ==1){
            return 1;
        }
        return n* factorial(n-1);
        }
//        if(n<1)
//        {
//            return;
//        }
//        System.out.println(n);
//        fun(n-1);
   // }

    public static void main(String[] args) {
//        fun(3);
        int n = 5;
        System.out.println(factorial(n));
//        for(int i=3;i>=1;i--){
//            System.out.println(i);
//        }
    }
}
