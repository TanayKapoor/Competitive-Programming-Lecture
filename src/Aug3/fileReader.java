package Aug3;

import java.io.FileReader;
import java.io.IOException;

public class fileReader {
    public static void main(String[] args) {
        FileReader fr;
        int ch;
        try{
            fr = new FileReader("output.txt");
            while((ch = fr.read()) != -1){
                System.out.print((char)ch);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
