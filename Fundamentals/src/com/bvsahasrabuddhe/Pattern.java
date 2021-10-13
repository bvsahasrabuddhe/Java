package com.bvsahasrabuddhe;

public class Pattern {

    public static void main(String[] args) {

        /*
         Pattern 1
         *****

         */
        System.out.println("Pattern 1 : Printing five start in one row");
        for (int i = 1; i <= 5; i++) {
             System.out.print("*");
             }
           System.out.println();
           System.out.println();
           System.out.println("Pattern 2 : Printing rectangle");
             /*
             Pattern 2
             *****
             *****
             *****
             *****
             *****
             */
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println("Pattern 3 : Printing triangle");
         /*
         Pattern 3
         *
         **
         ***
         ****
         *****

         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println("Pattern 4 : Printing triangle down");
         /*
         Pattern 4
         *****
         ****
         ***
         **
         *

         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=5-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println("Pattern 5 : Printing rectangle with initial 5 space");
             /*
             Pattern 5
             -----*****
             -----*****
             -----*****
             -----*****
             -----*****
             */
        for (int i = 1; i <= 5; i++) {

            for(int k=1; k<=5; k++){
                System.out.print(" ");
            }

            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println("Pattern 6 : Printing  ");
             /*
             Pattern 6
             -----*
             ----**
             ---***
             --****
             -*****
             */
        for (int i = 1; i <= 5; i++) {

            for(int k=1; k<=5-i+1; k++){
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println("Pattern 7 : Printing  ");
             /*
             Pattern 7
             -*****
             --****
             ---***
             ----**
             -----*

             */
        for (int i = 1; i <= 5; i++) {

            for(int k=1; k<=i; k++){
                System.out.print(" ");
            }

            for (int j = 1; j <= 5-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println();
        System.out.println("Pattern 8 : Printing  ");
             /*
             Pattern 8
             -*****
             --*****
             ---*****
             ----*****
             -----*****
             */
        for (int i = 1; i <= 5; i++) {

            for(int k=1; k<=i; k++){
                System.out.print(" ");
            }

            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println();
        System.out.println("Pattern 9 : Printing  ");
             /*
             Pattern 9
             -----*****
             ----*****
             ---*****
             --*****
             -*****
             */
        for (int i = 1; i <= 5; i++) {

            for(int k=1; k<=5-i+1; k++){
                System.out.print(" ");
            }

            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println();
        System.out.println("Pattern 10 : Printing  ");
             /*
             Pattern 10
             -----*
             ----***
             ---******
             --********
             -**********
             */
        for (int i = 1; i <= 5; i++) {

            for(int k=1; k<=5-i+1; k++){
                System.out.print(" ");
            }

            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println();
        System.out.println("Pattern 11 : Printing  ");
             /*
             Pattern 11
             -**********
             --********
             ---******
             ----***
             -----*

             */
        for (int i = 1; i <= 5; i++) {

            for(int k=1; k<=i; k++){
                System.out.print(" ");
            }

            for (int j = 1; j <= 11-2*i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println();
        System.out.println("Pattern 12 : Printing  ");
             /*
             Pattern 12
             -**********
             --********
             ---******
             ----***
             -----*

             */
        for (int i = 1; i <= 5; i++) {

            for(int k=1; k<=i; k++){
                System.out.print(" ");
            }

            for (int j = 1; j <= 11-(2*i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println("Pattern 13 : Printing  ");
             /*
             Pattern 13
             -----*****
             -----*   *
             -----*   *
             -----*   *
             -----*****

             */

        for (int i = 1; i <= 5; i++) {

            for(int k=1; k<=5; k++){
                System.out.print(" ");
            }

            for (int j = 1; j <= 5; j++) {

                if(i==1 || i==5 ||  j==1 || j==5){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        }  // main
    }
