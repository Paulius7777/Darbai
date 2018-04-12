package clicker.applicationlogic;

/**
 * Created by Paulius on 2017.10.20.
 */
public class PersonalCalculator implements Calculator {

    private Integer value;


    public PersonalCalculator(){

        this.value = 0;
    }
    @Override
    public int giveValue() {
        return this.value;
    }

    @Override
    public void increase() {
        this.value++;
    }
}
