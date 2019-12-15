package inheritance;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptions {
    public static void main(String[] args) {
        String s = null;
        System.out.println(s.length());



        try {
            FileReader fileReader = new FileReader("//sadasd/sdasda/");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }




    }
}