package Aug18;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.nio.Buffer;

public class client2 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 666);
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        String str1, str2;
        while (!(str1 = br.readLine()).equals("bye")) {
            dos.writeBytes(str1 + "\n");
            str2 = br.readLine();
            System.out.println(str2);
        }
        System.out.println("Client is closed...");
        dos.close();
        br.close();
        s.close();
    }
}
