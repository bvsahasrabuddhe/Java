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

    //Revesr string
    static String reverse(String s){
        String t = "";
        for(int i=s.length()-1; i>=0; i--){
            t = t + s.charAt(i);
        }
        return t;
    }

    // Palindrome
    static boolean isPalindrome(String s){
        String t = "";
        for(int i=s.length()-1; i>=0; i--){
            t = t + s.charAt(i);
        }
        if(s.equals(t))
        {
            return true;
        }else
        {
            return false;
        }
    }

    static boolean isPalindrome2(String s){
        int i= 0;
        int j =s.length()-1;
        if(i<=j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }

        }
        return true;
    }

    //count vowels
    static int countVowels(String s){
        int count = 0;
        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
                    c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                count++;
            }
        }
        return count;
    }

    //removeVowels
    static String removeVowels(String s){
        String t = "";
        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
                    c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                //
            }else
            {
                t = t + c;
            }
        }
        return t;
    }

    // reverse
    static String reverse1(String s){
        char[] c =s.toCharArray();
        int i=0, j=c.length - 1 ;
        while(i<=j){
            char temp = c[i];
            c[i] =c[j];
            c[j] = temp;
             i++;
             j--;
        }
        return new String(c);
    }






    public static void main(String[] args) {
       // String s = "How are you";
       // String t = "o";
       // System.out.println(spaceCount(s));
       // System.out.println(wordCount(s));
        //System.out.println(charcterCount(s,t));

//      String s ="TAPACADEMY";
//      System.out.println(reverse(s));

//      String s ="LEVEL";
//      System.out.println(isPalindrome2(s));

//      String s ="CODING";
//      System.out.println(countVowels(s));

//      String s ="CODING";
//      System.out.println(removeVowels(s));

        String s ="abcde";
        System.out.println(s);
        s = reverse1(s);
        System.out.println(s);






    }
}
