import java.io.*;
import java.net.*;

public class AddServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(6000);
            System.out.println("Server started...");

            Socket s = ss.accept();

            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            int a = dis.readInt();
            int b = dis.readInt();

            int sum = a + b;
            System.out.println("Received: " + a + " + " + b);

            dos.writeInt(sum);

            s.close();
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}