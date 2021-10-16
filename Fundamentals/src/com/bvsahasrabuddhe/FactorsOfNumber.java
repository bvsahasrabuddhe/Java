package com.bvsahasrabuddhe;

import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        number = scan.nextInt();

        for (int i = 1; i <= number; ++i) {

            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
