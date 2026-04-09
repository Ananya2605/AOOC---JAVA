import java.awt.event.*;
import javax.swing.*;

public class TextCounter extends JFrame implements KeyListener {

    JTextArea ta;
    JLabel label;

    TextCounter() {
        setTitle("Text Counter");
        setSize(400, 300);
        setLayout(null);

        ta = new JTextArea();
        ta.setBounds(50, 30, 300, 150);

        label = new JLabel("Chars: 0 Words: 0");
        label.setBounds(50, 200, 300, 30);

        ta.addKeyListener(this);

        add(ta);
        add(label);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void keyReleased(KeyEvent e) {
        String text = ta.getText();
        int chars = text.length();
        int words = text.trim().isEmpty() ? 0 : text.trim().split("\\s+").length;

        label.setText("Chars: " + chars + " Words: " + words);
    }

    public void keyTyped(KeyEvent e) {}
    public void keyPressed(KeyEvent e) {}

    public static void main(String[] args) {
        new TextCounter();
    }
}