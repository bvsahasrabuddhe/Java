package com.bvsahasrabuddhe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//            System.out.println("Hello World");
//
//            String name = "Bhalchandra";
//            System.out.println(name);

        // int, float(end of this f is nessary), boolean
//            int a = 19, c = 15 ;
//            float b = 19.5F;
//            boolean isBoy = true;
//
//            System.out.println(a);
//            System.out.println(b);
//            System.out.println(isBoy);

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

//            byte bt = -19;    // in between -128 to 127
//            System.out.println(bt);
//            double Db = 79.5555d;    // end of value write d
//            System.out.println(Db);
//            char grade = 'A';
//            System.out.println("Char " + grade);
//
//                /* Operators in Java
//                Operand, operator, operand = Result
//                1        +         1     =   2
//                */
//            int num1 = 79, num2 = 77;
//            System.out.println("Addition of num1 and num2 is");
//            System.out.println(num1+num2);
//            System.out.println("Subtraction of num1 and num2 is");
//            System.out.println(num1-num2);
//            System.out.println("Multiplication of num1 and num2 is");
//            System.out.println(num1*num2);
//            System.out.println("Division of num1 and num2 is");
//            System.out.println(num1/num2);
//            System.out.println("Mod of num1 and num2 is");
//            System.out.println(num1%num2);

//            // Tanking user input in Java
//
//            Scanner scan = new Scanner(System.in);
//            System.out.println("Enter input");
//            String input = scan.nextLine();   // Takes full line
//            System.out.println(input);
//            String input1 = scan.next();   // Takes only first word up to white space
//            System.out.println(input1);
//
//            String firstname = "Bhalchandra";
//            String lastname = "Sahasrabuddhe";
//            System.out.println(firstname.length());   // gives length of string
//            System.out.println(firstname.toLowerCase());   // gives lower string
//            System.out.println(firstname.toUpperCase());   // gives upper string
//            System.out.println(firstname + " Vasudeo " + lastname);
//            System.out.println(firstname + " \"Vasudeo\" " + lastname);   // escape sequence character
//            System.out.println( " \" " + " \t " + " \n ");   // escape sequence ", tab, next line
//            System.out.println(firstname.contains("Bhal"));   // finds it contains or not i.e t or f
//            System.out.println(firstname.charAt(5));   // gives fifth letter
//            System.out.println(firstname.endsWith("dra"));   // check true or flase
//            System.out.println(firstname.indexOf("dra"));   // gives position letter

//            int n1 = 8, n2 = 19;
//            System.out.println(Math.max(n1, n2));   // gives maximum number
//            System.out.println(Math.min(n1, n2));   // gives minimum number
//            System.out.println(Math.sqrt(25));      // gives square root
//            System.out.println(Math.abs(-25));      // gives absolute value
//            System.out.println(Math.random());      // gives random value
//            System.out.println(4 + (8 - 4) * Math.random());      // gives random value
//            System.out.println(4 + (8 - 4) * Math.random());      // gives random value
//            System.out.println(4 + (8 - 4) * Math.random());      // gives random value

        // If then statements
//              Scanner scan = new Scanner(System.in);
//              System.out.println("Enter day");
//              int day = scan.nextInt();
//              switch(day){
//                      case 1:
//                              System.out.println("Sunday");
//                              break;
//                      case 2:
//                              System.out.println("Monday");
//                              break;
//                      case 3:
//                              System.out.println("Tuesday");
//                              break;
//                      case 4:
//                              System.out.println("Wednesday");
//                              break;
//                      case 5:
//                              System.out.println("Thursday");
//                              break;
//                      case 6:
//                              System.out.println("Friday");
//                              break;
//                      case 7:
//                              System.out.println("Saturday");
//                              break;
//                              default:
//                              System.out.println("Invalid number day");

        // Java Arrays
//                    int [] [] matrix = {{1,2,3}, {4,5,6}} ;
//                    System.out.println(matrix[1][0]);
//                    int [] marks = {1,2,3,4};
//                    marks[2] = 19;
//                    System.out.println(marks[2]);

//                      int [] marks = {1,2,3,4};
//                     // marks[2] = 19;
//                      for(int i= 0; i<marks.length;i++ ){
//                          System.out.println(marks[i]);
//                      }
//                      System.out.println("This is for each loop");
//                      for(int value:marks){
//                          System.out.println(marks[value]);
//                      }

//                    String [] grade = {"A", "B", "C"};  //  string must be in double cots
//                    grade[2] = "D";
//                    System.out.println(grade[2]);

        // while loop

//                    while(i<10){
//
//                        System.out.println(i);   // i is integer hence no require to write in double cots
//                        i += 1 ;
//                    }

                    // do while

//                    int j = 0 ;
//                    do  {
//                    System.out.println(j);
//                    j += 1 ;
//
//                    } while(j<10);

                    // for loop
//                    for(int i= 0;i<10;i++) {
//
//                        if (i == 2) {   // i write only single = thats why it is showing error
//                                       //java: incompatible types: int cannot be converted to boolean
//                            break;     //  as 2 comes it will break and stop program.
//                        } else {
//                            System.out.println(i);
//                        }
//                    }

//                    for(int i= 0;i<10;i++) {
//
//                        if (i == 2) {
//
//                            continue;     //  skip 2 and next values are to be printed
//                        } else {
//                            System.out.println(i);
//                        }
//                    }

                    // try - catch

//                    String [] cars = {"Innova", "Swift Desire", "BMW", "Jeeto"};
//
//                    try {
//                        System.out.println(cars[3]);
//                    }
//                    catch (Exception e){
//                        System.out.println(e);
//                    }
//                    System.out.println("Welcome");

                    // Calulator in java

                    int number1, number2 ;
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Enter First number");
                    number1 = scan.nextInt();
                    System.out.println("Enter Second number");
                    number2 = scan.nextInt();
                    System.out.println("You Entered numbers");
                    System.out.println(number1);
                    System.out.println(number2);

                    String Prompt = " 1 for  Addition, 2 for Subtraction, 3 for Multiplication, 4 for Division ";
                    System.out.println(Prompt);
                    System.out.println("Enter you choice from above");


                    int input = scan.nextInt();
                    switch(input) {
                        case 1:
                            System.out.println("Addition of number1 and number2 : " + number1 + number2);
                            break;
                        case 2:
                            System.out.println("Subtraction of number1 and number2 : ");
                            System.out.println(number1 - number2);
                            break;
                        case 3:
                            System.out.println("Multiplication of number1 and number2 : " + number1 * number2);
                            break;
                        case 4:
                            System.out.println("Division of number1 and number2 : " + number1 / number2);
                            break;

                        default:
                            System.out.println("Invalid numbers");

                    }



                    //******************
    }               // this curly bracket was deleted by me
}
