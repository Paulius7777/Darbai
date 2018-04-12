package people;

/**
 * Created by Paulius on 2017.09.26.
 */
public class Student extends Person{
    private int credits;


    public Student(String name, String address) {
        super(name, address);

    }

    public int credits(){
        return credits;
    }
    public void study(){
        credits++;
    }

    public String toString(){
        return super.toString() + "\n" + "  credits " + credits;
    }

}

