package com.bvsahasrabuddhe;

import java.util.Scanner;

public class BillDivision {

   //  static int refundOrNot(int[] billItems, int AnnaNotEatItem, int AnnaPaid){
//        int sum = 0;
//        for(int i=0;i<billItems.length-1; i++){
//            if(billItems[i] != billItems[AnnaNotEatItem]);
//            {
//            sum = sum + billItems[i];
//            }
//        }
//        int totalBill = AnnaPaid - sum/2;
//
//        System.out.println(totalBill==0?("Bon Appet"):totalBill);

 //   }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfItems = scan.nextInt();   // number of items
        int billItems[] = new int[numberOfItems];  // array
        for(int i=0;i<billItems.length; i++){
            billItems[i] = scan.nextInt();
        }
        int AnnaNotEatItem = scan.nextInt();   // index of item not eaten
        int AnnaPaid = scan.nextInt();   // bill paid
        int sum = 0;
        for(int i=0;i<billItems.length-1; i++){
            if(billItems[i] != billItems[AnnaNotEatItem]);
            {
                sum = sum + billItems[i];
            }
        }
        int totalBill = AnnaPaid - sum/2;
        System.out.println(totalBill==0?("Bon Appet"):totalBill);
        // System.out.println(refundOrNot(billItems, AnnaNotEatItem,AnnaPaid ));

    }

}
