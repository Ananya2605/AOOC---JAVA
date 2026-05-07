
import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 5000);

            BufferedReader in = new BufferedReader(
                new InputStreamReader(s.getInputStream()));
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);

            out.println("Hello Server");

            String msg = in.readLine();
            System.out.println("Server: " + msg);

            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}