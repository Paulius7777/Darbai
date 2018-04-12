import java.io.File;
import java.util.Scanner;

/**
 * Created by Paulius on 2017.08.31.
 */
public class Printer {

    private Scanner read;
    private File file;


    public Printer(String fileName)  {
        this.file = new File(fileName);
    }

    public void printLinesWhichContain(String word) throws Exception{
        read = new Scanner(file);

        while (read.hasNextLine()){
            String line = read.nextLine();
            if(line.contains(word)){
                System.out.println(line);
            }

        }
        read.close();
    }
}
