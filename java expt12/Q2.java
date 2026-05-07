import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Stopwatch extends JFrame implements Runnable {
    JLabel label;
    JButton start, stop, reset;

    int seconds = 0;
    boolean running = false;
    Thread t;

    Stopwatch() {
        label = new JLabel("Time: 0", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 30));

        start = new JButton("Start");
        stop = new JButton("Stop");
        reset = new JButton("Reset");

        start.addActionListener(e -> {
            if (!running) {
                running = true;
                t = new Thread(this);
                t.start();
            }
        });

        stop.addActionListener(e -> running = false);

        reset.addActionListener(e -> {
            running = false;
            seconds = 0;
            label.setText("Time: 0");
        });

        setLayout(new BorderLayout());
        add(label, BorderLayout.CENTER);

        JPanel panel = new JPanel();
        panel.add(start);
        panel.add(stop);
        panel.add(reset);

        add(panel, BorderLayout.SOUTH);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void run() {
        while (running) {
            seconds++;
            label.setText("Time: " + seconds);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
    }

    public static void main(String[] args) {
        new Stopwatch();
    }
}