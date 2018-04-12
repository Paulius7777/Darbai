import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Paulius on 2017.02.11.
 */
public class Dictionary {

    private HashMap<String, String> dictionary;

    public Dictionary(){
        this.dictionary = new HashMap<String, String>();
    }

    public String translate(String word){
        return dictionary.get(word);
    }

    public void add(String word, String translation){
        this.dictionary.put(word, translation);
    }

    public int amountOfWords(){
       return this.dictionary.size();
    }

    public ArrayList<String> translationList(){
        ArrayList<String> list = new ArrayList<String>();
        for(String key : this.dictionary.keySet()){
            String wordTranslete = key + " = " + translate(key);
            list.add(wordTranslete);
        }
       return list;
    }



}
