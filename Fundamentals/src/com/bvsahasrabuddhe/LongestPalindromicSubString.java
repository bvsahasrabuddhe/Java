package com.bvsahasrabuddhe;

public class LongestPalindromicSubString {

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
    static String printAllSubstrings(String st){
        int n = st.length();
        String res = "";
        for(int len = 1 ; len <= n ; len++){

            for(int s =0 ; s <= (n-len); s++){
                String temp = "";
                for(int e =s ; e <= (s+len)-1; e++){
                    temp = temp + st.charAt(e);
                    //System.out.print(st.charAt(e));
                }
                //System.out.println();
                if(isPalindrome(temp))
                {
                    if(temp.length() > res.length()){
                        res = temp;
                    }
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
    String st = "aaacac";
        System.out.println(printAllSubstrings(st));
    }
}
