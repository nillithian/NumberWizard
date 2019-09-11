package com.company;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        Introduction();
        PickAnumber();











    }

    public static void Introduction (){
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

    public static void PickAnumber () {

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

        System.out.println( "1: You will think a number between 0 and 1000, and that number in your mind");

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

        System.out.println( "with only a little help from your side... " + smiley);



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

        System.out.println( "Let's begin! ");

        try {
            Thread.sleep(1 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

        System.out.println();

    }

//    public static int Game() {
//        int min = 1;
//        int max = 1000;
//        int guess = 500;
//
//        System.out.println(" Now, tell me if the number is higher than :" + guess + ". Please type y for YES and n for NO");
//
//        Scanner in = new Scanner(System.in);





    }





}
