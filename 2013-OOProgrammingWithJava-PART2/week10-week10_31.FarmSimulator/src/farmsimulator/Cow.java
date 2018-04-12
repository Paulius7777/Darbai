package farmsimulator;

import java.util.Random;

/**
 * Created by Paulius on 2017.10.17.
 */
public class Cow implements Milkable, Alive {

    private Random rand = new Random();
    private String name ;

    private double udderCapacity;
    private double milkAmount;

    private static final String[] NAMES = new String[]{
            "Anu", "Arpa", "Essi", "Heluna", "Hely",
            "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
            "Jaana", "Jami", "Jatta", "Laku", "Liekki",
            "Mainikki", "Mella", "Mimmi", "Naatti",
            "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
            "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Cow(){

        int nameInex = rand.nextInt(NAMES.length);
        this.name = NAMES[nameInex];
        this.udderCapacity = 25 + rand.nextInt(5);
        this.milkAmount = 0;

    }
    public Cow(String name){
        this.name = name;

        this.udderCapacity = 25 + rand.nextInt(5);
        this.milkAmount = 0;
    }
    public String getName(){
        return this.name;
    }
    public double getCapacity(){
        return this.udderCapacity;
    }
    public double getAmount(){
        return this.milkAmount;
    }
    public String toString(){
        return getName()+ " " + Math.ceil(this.milkAmount) + "/" + Math.ceil(getCapacity());
    }

    @Override
    public void liveHour() {
        this.milkAmount += (7 + rand.nextInt(20-7+1))/10.0;
        if(this.milkAmount > this.udderCapacity){
            this.milkAmount = this.udderCapacity;
        }
    }

    @Override
    public double milk() {
        double milkTaken = this.milkAmount;
        this.milkAmount = 0;
        return milkTaken;
    }
}
