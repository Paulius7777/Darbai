import java.util.Scanner;

/**
 * Created by Paulius on 2017.02.08.
 */
public class Reader {
    private  Scanner reader ;

    public Reader(){
        this.reader = new Scanner(System.in);
    }

    public String readString(){
        return this.reader.nextLine();
    }

    public int readInteger(){
        return Integer.parseInt(this.reader.nextLine());
    }
}
