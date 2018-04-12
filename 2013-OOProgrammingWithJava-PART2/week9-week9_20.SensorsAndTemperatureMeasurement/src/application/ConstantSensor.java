package application;

/**
 * Created by Paulius on 2017.08.30.
 */
public class ConstantSensor implements Sensor {

    private int temperature;

    public ConstantSensor(int parameter) {
        this.temperature = parameter;
    }

    @Override
        public boolean isOn() {
        return true;
    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    @Override
    public int measure() {
        return this.temperature;
    }
}
