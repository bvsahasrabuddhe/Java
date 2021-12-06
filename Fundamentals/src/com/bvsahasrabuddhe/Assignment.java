package com.bvsahasrabuddhe;

public class Assignment {



    public static void main(String[] args) {

          int n = 5;
        System.out.println("Patten 6  not solved ");
        /*
                     E
                    DE
                   CDE
                  BCDE
                 ABCDE
        */
        char ch6 = 'E';

//        for (int i = 1; i <= n; i++) {
//
//            for(int k=1; k<=i; k++){
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= n-i+1; j++) {
//                System.out.print(ch6++);
//            }
//            ch6 = (char)(ch6 + (n-i));
//            System.out.println();
//        }
        System.out.println();
        System.out.println();
        for (int i = 1; i <= n; i++) {

            for(int k=1; k<=n-i+1; k++){

                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(ch6++);

            }

            //ch6 -=2;
          ch6 = (char) ((n-i+1) -ch6 );

            System.out.println();
        }







        /*
             Pattern 10
            Expected outout
                      5
                    4 5
                  3 4 5
                2 3 4 5
              1 2 3 4 5
             */
//        for (int i = 0; i <= n-1 ; i++) {
//            int count = n-i;
//            for(int k=0; k<=n-i+1; k++){
//                System.out.print(" ");
//            }
//            for (int j = 0; j <=n; j++) {
//                if(i==j){
//                System.out.print(count);
//                }
//                else {
//                    System.out.println(count++);
//                }
//
//        }
//            System.out.println();
//    }

        for (int i = 1; i <= n; i++) {

            for(int k=1; k<=n-i+1; k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print(n-i+j);
            }
            System.out.println();
            }

        char ch10 = 'A';


        for (int i = 1; i <= n; i++) {

            for(int k=1; k<=i; k++){
                System.out.print(" ");
            }

                for (int j = 1; j <= n-i+1; j++) {
                System.out.print(ch10++);
            }
            ch10 = (char) (ch10 - (n-i));
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        for (int i = 1; i <= 4; i++) {
            int count = i;
            for(int k=1; k<=4-i+1; k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++) {
                if(j<i){
                    System.out.print(count--);
                }else {
                    System.out.print(count++);
                }

            }
            System.out.println();
        }
    boolean a = true;
        boolean b = false;
       // System.out.println(a&b);

}
}
