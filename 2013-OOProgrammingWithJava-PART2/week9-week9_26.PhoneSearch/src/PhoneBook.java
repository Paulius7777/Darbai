import java.util.*;

/**
 * Created by Paulius on 2017.09.15.
 */
public class PhoneBook implements PhoneMetods {

    private Map<String, List<String>> namePhone = new HashMap<String, List<String>>();
    private Map<String, Map<String, String>> nameAdress = new HashMap<String, Map<String, String>>();


    public PhoneBook(){

    }

    @Override
    public void addNumber(String person, String number) {
        if(!namePhone.containsKey(person)){
            namePhone.put(person,new ArrayList<String>());
            namePhone.get(person).add(number);
        }else{
            namePhone.get(person).add(number);
        }
    }

    @Override
    public void searchNumberByPerson(String name) {
        if(namePhone.containsKey(name)){
            for(String numbers: namePhone.keySet()){
                System.out.println(namePhone.get(name));
            }
        }else {
            System.out.println("not found");
        }
    }

    @Override
    public void serchByNumber(String number) {

        for (String name : namePhone.keySet()){
            for (String numbers: namePhone.get(name)){
                if(numbers.equals(number)){
                    System.out.println(name);
                }else{
                    System.out.println("not found");
                }
            }
        }
        }

    @Override
    public void addAdress(String name, String street, String city) {
        nameAdress.put(name, new HashMap<String, String>());
        nameAdress.get(name).put(street, city);
    }


    @Override
    public void personInfo(String person) {
        if (nameAdress.containsKey(person) || namePhone.containsKey(person)) {


        if (!nameAdress.containsKey(person)) {
            System.out.println(" address unknown ");
        } else {
            System.out.print(" address:");

            for (String street : nameAdress.get(person).keySet()) {
                System.out.println(street + " ");
                System.out.println(nameAdress.get(person).get(street));
            }

        }

        if (namePhone.containsKey(person)) {
            System.out.println(" phone numbers:");
            for (String numbers : namePhone.keySet()) {
                System.out.println(" " + namePhone.get(person));
            }
        } else {
            System.out.println("phone number not found");
            System.out.println();
        }

    } else{
            System.out.println("not found");
        }
    }

    @Override
    public void remov(String person) {
        namePhone.remove(person);
        nameAdress.remove(person);
    }

    @Override
    public void keyword(String keyword) {

    }

}

