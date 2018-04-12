package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Paulius on 2017.08.31.
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {

    private Map<String, Set<String>> dictionar;

    public PersonalMultipleEntryDictionary(){
    this.dictionar = new HashMap<String, Set<String>>();
    }

    @Override
    public void add(String word, String entry) {
        if(!this.dictionar.containsKey(word)){
            this.dictionar.put(word, new HashSet<String>());
        }
        Set<String> finished = this.dictionar.get(word);
        finished.add(entry);
    }

    @Override
    public Set<String> translate(String word) {
        if(dictionar.containsKey(word)){
            return dictionar.get(word);
        }
        return null;
    }

    @Override
    public void remove(String word) {
        if(dictionar.containsKey(word)){
            dictionar.remove(word);
        }
    }
}
