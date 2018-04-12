package people;

/**
 * Created by Paulius on 2017.09.26.
 */
public class Person {
    private String name;
    private String address;
    
    public Person(String name , String address){
        this.name = name;
        this.address = address;
    }
    @Override
    public String toString(){
       return  this.name +"\n" + "  " +this.address;
    }
}
