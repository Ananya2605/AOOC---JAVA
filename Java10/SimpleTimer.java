import javax.swing.*;
import java.awt.event.*;

public class SimpleTimer extends JFrame implements ActionListener {

    JLabel label;
    JButton start, stop;
    Timer timer;
    int count = 0;

    SimpleTimer() {
        setTitle("Timer");
        setSize(300, 200);
        setLayout(null);

        label = new JLabel("0");
        label.setBounds(130, 30, 100, 30);

        start = new JButton("Start");
        start.setBounds(50, 80, 80, 30);

        stop = new JButton("Stop");
        stop.setBounds(150, 80, 80, 30);

        add(label);
        add(start);
        add(stop);

        timer = new Timer(1000, e -> {
            count++;
            label.setText(String.valueOf(count));
        });

        start.addActionListener(e -> timer.start());
        stop.addActionListener(e -> timer.stop());

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {}

    public static void main(String[] args) {
        new SimpleTimer();
    }
}