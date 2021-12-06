package com.bvsahasrabuddhe;
import java.util.Scanner;

public class Assinment {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        float pi =  3.142f;

        int r = scan.nextInt();

        System.out.println("Area of circle =" + pi*r*r);

    }
}