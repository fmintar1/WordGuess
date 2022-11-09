package com.github.zipcodewilmington;
import java.util.Scanner;


/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class Hangman {

    static int options;
    Scanner scanner = new Scanner(System.in);
    Hangman() {

        System.out.println("Welcome to Hangman!\nEnter difficulty level from 1-3\nPRESS 4 FOR REAL CHALLENGE!");
        options = scanner.nextInt();
        System.out.println("Good luck! Please use CAPS LOCK");
        difficulty();
    }

    static void difficulty() {
        switch (options) {
            case 1:
                Words.wordOptions1();
                break;
            case 2:
                Words.wordOptions2();
                break;
            case 3:
                Words.wordOptions3();
                break;
            case 4:
                Words.wordOptions4();
                break;
        }
    }
}