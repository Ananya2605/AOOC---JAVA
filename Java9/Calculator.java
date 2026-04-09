import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

    JTextField tf;
    String num1 = "", num2 = "", operator = "";

    Calculator() {
        setTitle("Calculator");
        setSize(300, 400);
        setLayout(new BorderLayout());

        tf = new JTextField();
        tf.setFont(new Font("Arial", Font.BOLD, 20));
        tf.setHorizontalAlignment(JTextField.RIGHT);
        add(tf, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 5, 5));

        String buttons[] = {
                "7","8","9","/",
                "4","5","6","*",
                "1","2","3","-",
                "0","C","=","+",
                "√","x²","%","x³"
        };

        for(String b : buttons){
            JButton btn = new JButton(b);
            btn.addActionListener(this);
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if(cmd.matches("[0-9]")) {
            tf.setText(tf.getText() + cmd);
        }
        else if(cmd.equals("C")) {
            tf.setText("");
            num1 = num2 = operator = "";
        }
        else if(cmd.equals("=")) {
            num2 = tf.getText();
            double result = calculate();
            tf.setText("" + result);
        }
        else if(cmd.equals("√")) {
            double val = Double.parseDouble(tf.getText());
            tf.setText("" + Math.sqrt(val));
        }
        else if(cmd.equals("x²")) {
            double val = Double.parseDouble(tf.getText());
            tf.setText("" + (val * val));
        }
        else if(cmd.equals("x³")) {
            double val = Double.parseDouble(tf.getText());
            tf.setText("" + (val * val * val));
        }
        else {
            num1 = tf.getText();
            operator = cmd;
            tf.setText("");
        }
    }

    double calculate() {
        double a = Double.parseDouble(num1);
        double b = Double.parseDouble(num2);

        switch(operator) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b;
            case "%": return a % b;
        }
        return 0;
    }

    public static void main(String[] args) {
        new Calculator();
    }
}