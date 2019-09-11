package com.company;

import java.util.Scanner;


public class Main {

    public static int min = 1;
    public static int max = 1000;
    public static int guess = 500;

    static Scanner myObj = new Scanner(System.in);

    public static void main(String[] args) {
        Introduction();

        PickAnumber();

        String result = Game();
        if (result != null) {
            System.out.println(result);
        }

//        NextGuess();


    }

    public static void Introduction() {
        System.out.println("Hellow Traveler, are you ready for the Game?");


        try {
            Thread.sleep(1 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Great, I'll take your silence as a YES. ");

        try {
            Thread.sleep(1 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Let's Begin! ");

        try {
            Thread.sleep(1 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

        System.out.println("First please tell me your name Traveler:");

        try {
            Thread.sleep(1 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

        Scanner in = new Scanner(System.in);

        String name = in.nextLine();
        System.out.println("So you go by the name " + name);

        try {
            Thread.sleep(1 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Strange name....");

        try {
            Thread.sleep(2 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

        System.out.println("But then again, who am i to judge. Let's begin!");
    }

    public static void PickAnumber() {

        try {
            Thread.sleep(1 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

        System.out.println("The Rules are simple: ");

        try {
            Thread.sleep(1 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

        System.out.println("1: You will think a number between 0 and 1000, and that number in your mind");

        try {
            Thread.sleep(1 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

        System.out.println("2: I will try and guess it!");

        try {
            Thread.sleep(1 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

        char smiley = '\u263A';

        System.out.println("with only a little help from your side... " + smiley);


        try {
            Thread.sleep(1 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Ready ? ");

        try {
            Thread.sleep(1 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Let's begin! ");

        try {
            Thread.sleep(1 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

//        System.out.println();

    }

    public static String Game() {

        System.out.println(" Now, tell me if the number is higher than : " + guess + ". Please type y for YES and n for NO");

        String userInput = myObj.nextLine();  // Read user input


        if (userInput.equals("y")) {

//            min = guess;
//             guess = (max + min) / 2;
        System.out.println(guess);

            System.out.println("Awesome, so the number is between " + guess + " and " + max);

            min = guess;
            guess = (max + min) / 2;

            System.out.println(" Is the number between " + guess + " and " + max +" ? ");

            String userInput = myObj.nextLine();  // Read user input
            if (userInput.equals("y")) {
                min = guess;

                if (max == guess) {
                    System.out.println("AHA , so the number is " + guess);
                    return "I win, Game over";
                }
            } else if (userInput.equals("n")){
                max = guess;
                if ( min == guess) {
                    System.out.println("AHA , so the number is " + guess);
                    return "I win, Game over";
                }
            } else {
                System.out.println("ERROR, only Y or N allowed!");
                NextGuess();
                return "I win, Game over";
            }
            guess = (max + min) / 2;
            System.out.println(guess);



//            NextGuess();


            return null;
        } else if (userInput.equals("n")) {

//            max = guess;
//            guess = (max + min) / 2;
            System.out.println(guess);


            System.out.println("So the number is between " + guess + " and " + min);

            max = guess;
            guess = (max + min) / 2;

            System.out.println(" Is the number between " + guess + " and " + max +" ? ");

//            String userInput = myObj.nextLine();  // Read user input
            if (userInput.equals("y")) {
                min = guess;

                if (max == guess) {
                    System.out.println("AHA , so the number is " + guess);
                }
            } else if (userInput.equals("n")){
                max = guess;
                if ( min == guess) {
                    System.out.println("AHA , so the number is " + guess);
                    return "I win, Game over";
                }
            } else {
                System.out.println("ERROR, only Y or N allowed!");
                NextGuess();
                return "I win, Game over";
            }
            guess = (max + min) / 2;
            System.out.println(guess);

//             return null;
//            guess = (max + min) / 2;
//            NextGuess();

//            System.out.println("Is the number " + guess + " ? ");
            Game();


        }
        return "Game Over! YOU HAD ONE JOB MAN! Y OR N! Come on!";
    }

    public static int countNext = 0;
    public static void NextGuess(){
        System.out.println(" Is the number between " + guess + " and " + max +" ? ");

        String userInput = myObj.nextLine();  // Read user input
        if (userInput.equals("y")) {
            min = guess;

            if (max == guess) {
                System.out.println("AHA , so the number is " + guess);
            }
        } else if (userInput.equals("n")){
            max = guess;
            if ( min == guess) {
                System.out.println("AHA , so the number is " + guess);
                return;
            }
        } else {
            System.out.println("ERROR, only Y or N allowed!");
            NextGuess();
            return;
        }
        guess = (max + min) / 2;
        System.out.println(guess);
        NextGuess();
    }

}







