package com.bvsahasrabuddhe;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class MergeTwoFiles {

    public static void main(String[] args) {
        String path1 = "D:\\Learning\\FileHandling\\Names.txt";
        String path2 = "D:\\Learning\\FileHandling\\PhoneNumbers.txt";
        String path3 = "D:\\Learning\\FileHandling\\PhoneBook.txt";

        FileReader fileReader1 = null;
        BufferedReader bufferedReader1 = null;
        FileReader fileReader2 = null;
        BufferedReader bufferedReader2 = null;

        FileWriter writer = null;

        try {
            fileReader1 = new FileReader(path1);
            bufferedReader1 = new BufferedReader(fileReader1);
            fileReader2 = new FileReader(path2);
            bufferedReader2 = new BufferedReader(fileReader2);
            writer = new FileWriter(path3);

            String name = bufferedReader1.readLine();
            String phoneNumber = bufferedReader2.readLine();

            while(name!= null){
                System.out.println(name + " : " + phoneNumber);
                writer.write(name + " : " + phoneNumber + '\n');
                name = bufferedReader1.readLine();
                phoneNumber = bufferedReader2.readLine();
            }
            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

//        Bhalchandra : 9021192760
//        Bharat : 9632104315
//        Pranit : 8308069858
//        Karan : 7588627916

    }
}
