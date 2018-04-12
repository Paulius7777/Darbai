
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }


    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }


    @Override
    public boolean equals(Object other) {

        Bird compared = (Bird) other;
        if(this.latinName == null || !this.latinName.equals(compared.latinName)){
            return false;
        }
        if(this.ringingYear != compared.ringingYear){
            return false;
        }


        return true;
    }

    @Override
    public int hashCode() {
        return this.ringingYear + this.latinName.hashCode();
    }
}


