package moving.domain;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paulius on 2017.08.29.
 */
public class Box implements Thing{

    private int maxCap;
    private List<Thing> things;

    public Box(int maximumCapacity) {
        this.maxCap = maximumCapacity;
        this.things = new ArrayList<Thing>();
    }

    public boolean addThing(Thing thing){
        if(thing.getVolume() + getVolume() <= this.maxCap){
            this.things.add(thing);
            return true;
        }
        return false;

    }



    @Override
    public int getVolume() {
        int sum = 0;
        for (Thing a: things) {
           sum += a.getVolume();
        }
        return sum;
    }
}
