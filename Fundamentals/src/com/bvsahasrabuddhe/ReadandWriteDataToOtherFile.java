package com.bvsahasrabuddhe;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadandWriteDataToOtherFile {


    // Read from data.txt and write/store to newdata.txt

    public static void main(String[] args) {
        String path = "D:\\Learning\\FileHandling\\data.txt";
        String path2 = "D:\\Learning\\FileHandling\\newdata.txt";
        FileReader reader = null;
        FileWriter writer = null;

        try {
            reader =  new FileReader(path);
            writer = new FileWriter(path2);
            int c = reader.read();
            while(c!= -1){
               //  System.out.print((char)c);
                writer.write(c);
                c = reader.read();
            }
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*
        Java

        Have a nice day

        Today is Thursday

        SQL

        */



    } // main

}
