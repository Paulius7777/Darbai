import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Paulius on 2017.02.13.
 */
public class VehicleRegister {
        private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister(){
        this.owners = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner){
        if(owners.get(plate) == null){
            owners.put(plate,owner);
            return  true;
        } else {
            return false;
        }
    }
    public String get(RegistrationPlate plate){
        if(owners.containsKey(plate)){
            return owners.get(plate);
        }
        return null;
    }
    public boolean delete(RegistrationPlate plate){
        if(owners.containsKey(plate)){
            owners.remove(plate);
            return true;
        } else {
            return  false;
        }

    }
    public void printRegistrationPlates(){
        for (RegistrationPlate key: owners.keySet()){
            System.out.println(key);
        }
    }
    public void printOwners(){
            ArrayList<String> ownersNames = new ArrayList<String>();
        for(RegistrationPlate key : owners.keySet()){
            String name = owners.get(key);
            if(!ownersNames.contains(name)){
                ownersNames.add(name);
            }
        }
        for(String name : ownersNames){
            System.out.println(name);
        }

    }
}
