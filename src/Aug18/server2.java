package Aug18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server2 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(666);
        System.out.println("Server is running...");
        Socket s = ss.accept();
        System.out.println("Client is connected...");
        PrintStream ps = new PrintStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str1, str2;
            while ((str1 = br.readLine()) != null) {
                System.out.println(str1);
                str2 = kb.readLine();
                ps.println(str2);
            }
            ps.close();
            br.close();
            kb.close();
            ss.close();
            s.close();
            System.out.println("Server is closed...");
            System.exit(0);
        }
    }
}
