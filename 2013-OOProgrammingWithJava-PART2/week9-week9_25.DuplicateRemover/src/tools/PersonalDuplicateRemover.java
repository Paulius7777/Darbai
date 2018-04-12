package tools;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Paulius on 2017.09.01.
 */
public class PersonalDuplicateRemover implements DuplicateRemover {

        private Set<String> list;
        private int count ;

    public PersonalDuplicateRemover(){
        this.count = 0;
        this.list = new HashSet<String>();
    }

    @Override
    public void add(String characterString) {
        if(list.contains(characterString)){
            count++;
        }
        list.add(characterString);
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return count;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        Set<String> uniqus = new HashSet<String>();
            for(String a:this.list){
                uniqus.add(a);
            }
                    
        return list;
    }

    @Override
    public void empty() {
        list.removeAll(list);
        count = 0;

    }
}
