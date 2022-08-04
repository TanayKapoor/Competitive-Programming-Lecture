package Aug4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class encodingRead {
    public static void main(String[] args) {
        FileInputStream fis;
        InputStreamReader isr;
        try {
            fis = new FileInputStream("output.txt");
            isr = new InputStreamReader(fis);
            System.out.println("Encoding: " + isr.getEncoding());
            while (isr.ready()) {
                System.out.print((char) isr.read());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
