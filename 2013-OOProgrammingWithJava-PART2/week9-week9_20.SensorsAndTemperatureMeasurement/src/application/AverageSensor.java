package application;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paulius on 2017.08.30.
 */
public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> reads;
    

    public AverageSensor(){
        this.sensors = new ArrayList<Sensor>();
        this.reads = new ArrayList<Integer>();
    }

    public List<Integer> readings(){
     return   this.reads;
    }

    @Override
    public boolean isOn() {
        for (Sensor s : sensors) {
            if (s.isOn()) {
                return true;
            }
        }
        return  false;
    }


    @Override
    public void on() {
        for(Sensor s : sensors){
            s.on();
        }
    }

    @Override
    public void off() {
        for(Sensor s : sensors){
            s.off();
        }
    }

    @Override
    public int measure() {

        if (!isOn() || sensors.isEmpty()) {
            throw new IllegalArgumentException("Termometer off or mising");
        } else {


            int t = 0;
            int average;
            for (Sensor s : sensors) {
                t += s.measure();
            }
            average = t / sensors.size();

            reads.add(average);
            return average;
        }
    }

    public void addSensor(Sensor additional) {
        this.sensors.add(additional);
    }

}
