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

    static void printAllSubstrings1(String st, int k){
        int n = st.length();

            for(int s =0 ; s <= n - k ; s++){
                for(int e =s ; e <= (s+k)-1; e++){
                    System.out.print(st.charAt(e));
                }
                System.out.println();
            }

    }
    public static void main(String[] args) {
//        String s   = "abcde";
//        printAllSubstrings(s);
        String s   = "abcde";
        printAllSubstrings1(s, 2);
//        Out put is
//        ab
//        bc
//        cd
//        de

    }
}
