package movable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paulius on 2017.09.18.
 */
public class Group implements Movable {
        private List<Movable> orgL;

    public Group(){
        this.orgL = new ArrayList<Movable>();
    }

    @Override
    public void move(int dx, int dy) {
        for(Movable m :this.orgL){
            m.move(dx,dy);
        }
    }

    public void addToGroup(Movable movable) {
        this.orgL.add(movable);
    }
    public String toString(){
        String group = "";
        for(Movable m: this.orgL){
            group += m + "\n";
        }
        return group ;
    }
}
