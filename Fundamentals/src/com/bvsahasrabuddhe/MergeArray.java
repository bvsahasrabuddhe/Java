package com.bvsahasrabuddhe;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int l = scan.nextInt();
        int ar1[] = new int[k];
        int ar2[] = new int[l];

        for(int i=0; i< ar1.length; i++){
            ar1[i] = scan.nextInt();
        }
        for(int i=0; i< ar2.length; i++){
            ar2[i] = scan.nextInt();
        }
        int res[] = new int[k+l];

        for(int i=0; i< ar1.length; i++){
            res[i] = ar1[i];
        }
        for(int i=0; i< ar2.length; i++){
            res[ar1.length +i] = ar2[i];
        }
//        for(int i=0; i< res.length; i++){
//            for( j=j+1; j< res.length; j++){
//                if(res[i] < res[j]){
//                    int temp = res[i];
//                    res[i] = res[j];
//                    res[j] = temp;
//                }
//            }
//        }
        for(int i=0; i< res.length; i++){
            for(int j=0; j< res.length; j++){
                if(res[i] > res[j]){
                    int temp = res[j];
                    res[j] = res[i];
                    res[i] = temp;
                }
            }
        }
        for(int i=0; i< res.length; i++){
            System.out.print(res[i]);
        }

    }
}
