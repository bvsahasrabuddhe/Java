package com.bvsahasrabuddhe;


 //Given a nth fibonacci number add first tow digit

public class FibonacciRecurssion {

    static int fibonaaci(int n){

        if(n==1 || n == 2){
            return 1;
        }
        return fibonaaci(n-1) + fibonaaci(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fibonaaci(4));
    }
}
