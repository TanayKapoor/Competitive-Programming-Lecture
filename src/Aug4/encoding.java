package Aug4;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class encoding {
    public static void main(String[] args) {
        try {
            File file = new File("output.txt");
            char[] a = {'پ', 'ب', 'ت', 'ث'};
            char[] b = {'a', 'b', 'c', 'd'};

            Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8));
            out.write(a);
            out.write(b);
            out.close();
            System.out.println("DONE");
        } catch (FileNotFoundException ignored) {
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
