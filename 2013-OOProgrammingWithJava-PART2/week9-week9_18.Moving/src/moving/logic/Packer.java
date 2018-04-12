package moving.logic;

import moving.domain.Box;
import moving.domain.Thing;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paulius on 2017.08.29.
 */
public class Packer  {

    private int packerVol;


    public Packer(int boxesVolume){
        this.packerVol = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things) {
            Box box = new Box(this.packerVol);
            List<Box> n = new ArrayList<Box>();

        for (Thing a: things ) {
            System.out.println("Ading");
            if(box.addThing(a)) {
                n.add(box);
                box = new Box(this.packerVol);
            }
        }

        return n;
    }

}
