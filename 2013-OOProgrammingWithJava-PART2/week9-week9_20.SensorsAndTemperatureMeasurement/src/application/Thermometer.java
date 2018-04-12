package application;

import java.util.Random;

/**
 * Created by Paulius on 2017.08.30.
 */
public class Thermometer implements Sensor {

    private Random random;
    private Boolean status;

    public Thermometer(){
        this.random = new Random();
        this.status = false;
    }
    @Override
    public boolean isOn() {
        return this.status;
    }

    @Override
    public void on() {
        this.status = true;
    }

    @Override
    public void off() {
        this.status = false;
    }

    @Override
    public int measure() {
        if (!isOn()){
            throw new IllegalArgumentException("On thermometer");
        }
        int randomNum = random.nextInt(30 - (-30) + 1) - 30;

        return randomNum;
    }
}
