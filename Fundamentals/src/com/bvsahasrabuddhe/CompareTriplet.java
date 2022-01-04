package com.bvsahasrabuddhe;

import java.util.Scanner;

public class CompareTriplet {


        public static void compareTriplets(int[]a, int[]b) {
            int m = 0,  n = 0;
            for(int i = 0; i<=a.length-1; i++){
                if(a[i]<b[i]){
                    n++;

                }else
                {
                    m++;

                }
            }
            System.out.print(m + " " + n);

        }

        public static void main(String[] args)   {

            Scanner scan = new Scanner(System.in);

            int x = scan.nextInt();
            int y = scan.nextInt();
            int[] a= new int[x];
            int[] b= new int[y];
            for(int i = 0 ; i<a.length ; i++){
                a[i] = scan.nextInt();
            }
            for(int i = 0 ; i<b.length ; i++){
                b[i] = scan.nextInt();
            }

            //System.out.println(m + " "+ n);
            compareTriplets(a,  b);
        }
    }
