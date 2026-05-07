
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class addclient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 6000);

            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            dos.writeInt(a);
            dos.writeInt(b);

            int result = dis.readInt();
            System.out.println("Sum from server: " + result);

            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}