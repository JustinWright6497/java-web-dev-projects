package org.launchcode;
import java.util.Scanner;

public class SentenceWordSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String aliceFirstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";
        aliceFirstSentence = aliceFirstSentence.toLowerCase();

        System.out.println("What word would you like to search for?");
        String wordToFind = input.nextLine();

        Boolean wordInAliceFirstSentence = aliceFirstSentence.contains(wordToFind.toLowerCase());
        Integer wordIndexInAliceFirstSentence = aliceFirstSentence.indexOf(wordToFind);

        System.out.println("Does the first sentence in Alice's Adventures in Wonderland contain " + wordToFind + ": " + wordInAliceFirstSentence);
        System.out.println(wordIndexInAliceFirstSentence);
        System.out.println(wordToFind.length());
        if (wordIndexInAliceFirstSentence == 0) {
            aliceFirstSentence = aliceFirstSentence.substring(wordToFind.length());
        } else {
            aliceFirstSentence = aliceFirstSentence.substring(0, wordIndexInAliceFirstSentence) + aliceFirstSentence.substring(wordIndexInAliceFirstSentence + wordToFind.length());
        }
        System.out.println(aliceFirstSentence);
    }
}
