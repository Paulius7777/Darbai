package containers;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Paulius on 2017.10.16.
 */
public class ContainerHistory {

    private List<Double> history ;

    public ContainerHistory(){
        this.history = new ArrayList<Double>();

    }
    public void add(double situation){
        this.history.add(situation);
    }

    public void reset(){
        this.history.clear();
    }
    public String toString(){
        return this.history.toString();
    }

    public double maxValue(){
        if(history.isEmpty()){
            return 0;
        }else{
            return  Collections.max(history);
        }
    }

    public double minValue(){
        if( history.isEmpty()){
            return 0;
        }else{
            return Collections.min(history);
        }
    }

    public double average(){
        double sum = 0;
        if(history.isEmpty()){
            return 0;
        }else{

            for(double value : history){
                sum += value;
            }
            return sum / history.size();
        }
    }

    public double greatestFluctuation(){
        List<Double> fluctuations = new ArrayList<Double>();
        double greatestFluctuation = 0;
        if(history.isEmpty() || history.size() == 1){
            return greatestFluctuation;
        }else{
            for(int i = history.size() - 1; i >= 1; i--){
                double fluctuation = Math.abs(history.get(i) - history.get(i-1));
                fluctuations.add(fluctuation);
            }
        }
        for(double f : fluctuations){
            if(greatestFluctuation < f){
                greatestFluctuation = f;
            }
        }
        return greatestFluctuation;
    }

    public double variance(){
        double varianceSum = 0;
        if(history.isEmpty() || history.size() == 1){
            return varianceSum;
        }else{
            for(double v : history){
                varianceSum += (v - this.average())*(v - this.average());
            }
        }
        double variance = varianceSum/(history.size() - 1);
        return variance;
    }
}