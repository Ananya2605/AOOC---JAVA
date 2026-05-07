import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class BallPanel extends JPanel implements Runnable {
    int x = 50, y = 50;
    int dx = 2, dy = 2;
    Thread t;

    BallPanel() {
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (t == null) {
                    t = new Thread(BallPanel.this);
                    t.start();
                }
            }
        });
    }

    public void run() {
        while (true) {
            x += dx;
            y += dy;

            if (x <= 0 || x >= getWidth() - 30)
                dx = -dx;

            if (y <= 0 || y >= getHeight() - 30)
                dy = -dy;

            repaint();

            try {
                Thread.sleep(10);
            } catch (Exception e) {}
        }
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillOval(x, y, 30, 30);
    }
}

public class BouncingBall {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bouncing Ball");
        BallPanel panel = new BallPanel();

        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}