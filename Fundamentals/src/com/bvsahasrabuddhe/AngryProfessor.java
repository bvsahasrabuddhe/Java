package com.bvsahasrabuddhe;

import java.util.Scanner;

public class AngryProfessor {
    static int ON_TIME =0;
    static String checkIfClassIsPossible(int minimumThresholdClass, int[] timingForStudents) {
        int numberOfStudentsCameOnTime = 0;
        for (int i = 0; i < timingForStudents.length; i++) {
            if (timingForStudents[i] <= ON_TIME) {
                numberOfStudentsCameOnTime++;
            }
        }
        if (numberOfStudentsCameOnTime >= minimumThresholdClass) {
            return "NO";
        } else {
            return "YES";
        }
    }
       public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfTestCases = scan.nextInt();
        String results[] = new String[numberOfTestCases];

        for (int i = 0; i < numberOfTestCases; i++) {
            int numberOfStudents = scan.nextInt();
            int thresholdStudents = scan.nextInt();

            int timingForStudents[] = new int[numberOfStudents];
            for (int j = 0; j < timingForStudents.length; j++) {
                timingForStudents[j] = scan.nextInt();
            }
            String result = checkIfClassIsPossible(thresholdStudents, timingForStudents);
            results[i] = result;
        }
        for (int i=0; i<numberOfTestCases; i++)
        {
            System.out.println(results[i]);
        }
    }
}
