package com.bvsahasrabuddhe;

import java.util.Scanner;

public class RemoveSpecialCharacter {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        s = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);
    }
}
