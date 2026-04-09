import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CounterApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Counter");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Counter:");
        JTextField textField = new JTextField("0", 10);

        JButton up = new JButton("Count Up");
        JButton down = new JButton("Count Down");
        JButton reset = new JButton("Reset");

        up.addActionListener(e -> {
            int value = Integer.parseInt(textField.getText());
            textField.setText(String.valueOf(value + 1));
        });

        down.addActionListener(e -> {
            int value = Integer.parseInt(textField.getText());
            textField.setText(String.valueOf(value - 1));
        });

        reset.addActionListener(e -> textField.setText("0"));

        frame.add(label);
        frame.add(textField);
        frame.add(up);
        frame.add(down);
        frame.add(reset);

        frame.setVisible(true);
    }
}