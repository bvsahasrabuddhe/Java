package com.bvsahasrabuddhe;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class ZirohLabs {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = "wwwggopp" ;// scan.nextLine();
        scan.close();

        LinkedHashMap<Character, Integer> myMap = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (myMap.containsKey(ch)) {
                int temp =  myMap.get(ch);
                myMap.put(ch, temp + 1);
            }
            else {
                myMap.put(ch, 1);
            }
        }
        Set<Character> keys = myMap.keySet();

        for (char key : keys) {
            int value = myMap.get(key);
            System.out.print(value + "" + key );

        }
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

Input = "wwwggopp"
Output : 3w2g1o2p
 */