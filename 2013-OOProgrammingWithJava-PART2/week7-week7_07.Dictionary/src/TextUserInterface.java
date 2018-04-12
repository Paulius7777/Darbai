import java.util.Scanner;

/**
 * Created by Paulius on 2017.02.12.
 */
public class TextUserInterface {
        private Scanner reader;
        private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader = reader;
        this.dictionary = dictionary;
    }
    public void start(){
        while (true) {
            System.out.println("Statment: ");
            System.out.println("add - adds a word pair to the dictionary");
            System.out.println("translate - asks a word and prints int translation");
            System.out.println("quit - quit the text user interface" + "\n");
            System.out.println("Statment: ");
            String choice = reader.nextLine();

            if (choice.equals("add")) {
                add();
            } else if (choice.equals("translate")) {
                translate();
            } else if (choice.equals("quit")){
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Unknown statment" +"\n");
            }
        }

    }

    private void translate() {
        System.out.println("Giv a word: ");
        String word = reader.nextLine();
        System.out.println("Translation: " + dictionary.translate(word) + "\n");
    }

    private void add() {
        System.out.println("In Finnish: ");
        String finnWord = reader.nextLine();
        System.out.println("Translation: ");
        String engWord = reader.nextLine();
        dictionary.add(finnWord, engWord);
        System.out.println();
    }


}
