package com.bvsahasrabuddhe;

public class Main {

    public static void main(String[] args) {
            System.out.println("Hello World");
            // String
            String name = "Bhalchandra";
            System.out.println(name);

            // int, float(end of this f is nessary), boolean
            int a = 19, c = 15 ;
            float b = 19.5F;
            boolean isBoy = true;

            System.out.println(a);
            System.out.println(b);
            System.out.println(isBoy);

    /* Rules for naming varialbles
        Should start with letters, $, _
        Java is case sensitive means  Hello and hello are different
        Should not contains white spaces
        Can not use reserve word
        used variables are in white and unused variables are in grey
     */

     /*
        Jata types
        1. Premitive : byte(1 byte), short(2 bytes), int(4 bytes), long(8 bytes),
                       float(4 bytes), double(8 bytes), boolean(1 bit), char(2 bytes)
        2. Non-Premitive or reference data types
      */
            byte bt = -19;    // in between -128 to 127
            System.out.println(bt);
            double Db = 79.5555d;    // end of value write d
            System.out.println(Db);
            char grade = 'A';
            System.out.println("Char " + grade);

        /* Operators in Java
        Operand, operator, operand = Result
          1        +         1     =   2
        */
    }
}
