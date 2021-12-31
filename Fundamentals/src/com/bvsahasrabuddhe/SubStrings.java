package com.bvsahasrabuddhe;

public class SubStrings {

    static void printAllSubstrings(String st){
        int n = st.length();
        for(int len = 1 ; len <= n ; len++){

            for(int s =0 ; s <= (n-len); s++){
                for(int e =s ; e <= (s+len)-1; e++){

                    System.out.print(st.charAt(e));
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
         String s   = "abcde";
        printAllSubstrings(s);
    }
}
