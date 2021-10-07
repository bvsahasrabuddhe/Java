package com.bvsahasrabuddhe;

import java.util.Random;
import java.util.Scanner;

class Game {
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

//    public int getNumber() {
//        return number;
//    }

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeUserInput() {
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

    boolean isCorrectNumber() {
        noOfGuesses++;
        if (inputNumber == number) {
            System.out.format("Yor are right. It was %d . You attempted in %d", number, noOfGuesses);
            return true;
        } else if (inputNumber < number) {
            System.out.println(" It is to low");
        } else if (inputNumber > number) {
            System.out.println(" It is to high");
        }

        return false;
    }




 }

    public class GuessNumber {
       // private static String[] args;

        public static void main(String[] args) {

        /*
        Game should have the following methods:
        Constructor to generate the random number
        takeUserInput() to take a user input of number
        isCorrectNumber() to detect whether the number entered by the user is true
        getter and setter for noOfGuesses
        */

            Game g = new Game();
            boolean b = false;
            while (!b) {
                g.takeUserInput();
                b = g.isCorrectNumber();
            }
        }
     }
