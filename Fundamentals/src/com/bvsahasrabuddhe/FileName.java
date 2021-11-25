package com.bvsahasrabuddhe;

import java.util.Scanner;

public class FileName {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
            String[] arrayOfString = s.split(" ", 5);

            int numberOfItems = arrayOfString.length;
            for (int i=0; i<numberOfItems; i++)
            {
                 String elements = arrayOfString[i];
                 elements = elements.toLowerCase();
                 String cap = elements.substring(0, 1).toUpperCase() + elements.substring(1);
                System.out.print(cap);
            }
    }
}
