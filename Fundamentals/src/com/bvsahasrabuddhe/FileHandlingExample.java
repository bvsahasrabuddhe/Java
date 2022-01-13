package com.bvsahasrabuddhe;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingExample {

    public static void main(String[] args) {
        String path = "D:\\Learning\\FileHandling\\data.txt";
        FileReader reader = null;
        BufferedReader reader2 = null;

        /*
        try {
             reader = new FileReader(path);
             reader2 = new BufferedReader(reader);
             String line = reader2.readLine();
             System.out.println(line);
             System.out.println(reader2.readLine());
             System.out.println(reader2.readLine());
             System.out.println(reader2.readLine());
             System.out.println(reader2.readLine());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Out put
        Java
        Have a nice day
        Today is Thursday
        SQL
        null
        */

        int count = 0;
        int sum = 0;
        try {
            reader = new FileReader(path);
            reader2 = new BufferedReader(reader);

            String line = reader2.readLine();
            while(line != null){
                System.out.println(line);
                count++;
                int l = line.length();
                sum = sum + l;

                line = reader2.readLine();
            }
            System.out.println("Number of line = " + count);
            System.out.println("Number of characters = " + sum);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
