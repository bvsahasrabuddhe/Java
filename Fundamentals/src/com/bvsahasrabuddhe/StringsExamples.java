package com.bvsahasrabuddhe;

public class StringsExamples {
    //Count the spaces in given string
    static int spaceCount(String s){
        int count =0;
        for(int i= 0; i< s.length();i++){
            if(s.charAt(i) == ' '){
                count++;
            }
        }
        return count;
    }

    //Count the word in given string
    static int wordCount(String s){
        int count =0;
        for(int i= 0; i< s.length();i++){
            if(s.charAt(i) == ' '){
                count++;
            }
        }
        return count+1;
    }

    //Count the character in given string
    static int charcterCount(String s, String t){
        int count =0;
        char key = t.charAt(0);
        for(int i= 0; i< s.length();i++){
            if(s.charAt(i) == key){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "How are you";
        String t = "o";
        System.out.println(spaceCount(s));
        System.out.println(wordCount(s));
        System.out.println(charcterCount(s,t));
    }
}
