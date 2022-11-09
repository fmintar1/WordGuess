package com.github.zipcodewilmington;

import java.util.*;

public class Words extends Hangman{

    static Scanner scanner = new Scanner(System.in);
    static List<String> temp = new ArrayList<>();
    static List<String> tempEmpty = new ArrayList<>();

    Words() {

    }

    public static void wordOptions1() {
        String[] easyWords = new String[]{"HEART", "STONE", "HEARD", "PIZZA", "ATONE", "YEARN", "BLOWN",
        "SWINE", "CHORE", "DEVIL", "FOUND", "MOUNT", "NOISE", "RISEN", "DOWEL", "OWING", "VALID", "MANIAC",
        "CASHEW", "COLUMN", "SYSTEM", "PRINT", "RESULT", "RETURN", "SPARE", "FINAL", "NUMBER", "FALSE",
        "ESCORT", "SPAWN", "BOUND", "SPACE", "CHART", "FORMAT", "OBESE", "CARGO", "BOAST", "QUEUE", "STACK",
        "CHANT", "APPLE", "BRAVO", "DELTA", "ALPHA", "CHARLIE", "GLASS", "POSSE", "BLAST", "SUPER", "TRUCE",
        "THESE", "CHAIN", "CROSS", "INDIA", "TULIP", "LAPTOP", "MOUSE", "MONITOR", "RINGS", "PLUSH", "CLASS",
        "MINUTE", "CANDY", "FANCY", "SCORE", "INSANE", "CRAZY", "WOUND", "SHOOT", "THRILL", "SPEAK", "LUNCH",
        "RIGHT", "WRONG", "STOOP", "PUBLIC", "VILLA", "COUNT", "EAGLE", "CHEESE", "STEAK", "FRIES", "POTATO",
        "DODGE", "MEETING", "PUPPY", "KITTY", "BUILT", "BUILD", "HOVER", "EQUAL", "LUNAR"};
        String word = easyWords[(int) (Math.random()* easyWords.length)];
        String[] chosenWord = word.split("");
        temp = Arrays.asList(chosenWord);
        String[] emptyWord = new String[word.length()];
        for(int x = 0; x < emptyWord.length; x++) {
            emptyWord[x] = "_";
        }
        tempEmpty = Arrays.asList(emptyWord);
        int i = 12;
        while(true) {
            System.out.println(Arrays.toString(emptyWord) + "\nYou have " + i + " tries, type the answer to win");
            String guess = scanner.nextLine();
            if (guess.equalsIgnoreCase(word)) {
                System.out.println("Congratulations!");
                break;
            } else if (!temp.contains(guess)) {
                i--;
                if (i == 0) {
                    System.out.println("Game's over. Your word is " + word);
                    break;
                }
            } else if (temp.contains(guess)){
                for(int j = 0; j < temp.size(); j++) {
                    if (temp.get(j).equalsIgnoreCase(guess)) {
                        tempEmpty.set(j, guess);
                    }
                }
            }
        }
    }
    public static void wordOptions2() {
        String[] easyWords = new String[]{"SPECTRAL", "TRAVERSE", "ROSEMARY", "STRENGTH", "ABSOLUTE",
        "CHALLENGE", "VICTORY", "CHAMPION", "CHAOTIC", "DOWNWARD", "FLAMINGO", "INDIGO", "JAUNDICE",
        "MOUNTAIN", "NOVEMBER", "UNIFORM", "BUILDING", "HEARTACHE", "DOWSING", "SCRATCH", "SIMPLIFY",
        "TERMINAL", "DEPENDENT", "SQUIRREL", "DIAGONAL", "BOOLEAN", "WAREHOUSE", "SQUEAK", "TOGETHER",
        "CELSIUS", "DELICIOUS", "FAHRENHEIT", "KEYBOARD", "COMMERCIAL", "PASSWORD", "STORIES", "MONOTONE",
        "FAMISHED", "PLEASANT", "PHEASANT", "TOMBSTONE", "WRESTLING", "STATEMENT", "ERUPTION", "MORTGAGE",
        "CHASTITY", "MALICIOUS", "CULINARY", "DELIRIOUS", "SLOWPOKE", "CHARCOAL", "PROGRAM", "WEDNESDAY"};
        String word = easyWords[(int) (Math.random()* easyWords.length)];
        String[] chosenWord = word.split("");
        temp = Arrays.asList(chosenWord);
        String[] emptyWord = new String[word.length()];
        for(int x = 0; x < emptyWord.length; x++) {
            emptyWord[x] = "_";
        }
        tempEmpty = Arrays.asList(emptyWord);
        int i = 6;
        while(true) {
            System.out.println(Arrays.toString(emptyWord) + "\nYou have " + i + " tries, type the answer to win");
            String guess = scanner.nextLine();
            if (guess.equalsIgnoreCase(word)) {
                System.out.println("Congratulations!");
                break;
            } else if (!temp.contains(guess)) {
                i--;
                if (i == 0) {
                    System.out.println("Game's over. Your word is " + word);
                    break;
                }
            } else if (temp.contains(guess)){
                for(int j = 0; j < temp.size(); j++) {
                    if (temp.get(j).equals(guess)) {
                        tempEmpty.set(j, guess);
                    }
                }
            }
        }
    }
    public static void wordOptions3() {
        String[] easyWords = new String[]{"KALEIDOSCOPE", "PALINDROMIC", "SCOLIOSIS", "HALITOSIS",
        "XYLOPHONE", "PALISADE", "SPELUNKING", "ORGANIZATION", "SCOUNDREL", "REPOSITORY", "NEANDERTHAL",
        "WINGDINGS", "IMAGINATION", "IMPLEMENTATION", "INHERITANCE", "YOSEMITE", "SCANDINAVIAN",
        "LACKADAISICAL", "NONCHALANT", "QWERTY", "AMPERSAND", "ASTERISK", "LAMBDA", "YORKSHIRE",
        "INCARCERATION", "PESTILENCE", "OLFACTORY", "COMPLIANCE", "COMBUSTION", "ABSTINENCE"};
        String word = easyWords[(int) (Math.random()* easyWords.length)];
        String[] chosenWord = word.split("");
        temp = Arrays.asList(chosenWord);
        String[] emptyWord = new String[word.length()];
        for(int x = 0; x < emptyWord.length; x++) {
            emptyWord[x] = "_";
        }
        tempEmpty = Arrays.asList(emptyWord);
        int i = 6;
        while(true) {
            System.out.println(Arrays.toString(emptyWord) + "\nYou have " + i + " tries, type the answer to win");
            String guess = scanner.nextLine();
            if (guess.equalsIgnoreCase(word)) {
                System.out.println("Congratulations!");
                break;
            } else if (!temp.contains(guess)) {
                i--;
                if (i == 0) {
                    System.out.println("Game's over. Your word is " + word);
                    break;
                }
            } else if (temp.contains(guess)){
                for(int j = 0; j < temp.size(); j++) {
                    if (temp.get(j).equals(guess)) {
                        tempEmpty.set(j, guess);
                    }
                }
            }
        }
    }
    public static void wordOptions4() {
        String[] easyWords = new String[]{"HIPPOPOTOMONSTROSESQUIPEDALIOPHOBIA",
                "PNEUMONOULTRAMICROSCOPICSILICOVOLCANOCONIOSIS",
        "SUPERCALIFRAGILISTICEXPIALIDOCIOUS", "PSEUDOPSEUDOHYPOPARATHYROIDISM",
        "FLOCCINAUCINIHILIPILIFICATION", "ANTIDISESTABLISHMENTARIANISM", "HONORIFICABILITUDINITATIBUS"};
        String word = easyWords[(int) (Math.random()* easyWords.length)];
        String[] chosenWord = word.split("");
        temp = Arrays.asList(chosenWord);
        String[] emptyWord = new String[word.length()];
        for(int x = 0; x < emptyWord.length; x++) {
            emptyWord[x] = "_";
        }
        tempEmpty = Arrays.asList(emptyWord);
        int i = 6;
        while(true) {
            System.out.println(Arrays.toString(emptyWord) + "\nYou have " + i + " tries, type the answer to win");
            String guess = scanner.nextLine();
            if (guess.equalsIgnoreCase(word)) {
                System.out.println("Congratulations!");
                break;
            } else if (!temp.contains(guess)) {
                i--;
                if (i == 0) {
                    System.out.println("Game's over. Your word is " + word);
                    break;
                }
            } else if (temp.contains(guess)){
                for(int j = 0; j < temp.size(); j++) {
                    if (temp.get(j).equals(guess)) {
                        tempEmpty.set(j, guess);
                    }
                }
            }
        }
    }
}
