package com.bvsahasrabuddhe;

public class Accenture {

    static boolean isPresent(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'Y') {
                count++;
            }
        }
        return s.length() == count;
    }

    public static void main(String[] args) {

        String arr[] = {"YYY", "YYY", "YNN", "YYN", "YYN", "YYY", "YYY", "YYY", "NYN"};
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPresent(arr[i])) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                }
                count = 0;
            }
        }
//        if (count > max) {
//            max = count;
//        }
        System.out.println(max);

    }
}

/*

Ziroh Labs
1. Have the function RunLength (str) take the str parameter being passed and return a
compressed version of the string using the Run-length encoding algorithm. This
algorithm works by taking the occurrence of each repeating character and outputting
that number along with a single character of the repeating sequence. For example:
"wwwggopp" would return 3w2g1o2p. The string will not contain any numbers,
punctuation, or symbols.



5. Maximum Streak
A project manager wants to look at employee attendance data. Given that m
employees are working on the project, and the manager has the record of the
employees present on n days of the project, find the maximum number of
consecutive days on which all employees were present and working on the project.
Example
m=3
n=9
data = [YYY, YYY, YNN, YYN, YYN, YYY, YYY, YYY, NYN]
Function Description
Complete the maxStreak function in the editor below. The function must return an
integer denoting the maximum number of consecutive days where all the employees
of the project are present.
maxStreak has the following parameters: int m: the number of employees working on
the project
 */