package com.bvsahasrabuddhe;
import java.util.Scanner;

public class HackerrankProblems {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String t = "hackerrank";
        int i = 0, j=0;
        while(i< s.length() && j< t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        if(j == t.length()){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}


/*  Hackerrank paste code in method only
String t = "hackerrank";
        int i = 0, j=0;
        while(i< s.length() && j< t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        if(j == t.length()){
            return "YES";
        }
        else{
            return "NO";
        }
 */

//        int mask = 0x000F;
//        int value = 0x2222;

//        try {
//            Float f1 = new Float("3.0");
//            int x = f1.intValue();
//            byte b = f1.byteValue();
//            double d = f1.doubleValue();
//            System.out.println(x+b+d);
//        } catch (NumberFormatException e) {
//            System.out.println("bad number");
//        }






