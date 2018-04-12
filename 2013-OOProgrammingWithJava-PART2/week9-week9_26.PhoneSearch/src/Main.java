import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Start your program here
        // ATTENTION: In your program, you can create only one instance of class Scanner!
        UI phone = new UI(new Scanner(System.in), new PhoneBook());
        phone.start();
    }

}
