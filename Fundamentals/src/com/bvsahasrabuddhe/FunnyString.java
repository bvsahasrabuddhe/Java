package com.bvsahasrabuddhe;

import java.util.Scanner;

public class FunnyString {
    static String funnyString(String s)  {

        for (int i = 0, j= s.length()-1; i<j; i++,j--) {
            if ((s.charAt(i) - s.charAt(i+1)) == (s.charAt(j) - s.charAt(j-1))
               || -(s.charAt(i) - s.charAt(i+1)) == (s.charAt(j) - s.charAt(j-1)))
            {
            }
            else {
                return "Not Funny";
                 }
        }
            return "Funny";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfTestCases = scan.nextInt();
        String results[] = new String[numberOfTestCases];

        for (int i = 0; i < numberOfTestCases; i++) {
            String s = scan.next();
            String result = funnyString(s);
            results[i] = result;
        }
        for (int i=0; i<numberOfTestCases; i++)
        {
            System.out.println(results[i]);
        }
    }
}
