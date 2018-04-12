package wordinspection;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {
        // test your code here

        File file = new File("src/wordList.txt");
        // all words are in file src/wordList.txt
        WordInspection wordInsp = new WordInspection(file);
        System.out.println(wordInsp.wordCount());
        System.out.println(wordInsp.wordsWhichContainAllVowels());
    }
}
