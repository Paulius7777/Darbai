package boxes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paulius on 2017.10.17.
 */
public class MaxWeightBox extends Box{

    private int maxWheitght;
    private List<Thing> things;


    public MaxWeightBox(int maxWeight) {
        this.maxWheitght = maxWeight;
        this.things = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        int currentWeight = 0;
        for (Thing f:things) {
            currentWeight += f.getWeight();
            }
            if(this.maxWheitght >= currentWeight + thing.getWeight()){
                things.add(thing);
            }
        }


    @Override
    public boolean isInTheBox(Thing thing) {
        for (Thing f: things){
            if(f.equals(thing)){
                return true;
            }
        }
        return false;
    }
}
