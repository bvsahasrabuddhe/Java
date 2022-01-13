package com.bvsahasrabuddhe;

import java.io.File;
import java.io.IOException;

public class FileHandling {

    public static void main(String[] args) {
        String path = "D:\\Learning\\FileHandling\\file.txt";
        File file = new File(path);
        System.out.println(file.exists());  // true
        System.out.println(file.canRead());  // true
        System.out.println(file.canWrite());  // true
        System.out.println(file.getName());  // file.txt
        System.out.println(file.getParent()); // D:\Learning\FileHandling
        System.out.println(file.getAbsoluteFile());  // D:\Learning\FileHandling\file.txt
        System.out.println(file.isFile());   // true
        System.out.println(file.isDirectory());  // false

//        String path1 = "D:\\Learning\\FileHandling\\ccc.txt";
//        File file1 = new File(path1);

//      Create new file
//        try {
//            file1.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

          // Make directory named java
         // String path1 = "D:\\Learning\\FileHandling\\java";
//          String path1 = "D:\\Learning\\FileHandling";
//           File file1 = new File(path1);
////          file1.mkdir();
//            String [] myFiles = file1.list();
//            for (String myFile : myFiles){
//                System.out.println(myFile);
//            }
//                bbb.txt
//                file.txt
//                java

            // delecte file aaa.txt
       //  String path1 = "D:\\Learning\\FileHandling\\aaa.txt";
//          String path1 = "D:\\Learning\\FileHandling\\java";
//          File file1 = new File(path1);
//          file1.delete();



    }
}
