import java.util.HashMap;
import java.util.Map;

/**
 * Created by Paulius on 2017.02.10.
 */
public class PromissoryNote {
    private HashMap<String, Double> note;

    public PromissoryNote(){
        this.note = new HashMap<String, Double>();
    }
    public void setLoan(String toWhom, double value){
        this.note.put(toWhom, value);
    }

    public double howMuchIsTheDebt(String whose){
        if(!this.note.containsKey(whose)){
            return 0;
        }
        return this.note.get(whose);
    }

}
