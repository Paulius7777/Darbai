package boxes;

/**
 * Created by Paulius on 2017.10.17.
 */
public class OneThingBox extends Box {

    private Thing oneThing;


    public OneThingBox(){

    }
    @Override
    public void add(Thing thing) {
        if(this.oneThing != null){
            return;
        }else{
            this.oneThing = thing;
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if(this.oneThing !=null && this.oneThing.equals(thing)){
            return true;
        }
        return false;
    }
}
