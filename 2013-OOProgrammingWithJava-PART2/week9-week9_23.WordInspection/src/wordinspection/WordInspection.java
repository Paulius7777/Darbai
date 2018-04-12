package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Paulius on 2017.08.31.
 */
public class WordInspection {

    private File file;

    public WordInspection(File file) throws  Exception{
        this.file = file;
    }

    public int wordCount() throws Exception {
        Scanner scan = new Scanner(this.file, "UTF-8");
        int count = 0;
        String str = "";
        while (scan.hasNextLine()){
            str = scan.nextLine();
            count++;

        }
        scan.close();
        return count;
    }
    public List<String> wordsContainingZ() throws FileNotFoundException {
        List<String> wordZ = new ArrayList<String>();
        Scanner scan = new Scanner(this.file);
        while (scan.hasNextLine()){
            String line = scan.nextLine();
            if(line.contains("z")){
                wordZ.add(line);
                System.out.println(line);
            }
        }
        scan.close();
        return wordZ;
    }
    public List<String> wordsEndingInL() throws FileNotFoundException{
        List<String> l = new ArrayList<String>();
        Scanner scan = new Scanner(this.file);
        String str = "";
        while (scan.hasNextLine()){
            str = scan.nextLine();
            if(str.endsWith("l")) {
            l.add(str);
            }
        }
        scan.close();
        return l;
    }

    public List<String> palindromes()throws  FileNotFoundException{
        List<String> p = new ArrayList<String>();
        Scanner scan = new Scanner(this.file,"UTF-8");
        String str = "";
        String sReverse = reverse(str);
        while (scan.hasNextLine()){
            str = scan.nextLine();
            sReverse = reverse(str);
            if(str.equals(sReverse)) {
                p.add(str);
            }
        }
        scan.close();
        return p;
    }

//    public List<String> wordsWhichContainAllVowels() throws FileNotFoundException {
//        List<String> vowels = new ArrayList<String>();
//        Scanner scan = new Scanner(this.file);
//        String str ="";
//
//        while (scan.hasNextLine()){
//            str = scan.nextLine();
//            while (scan.hasNextLine()){
//                str = scan.nextLine();
//                if(find(str)){
//                    vowels.add(str);
//                }
//
//                }
//            }
//
//        return vowels;
//    }
public List<String> wordsWhichContainAllVowels() throws Exception{


    ArrayList<String> list = new ArrayList<String>();
    Scanner reader = new Scanner(this.file, "UTF-8");

    String buffer = "";

    while(reader.hasNextLine()){
        buffer = reader.nextLine();

        if(buffer.contains("a") && buffer.contains("e") && buffer.contains("i") && buffer.contains("o") && buffer.contains("u") && buffer.contains("y") && buffer.contains("ä") && buffer.contains("ö")){
            list.add(buffer);
        }

    }

    return list;
}

//    private boolean find(String str) {
//        String names[] = {"a","e","i","o","u","y","ä","ö"};
//        int count =0;
//        String buff = "";
//
//            for (int i = names.length - 1; i > 0; i--) {
//                buff = names[i];
//                if (str.contains(buff)) {
//                    count++;
//                }
//            }
//        if(count == 7){
//            return true;
//        }
//
//        return false;
//    }

    private String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String rev = sb.toString();


        return rev;
    }
}
