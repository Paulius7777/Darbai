/**
 * Created by Paulius on 2017.02.13.
 */
public class CD implements ToBeStored {
    private String artist;
    private String title;
    private int publishing;
    private double weightCD;

    public CD(String artist, String title, int publishing) {
        this.artist = artist;
        this.title = title;
        this.publishing = publishing;
        this.weightCD = 0.1;
    }

    public double weight(){
        return this.weightCD;
    }
    public String toString(){
        return this.artist + ": " + this.title + " (" + this.publishing + ")";
    }
}
