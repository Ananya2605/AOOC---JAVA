import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BorderLayoutExample extends JFrame implements ActionListener {

    JTextField input, result;
    JButton bin, oct, hex;

    BorderLayoutExample() {
        setTitle("Number Converter");
        setSize(400, 200);
        setLayout(new BorderLayout());

        JPanel top = new JPanel();
        top.add(new JLabel("Enter Number:"));
        input = new JTextField(10);
        top.add(input);

        JPanel center = new JPanel();
        bin = new JButton("Binary");
        oct = new JButton("Octal");
        hex = new JButton("Hex");

        center.add(bin);
        center.add(oct);
        center.add(hex);

        JPanel bottom = new JPanel();
        bottom.add(new JLabel("Result:"));
        result = new JTextField(10);
        bottom.add(result);

        add(top, BorderLayout.NORTH);
        add(center, BorderLayout.CENTER);
        add(bottom, BorderLayout.SOUTH);

        bin.addActionListener(this);
        oct.addActionListener(this);
        hex.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int num = Integer.parseInt(input.getText());

        if (e.getSource() == bin)
            result.setText(Integer.toBinaryString(num));
        else if (e.getSource() == oct)
            result.setText(Integer.toOctalString(num));
        else
            result.setText(Integer.toHexString(num));
    }

    public static void main(String[] args) {
        new BorderLayoutExample();
    }
}