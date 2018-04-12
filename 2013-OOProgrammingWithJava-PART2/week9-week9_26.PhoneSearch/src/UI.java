import java.util.Scanner;

/**
 * Created by Paulius on 2017.09.15.
 */
public class UI {

    private Scanner scanner;
    private PhoneBook phoneBook;


    public UI(Scanner scanner, PhoneBook phoneBook) {
        this.scanner = scanner;
        this.phoneBook = phoneBook;


    }

    public void start() {

        System.out.println("phone search");
        System.out.println("available operations:");
        System.out.println(" 1 add a number");
        System.out.println(" 2 search for a number");
        System.out.println(" 3 search for a person by phone number");
        System.out.println(" 4 add an address");
        System.out.println(" 5 search for personal information");
        System.out.println(" 6 delete personal information");
        System.out.println(" 7 filtered listing");
        System.out.println(" x quit");


        while (true){
            System.out.println("command:");
            String input = scanner.next();
            if(input.equals("1")){
                System.out.println("whose number:");
                String name = scanner.next();
                System.out.print("number:");
                String number = scanner.next();
                phoneBook.addNumber(name, number);
                System.out.println();

                } else if(input.equals("2")){
                System.out.print("whose number:");
                String name = scanner.next();
                phoneBook.searchNumberByPerson(name);
                System.out.println();

            }else if(input.equals("3")){
                System.out.print("number:");
                String number = scanner.next();
                phoneBook.serchByNumber(number);
                System.out.println();

            }else if(input.equals("4")){
                System.out.println("whose address:");
                String name = scanner.next();
                System.out.println("street:");
                String street = scanner.next();
                System.out.println("city:");
                String city = scanner.next();
                phoneBook.addAdress(name, street, city);
                System.out.println();

            }else if(input.equals("5")){
                System.out.print("whose information:");
                String name = scanner.next();
                phoneBook.personInfo(name);

            }else if(input.equals("6")){
                System.out.println("whose information:");
                String person = scanner.next();
                phoneBook.remov(person);
            }else if(input.equals("7")){
                System.out.println("keyword (if empty, all listed): ");
                String keyword = scanner.next();
                phoneBook.keyword(keyword);
            }



                else if(input.equals("x")){
                break;
            }


        }




    }

}
