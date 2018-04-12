package boxes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paulius on 2017.10.17.
 */
public class BlackHoleBox extends  Box {

    private List<Thing> blackHoleBox;
    public BlackHoleBox(){
        this.blackHoleBox = new ArrayList<Thing>();
    }


    @Override
    public void add(Thing thing) {
        this.blackHoleBox.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
}
