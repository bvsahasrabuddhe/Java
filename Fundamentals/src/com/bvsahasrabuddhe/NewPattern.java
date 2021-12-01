package com.bvsahasrabuddhe;

public class NewPattern {

    public static void main(String[] args) {
        int n = 5;
        System.out.println();
        System.out.println();
        System.out.println("Pattern 1 : Printing rectangle");
             /*
             Pattern 1
            1 1 1 1 1
            1 2 1 1 1
            1 1 3 1 1
            1 1 1 4 1
            1 1 1 1 5
             */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n; j++) {
                if(i==j){
                    System.out.print(j + " ");
                } else {
                    System.out.print("1" + " ");
                }

            }
            System.out.println();
        }


        System.out.println();
        System.out.println();
        System.out.println("Pattern extra : Printing rectangle");
             /*
             Pattern extra
            1 1 1 1 1
            2 2 1 1 1
            2 3 3 1 1
            2 3 4 4 1
            2 3 4 5 5
             */
//        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n; j++) {

                if(i==j){
                    System.out.print(j + " ");
                }else if(j<=i){
                    System.out.print(j+1 + " ");
                }
                else  {
                System.out.print("1" + " ");
            }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println("Pattern 2 : below");
             /*
             Pattern 2
            1 1 1 1 1
            1 2 1 1 1
            1 2 3 1 1
            1 2 3 4 1
            1 2 3 4 5
             */

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n; j++) {

                if(i==j){
                    System.out.print(j + " ");
                }else if(j<=i){
                    System.out.print(j + " ");
                }
                else  {
                    System.out.print("1" + " ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println("Pattern extra : below");
             /*
             Pattern etxra
            1 1 1 1 1
            2 2 1 1 1
            2 3 3 1 1
            2 3 4 4 1
            2 3 4 5 5

             */

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n; j++) {

                if(i==j){
                    System.out.print(j + " ");
                }else if(j<=i) {
                    System.out.print(j + 1 + " ");
                }
//                } else if(j<i){
//                    System.out.print(i+1 + " ");
//                }
                else  {
                    System.out.print("1" + " ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();


        System.out.println("Pattern 3 : below");
             /*
             Pattern 3

            1 1 1 1 1
            2 2 1 1 1
            3 3 3 1 1
            4 4 4 4 1
            5 5 5 5 5
             */

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n; j++) {

                if(i==j){
                    System.out.print(j + " ");
                }else if(j<=i) {
                    System.out.print(i  + " ");
                }
//                } else if(j<i){
//                    System.out.print(i+1 + " ");
//                }
                else  {
                    System.out.print("1" + " ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        System.out.println("Pattern 4 : below");
             /*
             Pattern 4

            5 5 5 5 5
            4 4 4 4 4
            3 3 3 3 3
            2 2 2 2 2
            1 1 1 1 1
             */

        for (int i = 0; i <= n-1; i++) {
            for (int j = 0; j <=n-1; j++) {
                    System.out.print(n-i + " ");
             }
            System.out.println();
        }

        System.out.println();
        System.out.println();


        System.out.println("Pattern 5 : below");
             /*
             Pattern 5

            5 4 3 2 1
            5 4 3 2 1
            5 4 3 2 1
            5 4 3 2 1
            5 4 3 2 1
             */

        for (int i = 0; i <= n-1; i++) {
            for (int j = 0; j <=n-1; j++) {


                System.out.print(n-j + " ");
//                }else if(j<=i) {
//                    System.out.print(i  + " ");
//                }
//                } else if(j<i){
//                    System.out.print(i+1 + " ");
//                }
//                else  {
//                    System.out.print("1" + " ");
//                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();


        System.out.println("Pattern 6 : below");
             /*
             Pattern 6

            101010
            010101
            101010
            010101
            101010
             */

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=6/2; j++) {

                if(i%2 !=0)
                {
                    System.out.print("1"+ " ");
                    System.out.print("0"+ " ");
                }

                 else if(i%2 ==0) {
                    System.out.print("0"+ " ");
                    System.out.print("1"+ " ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        System.out.println("Pattern 7 : below");
             /*
             Pattern 7

            1 1 1 1 1
            0 1 1 1 1
            0 0 1 1 1
            0 0 0 1 1
            0 0 0 0 1
             */

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n; j++) {

                if(i<=j )
                {
                    System.out.print("1"+ " ");
                }
                else if(j<=i) {
                    //System.out.print("0"+ " ");
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }


        System.out.println();
        System.out.println();

        System.out.println("Pattern 8 : below");
             /*
             Pattern 8

            10000
            02000
            00300
            00040
            00005
             */

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n; j++) {

                if(i==j)
                {
                    System.out.print(i+ " ");
                }
                else   {
                    //System.out.print("0"+ " ");
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        System.out.println("Pattern 9 : below");
             /*
             Pattern 9

                    1
                  1 2
                1 2 3
              1 2 3 4
            1 2 3 4 5
             */

        /*   How can get above output (space between numbers)
            1
           12
          123
         1234
        12345
         */

        for (int i = 1; i <= n; i++) {

            for(int k=1; k<=n-i; k++){
                System.out.print(" ");
                            }
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
                 }

            System.out.println();
        }



        System.out.println();
        System.out.println();

        System.out.println("Pattern 10 : below");
             /*
             Pattern 10

                      5
                    4 5
                  3 4 5
                2 3 4 5
              1 2 3 4 5
             */
        for (int i = 0; i <= n-1; i++) {
            for(int k=0; k<=n-i; k++){
                System.out.print(" ");
            }

            for (int j = 0; j <=n; j++) {
             //   System.out.print(n-j);
                    if(i==j){
                        System.out.print(n-j);
                    }  else if(j<=i) {
                      //System.out.print(n);
                        // System.out.print(j);
                    }
            }
             System.out.println();
        }
//        System.out.println("Pattern 3 :  ");
//             /*
//             Pattern 3
//             -----*
//             ----* *
//             ---* * *
//             --* * * *
//             -* * * * *
//             */
//        for (int i = 1; i <= 5; i++) {
//
//            for(int k=1; k<=5-i+1; k++){
//                System.out.print(" ");
//            }
//
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//        System.out.println();
//        System.out.println("Pattern 3 :  ");
//             /*
//             Pattern 3
//             -----*
//             ----* *
//             ---*   *
//             --* * * *
//             -* * * * *
//             */
//        for (int i = 1; i <= 5; i++) {
//
//            for(int k=1; k<=5-i+1; k++){
//                System.out.print(" ");
//            }
//
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        System.out.println();
//        System.out.println("Pattern 3 :  ");
//             /*
//             Pattern 3
//             -----*
//             ----* *
//             ---*   *
//             --* * * *
//             -* * * * *
//             */
//        for (int i = 1; i <= 5; i++) {
//
//            for(int k=1; k<=5-i+1; k++){
//                System.out.print(" ");
//            }
//
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }  // main
}
