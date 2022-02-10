package com.bvsahasrabuddhe;

import java.util.Scanner;

public class BreakingTheRecords {

    public static void breakingTheRecords(int[]a){
        int result[] = new int[2];
        int heightScore = a[0];
        int lowestScore = a[0];

        for(int i = 0 ; i<a.length ; i++){
           if(a[i] > heightScore) {
               heightScore = a[i];
               result[0]++;
           }
        }

        for(int i = 0 ; i<a.length ; i++){
            if(a[i] < lowestScore) {
                lowestScore = a[i];
                result[1]++;
            }
        }
        //System.out.print(heightScore + " " + lowestScore);
        for(int i = 0 ; i<result.length ; i++){
            System.out.print(result[i] + " ");
        }
    }
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] a= new int[n];

        for(int i = 0 ; i<a.length ; i++){
            a[i] = scan.nextInt();
        }


        breakingTheRecords(a);


        /*     Hackerrank solution

        9
        10 5 20 20 4 5 2 25 1
        2 4
            int heightScoreCount = 0;
            int lowestScoreCount = 0;


            int heightScore = scores.get(0);
            int lowestScore = scores.get(0);
            for(int i = 1; i< scores.size(); i++)
            {
                if(heightScore <  scores.get(i)){
                    heightScore = scores.get(i) ;
                    heightScoreCount++;
                }
            }
            for(int i = 1; i< scores.size(); i++)
            {
                if(lowestScore >  scores.get(i)){
                    lowestScore = scores.get(i);
                    lowestScoreCount++;
                }
            }
            ArrayList<Integer> result = new ArrayList<>();
            result.add(heightScoreCount);
            result.add(lowestScoreCount);

            return result;
         */


    }
}
