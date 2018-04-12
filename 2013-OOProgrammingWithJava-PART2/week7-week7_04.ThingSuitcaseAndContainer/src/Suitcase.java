import java.util.ArrayList;

/**
 * Created by Paulius on 2017.02.09.
 */
public class Suitcase {
    private ArrayList<Thing> things;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
    }

    public void addThing(Thing thing) {
        if (this.maxWeight >= thing.getWeight() + suitcaseWheight()) {
            things.add(thing);
        }

    }

    public int suitcaseWheight() {
        int suitcaseWheight = 0;
        for (Thing addedThingsWheith : things) {
            suitcaseWheight += addedThingsWheith.getWeight();
        }
        return suitcaseWheight;
    }

    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing.getName() + " (" + thing.getWeight() + " kg)");
        }
    }

    public int totalWeight() {
        return suitcaseWheight();
    }


    public String toString() {
        if (things.size() == 0) {
            return "empty (" + suitcaseWheight() + " kg)";
        } else if (things.size() == 1) {
            return things.size() + " thing (" + suitcaseWheight() + " kg)";

        } else {
            return things.size() + " things (" + suitcaseWheight() + " kg)";
        }

    }


    public Thing heaviestThing() {
        if (things.isEmpty()) {
            return null;
        }
        int heaviest = things.get(0).getWeight();
        int i = 0;
        Thing h = things.get(0);
        for(Thing thing: things){
            if(thing.getWeight()>heaviest){
                heaviest = thing.getWeight();
                h = things.get(i);
            }
            i++;
        }
        return h;
    }
}

