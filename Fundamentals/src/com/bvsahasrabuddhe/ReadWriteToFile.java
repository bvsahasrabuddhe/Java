package com.bvsahasrabuddhe;

import java.io.*;
import java.util.Scanner;

public class ReadWriteToFile {

    public static void main(String[] args) throws IOException {
        String path = "D:\\Learning\\FileHandling\\aaa.txt";
        //File file = new File(path);    for Hello World and input  word this line is needed
        Scanner scan = new Scanner(System.in);


        FileWriter writer = null ;

        /* Write to file "Hello World"
        try {
            writer = new FileWriter(file);
            writer.write("Hello world");   // write on stream
            writer.flush();    // write to file
        } catch (IOException e) {
            e.printStackTrace();
        }

         */



        /* Input 3 word for user
        try {
            String s1 = scan.next();
            String s2 = scan.next();
            String s3 = scan.next();
            writer = new FileWriter(file,true); // append next words
            writer.write(s1);   // write on stream
            writer.write(s2);
            writer.write(s3);
            writer.flush();    // write to file
        } catch (IOException e) {
            e.printStackTrace();
        }
        //BhalchandraVasudeoSahasrabuddhe
        */

        /*
        try {
            String s1 = scan.next();
            String s2 = scan.next();
            String s3 = scan.next();
            writer = new FileWriter(path, true); // instead of file - > path
            writer.write(s1);   // write on stream
            writer.write(s2);
            writer.write(s3);
            writer.flush();    // write to file
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            scan.close();
            writer.close();
        }
        */

        /*try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        */


        /*
        FileReader reader = null;
        try {
              reader = new FileReader(path);
              System.out.println((char) reader.read());
              System.out.println((char) reader.read());
              System.out.println((char) reader.read());
              System.out.println((char) reader.read());
              System.out.println((char) reader.read());
              System.out.println((char) reader.read());
              System.out.println((char) reader.read());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //Finally
        */

        /*  This prints total number of charachers in the file
        FileReader reader = null;
        char ar[] = new char[100];
        try {
            reader = new FileReader(path);
            System.out.println(reader.read(ar));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //41
        */

        FileReader reader = null;
        char ar[] = new char[50];
        try {
            reader = new FileReader(path);
            System.out.println(reader.read(ar));
            System.out.println(ar);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //41
        //FinallyScanClosewriterCloseappendtruepath



    }  // main
}
