package farmsimulator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paulius on 2017.10.17.
 */
public class Farm implements Alive {

    private String owner;
    private Barn barn;
    private List<Cow> cowsInBarn;


    public Farm(String ownerName, Barn ownerBarn){
        this.owner = ownerName;
        this.barn = ownerBarn;
        this.cowsInBarn = new ArrayList<Cow>();
    }

    public String getOwner(){
        return this.owner;
    }

    public String toString(){
        String title = "Farm owner: "+ this.owner + "\n"
                + "Barn bulk tank:" + this.barn.toString() + "\n"
                + "Animals: " + "\n";
                for(Cow c :cowsInBarn) {
                    title += "        " + c.toString() + "\n";
                }
        return title;
    }


    @Override
    public void liveHour() {
        for(Cow c: cowsInBarn){
            c.liveHour();
        }
    }

    public void addCow(Cow cow) {
        cowsInBarn.add(cow);
    }

    public void installMilkingRobot(MilkingRobot robot) {
        this.barn.installMilkingRobot(robot);
    }

    public void manageCows() {
        this.barn.takeCareOf(cowsInBarn);
    }
}
