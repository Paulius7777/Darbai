import java.util.ArrayList;

/**
 * Created by Paulius on 2017.02.13.
 */
public class Box implements ToBeStored {
    private ArrayList<ToBeStored> thingsWheight;
    private double maxWheight;

    public Box(double maxWheight){
        this.maxWheight = maxWheight;
        this.thingsWheight = new ArrayList<ToBeStored>();
    }

    public void add(ToBeStored object){
        double countwhieght = 0;
        for(ToBeStored wheght: thingsWheight){
            countwhieght += wheght.weight();
        }
        if((countwhieght + object.weight()) < maxWheight){
            this.thingsWheight.add(object);
        }

    }
    @Override
    public double weight() {
        double countwhieght = 0;
        for(ToBeStored wheght: thingsWheight){
            countwhieght += wheght.weight();
        }
        return countwhieght;
    }

    public String toString(){
        return "Box: " + getcountThing() + " things, total weight " + weight() +" kg";
    }

    public int getcountThing() {
        return this.thingsWheight.size();
    }
}
