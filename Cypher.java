package com.example.cypher;

import java.util.Scanner;
import static com.example.cypher.sha1.*;

public class Cypher {

    public static int messLength = 0;

    public static void main(String[] args) {



        System.out.println("\n\t\t+++++ TEXT TO SHA1 +++++\n\t\t+++++ ТЕКСТ В SHA1 +++++\n\t");

        //GET THE WORD
        System.out.println("Написать слово: ");
        Scanner sc = new Scanner(System.in); //Create a scanner constructor
        String word = sc.nextLine(); //Save the text in a String

        System.out.println("Plain Text: " + word);

        //Converting the word to binary
        String binary = convertToBinary(word); //CALL THE FUNCTION TO BINARY
        messLength = binary.length(); //GET THE LENGTH OF THE WORD

        calculateMod(word, binary); //CALCULATE THE MOD
    }

}