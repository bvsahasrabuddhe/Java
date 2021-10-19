package com.bvsahasrabuddhe;

import java.util.Scanner;

public class CountDivisors {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n1,n2, n3, counter=0;
        n1 = scan.nextInt();
        n2 = scan.nextInt();
        n3 = scan.nextInt();

       if (n1<n2) {
           for (int i = n1; i <= n2; i++) {

               if (i % n3 == 0) {
                   System.out.print(i + " ");
                   counter++;
               }
           }
               }
        else
       {
          for (int i = n2; i <= n1; i++) {

           if (i % n3 == 0) {
               System.out.print(i + " ");
               counter++;
           }
       }
       }
        System.out.println();
        System.out.println(counter);

    }
}
