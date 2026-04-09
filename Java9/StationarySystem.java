import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StationarySystem extends JFrame implements ActionListener {

    JCheckBox notebook, pen, pencil;
    JButton orderBtn;

    StationarySystem() {
        setTitle("Stationary Purchase System");
        setSize(300, 250);
        setLayout(new FlowLayout());

        notebook = new JCheckBox("Notebook @ 50");
        pen = new JCheckBox("Pen @ 30");
        pencil = new JCheckBox("Pencil @ 10");

        orderBtn = new JButton("Order");

        add(notebook);
        add(pen);
        add(pencil);
        add(orderBtn);

        orderBtn.addActionListener(this);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        int total = 0;
        String message = "";

        if(notebook.isSelected()) {
            String qty = JOptionPane.showInputDialog("Enter Quantity for Notebook");
            int q = Integer.parseInt(qty);
            total += q * 50;
            message += "Notebook Quantity: " + q + "\n";
        }

        if(pen.isSelected()) {
            String qty = JOptionPane.showInputDialog("Enter Quantity for Pen");
            int q = Integer.parseInt(qty);
            total += q * 30;
            message += "Pen Quantity: " + q + "\n";
        }

        if(pencil.isSelected()) {
            String qty = JOptionPane.showInputDialog("Enter Quantity for Pencil");
            int q = Integer.parseInt(qty);
            total += q * 10;
            message += "Pencil Quantity: " + q + "\n";
        }

        message += "\nTotal: " + total;

        JOptionPane.showMessageDialog(this, message);
        JOptionPane.showMessageDialog(this, "Successfully Ordered!");
    }

    public static void main(String[] args) {
        new StationarySystem();
    }
}