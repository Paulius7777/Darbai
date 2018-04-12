package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Paulius on 2017.08.31.
 */
public class Analysis {

    private File file;

    public Analysis(File file) throws Exception{
        this.file = file;
    }

    public int lines() throws FileNotFoundException {
        Scanner read = new Scanner(this.file);
        int count = 0;
        String str = "";
        while (read.hasNextLine()){
            str = read.nextLine();
            count++;
        }
        read.close();
        return count;
    }

    public int characters() throws FileNotFoundException{
        Scanner read = new Scanner(this.file);
        int count = 0;
        String str = "";
        while (read.hasNextLine()){
            str = read.nextLine();
            count += str.length();
            count++;
        }
        return count;
    }
}
