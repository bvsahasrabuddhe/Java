package com.bvsahasrabuddhe;

import java.util.Scanner;

public class MigratoryBirds {

    static int migratoryBirds(int typeOfBirds[]){
        int numberOfTheBirdSighted[] = new int[typeOfBirds.length];

        for(int i=0; i< typeOfBirds.length; i++){
            numberOfTheBirdSighted[typeOfBirds[i] ]++;
        }
        int max = 0;
        int maxId = 0;
        for(int i=0; i< numberOfTheBirdSighted.length; i++){
           if(numberOfTheBirdSighted[i] >max)
            {
                maxId = i;
                max = numberOfTheBirdSighted[i];
            }
        }
        return maxId;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int typeOfBirds[] = new int[n];


        for(int i=0; i< typeOfBirds.length; i++){
            typeOfBirds[i] = scan.nextInt();
        }
        System.out.println(migratoryBirds(typeOfBirds));
    }
}
