package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Scanner(System.in);
        int maxnum = 0;


        System.out.println("enter the upper limit");
        while (maxnum < 1 || maxnum > 1000) {
            System.out.println("not valid");


        }
        int guess = 0;
        int numguess = 0;
        Random numtoguess = new Random(1, maxnum);
        while (guess != numtoguess && numguess < 5) {
            System.out.println("guess");

            int numguess = (numguess + 1)
        }
        if (guess == numtoguess) {
            System.out.println("you win");
        } else {
            System.out.println("you lose");
        }System.out.println("the random number was..." + numtoguess);
    }
}
