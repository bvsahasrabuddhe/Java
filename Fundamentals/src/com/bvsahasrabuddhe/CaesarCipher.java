package com.bvsahasrabuddhe;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String s = scan.nextLine();
      int k = scan.nextInt();
      scan.close();
      System.out.println(caesarCipher(s, k));

    }

    private static String caesarCipher(String s, int k) {
        k = k % 26;
        String t = "";
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ( ch >= 'a'  && ch <= 'z'    )
            {
                if ( (ch+k) >= 'a'  && (ch+k) <= 'z'   ){
                    t = t + (char)(ch + k);
                } else
                {
                    t = t + ((char)((ch + k)-26) );
                }


            }
            else if(ch >= 'A'  &&  ch <= 'Z'){
                if (   (ch+k) >= 'A'  &&  (ch+k) <= 'Z' ){
                    t = t + (char)(ch + k);
                } else
                {
                    t = t + ((char)((ch + k)-26) );
                }

            }
            else{
                t = t + ch;
            }
        }
        //System.out.println(t);
        return t;
    }
}
