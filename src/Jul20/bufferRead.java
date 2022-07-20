package Jul20;

import java.io.BufferedReader;

public class bufferRead {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        System.out.println("Enter name");
        try {
            String name = br.readLine();
            System.out.println("Hello " + name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
