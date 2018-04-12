package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


/**
 * Created by Paulius on 2017.10.18.
 */
public class MindfulDictionary {

    private Map<String, String> dicti = new HashMap<String, String>();
    private File file;
    private Scanner fileReader;


    public MindfulDictionary(){
    }

    public MindfulDictionary(String file) throws FileNotFoundException, IOException{
        this.file = new File(file);
        try{
            this.fileReader = new Scanner(this.file);
        }catch (FileNotFoundException e){
            System.out.println("file not found");
        }

    }


    public void add(String word, String translation){
        if(!this.dicti.containsKey(word)){
            dicti.put(word, translation);
        }
    }

    public String translate(String word){
        if(this.dicti.containsKey(word)){
            return this.dicti.get(word);
        }else if(this.dicti.containsValue(word)){
            for(String key: dicti.keySet()){
                if(this.dicti.get(key).equals(word)){
                    return key;
                }
            }
        }
        return null;
    }

    public void remove(String word){

        List<String> keys = new ArrayList<String>();

        for(String key : this.dicti.keySet()){
            keys.add(key);
        }
        if(this.dicti.containsKey(word)){
            this.dicti.remove(word);
        }else{
            for (String key: keys){
                if(this.dicti.get(key).equals(word)){
                    this.dicti.remove(key);
                }
            }
        }
    }

    public boolean load() {

        try {


            Scanner fileReader = new Scanner(this.file);

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                this.dicti.put(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean save() {

        FileWriter writer;
        try {
            writer = new FileWriter(file);
            for (String key : this.dicti.keySet()) {
                writer.write(key + ":" + this.dicti.get(key));
                writer.write("\n");
            }
            writer.close();
            return true;
        } catch (IOException ex) {
            return false;
        }
    }

}

