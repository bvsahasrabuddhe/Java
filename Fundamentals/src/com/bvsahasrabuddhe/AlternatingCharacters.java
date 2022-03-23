package com.bvsahasrabuddhe;

public class AlternatingCharacters {

    public static void main(String[] args) {
        String s = "AAABBB";
        System.out.println(alternatingCharacters(s));
    }

    private static int alternatingCharacters(String s) {
        int count = 0;
        for(int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) == s.charAt(i + 1)) {
                count++;
            }
        }
        return count;
    }
}


/*
input
5
AAAA
BBBBB
ABABABAB
BABABA
AAABBB

Output
3
4
0
0
4

 */