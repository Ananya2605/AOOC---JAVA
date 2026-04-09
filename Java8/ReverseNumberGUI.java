import javax.swing.*;
import java.awt.event.*;

public class ReverseNumberGUI {
    public static void main(String[] args) {

        JFrame f = new JFrame("Reverse Number");

        JLabel l1 = new JLabel("Enter Number:");
        l1.setBounds(30, 30, 120, 30);

        JTextField tf = new JTextField();
        tf.setBounds(150, 30, 150, 30);

        JButton btn = new JButton("Reverse");
        btn.setBounds(100, 80, 120, 30);

        JLabel result = new JLabel("Result:");
        result.setBounds(30, 130, 250, 30);

        btn.addActionListener(e -> {
            String num = tf.getText();
            String rev = new StringBuilder(num).reverse().toString();
            result.setText("Result: " + rev);
        });

        f.add(l1);
        f.add(tf);
        f.add(btn);
        f.add(result);

        f.setSize(350, 250);
        f.setLayout(null);
        f.setVisible(true);
    }
}