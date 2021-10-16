package com.bvsahasrabuddhe;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int j;
        j = scan.nextInt();
        int a[] = new int[j];

        for (int i = 0; i <= a.length - 1; i++) {
            System.out.println("Enter the elements");
            a[i] = scan.nextInt();
        }

        int odd =0, even = 0;
        for(int i = 0; i < j; i++)
        {
            if(a[i] % 2 == 1)
                odd++;
            else
                even++;
        }
        System.out.println(odd);
        System.out.println(even);

    }

}
