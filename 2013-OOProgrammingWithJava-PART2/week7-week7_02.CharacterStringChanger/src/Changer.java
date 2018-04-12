import java.util.ArrayList;

/**
 * Created by Paulius on 2017.02.08.
 */
public class Changer {

    private ArrayList<Change> changes;
    private Change chenge;


    public Changer(){
        this.changes = new ArrayList<Change>();
    }

    public void addChange(Change change) {
        this.changes.add(change);
    }

    public String change(String characterString) {
        String word = characterString;
        for(Change cell: this.changes){
            word = cell.change(word);
        }

        return word;
    }
}
