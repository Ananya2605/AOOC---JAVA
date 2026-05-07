import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GridLayoutExample extends JFrame implements ActionListener {

    JButton[] btn = new JButton[6];
    int first = -1;

    GridLayoutExample() {
        setTitle("GridLayout Swap");
        setLayout(new GridLayout(2, 3, 5, 5));

        for (int i = 0; i < 6; i++) {
            btn[i] = new JButton(String.valueOf(i + 1));
            btn[i].addActionListener(this);
            add(btn[i]);
        }

        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 6; i++) {
            if (e.getSource() == btn[i]) {
                if (first == -1) {
                    first = i;
                } else {
                    String temp = btn[first].getText();
                    btn[first].setText(btn[i].getText());
                    btn[i].setText(temp);
                    first = -1;
                }
            }
        }
    }

    public static void main(String[] args) {
        new GridLayoutExample();
    }
}