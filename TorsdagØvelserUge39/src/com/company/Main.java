package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
    static Scanner scan;
    private static String[] text;
    private static int mostFreguent;
    static String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "æ", "ø", "å"};
    static int[] timesUsed = new int[29];

    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("data.txt");
        scan = new Scanner(file);

        String inputFromFile = "";

        while (scan.hasNextLine())                                // checks if theres more lines in the file
        {
            inputFromFile += scan.nextLine();                     // adds each line to the inputFromFile string.
        }

        text = inputFromFile.split(" ");                    // Creates and array of strings, where each element is a single word from the file.
        System.out.println(text.length);

        printWordsStartingWith("Ø");

        printWordsOfLength(3);


        printLongestWord("");
        printFirstHalfOfEachWord();
        printMostFrequentLetter();
        printLessFrequentLetter();


    }

    private static void printWordsOfLength(int l)
    {
        boolean wordisvalid = true;

        for (String s : text)
        {
            if (s.length() == l)
            {
                if (s.contains(",") || s.contains("."))
                {
                    wordisvalid = false;
                }

                if (wordisvalid)
                {
                    System.out.println(s);
                }
            }
        }
    }

    private static void printWordsStartingWith(String pattern)
    {
        for (String s : text) // for each word in text
        {
            if (s.startsWith(pattern) || s.startsWith(pattern.toLowerCase()))
            {
                System.out.println(s);
            }
        }
    }

   public static void printLongestWord(String string){
    String longestWord="";

    for(int i = 0; i < text.length;i++){

            if(text[i].length() >= longestWord.length()){
                longestWord= text[i];
            }
    }
       System.out.println(longestWord);
    }

    public static void printFirstHalfOfEachWord(){

        for(String s : text){
            System.out.println(s.substring(0,(s.length()/2)));
        }
    }

    //Fået hjælp af Muneeb til opgave 3 og 4
    private static void printMostFrequentLetter() {
        for(String s : text) {
            for (int i = 0 ; i < s.length() ; i++){
                for (int j = 0 ; j < letters.length ; j++) {                                                                //går i gennem letters arrayet
                    if (String.valueOf(s.charAt(i)).equalsIgnoreCase(letters[j])) {
                        timesUsed[j]++;
                    }
                }
            }
        }

        int mostUsed = 0;
        int indexOfMostUsed = 0;
        for(int i = 0 ; i < timesUsed.length ; i++) {
            if (timesUsed[i] > mostUsed) {
                mostUsed = timesUsed[i];
                indexOfMostUsed = i;
            }
        }
        mostFreguent = mostUsed;
        System.out.println(letters[indexOfMostUsed] + " has been used " + mostUsed);
    }

    private static void printLessFrequentLetter() {
        for(String s : text) {
            for (int i = 0 ; i < s.length() ; i++){
                for (int j = 0 ; j < letters.length ; j++) {
                    if (String.valueOf(s.charAt(i)).equalsIgnoreCase(letters[j])) {
                        timesUsed[j]++;
                    }
                }
            }
        }

        int leastFrequent = mostFreguent;
        int indexOfLeastUsed = 0;
        for(int i = 0 ; i < timesUsed.length ; i++) {
            if (timesUsed[i] <= leastFrequent) {
                leastFrequent = timesUsed[i];
                indexOfLeastUsed = i;
            }
        }
        System.out.println(letters[indexOfLeastUsed] + " has been used " + leastFrequent);
    }
}
