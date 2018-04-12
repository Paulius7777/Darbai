import java.util.ArrayList;

/**
 * Created by Paulius on 2017.02.10.
 */
public class Container {
    private int maxWeightContainer;
    private ArrayList<Suitcase> suitcases;

    public Container(int maxWeightContainer){
        this.maxWeightContainer = maxWeightContainer;
        this.suitcases = new ArrayList<Suitcase>();
    }

    public int getMaxWeightContainer() {
        return maxWeightContainer;
    }

    public void addSuitcase(Suitcase suitcase){
        if((getSuitcasesWheight() + suitcase.suitcaseWheight()) <= maxWeightContainer){
            suitcases.add(suitcase);
        }
    }
    public int getSuitcasesWheight(){
        int countWheigt = 0;
        for(Suitcase wheite : suitcases){
            countWheigt += wheite.suitcaseWheight();
        }
        return countWheigt;
    }

    public void printThings(){
        for( Suitcase thing : suitcases){
           thing.printThings();
        }
    }

    public String toString(){
        return suitcases.size() +" suitcases" + " (" + getSuitcasesWheight() + " kg)";
    }
}
