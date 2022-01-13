package com.bvsahasrabuddhe;

import java.io.*;
import java.util.Scanner;

public class ReadingDataFromFile {

    public static void main(String[] args) {
        String path = "D:\\Learning\\FileHandling\\aaa.txt";

        FileReader reader = null;

        try {
           reader =  new FileReader(path);
           int c = reader.read();
           while(c!= -1){
               System.out.print((char)c);
               c = reader.read();
           }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /* first output
        Finally ScanClose writerClose append true path
        Have a nice day
        Today is Thursday
        */

        /* second output
        Java

        Have a nice day

        Today is Thursday

        SQL

        */
    }
}
