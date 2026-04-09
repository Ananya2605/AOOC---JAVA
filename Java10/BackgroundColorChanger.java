import java.awt.*;
import javax.swing.*;

public class BackgroundColorChanger extends JFrame {

    JButton btn;

    BackgroundColorChanger() {
        setTitle("Color Changer");
        setSize(400, 300);

        btn = new JButton("Choose Color");

        btn.addActionListener(e -> {
            Color color = JColorChooser.showDialog(this, "Select Color", Color.WHITE);
            getContentPane().setBackground(color);
        });

        add(btn);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BackgroundColorChanger();
    }
}