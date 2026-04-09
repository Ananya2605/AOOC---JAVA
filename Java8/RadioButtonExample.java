import java.awt.*;
import javax.swing.*;

public class RadioButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Gender Selection");
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        JRadioButton other = new JRadioButton("Other");

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);
        group.add(other);

        JButton submit = new JButton("Submit");
        JLabel result = new JLabel("");

        submit.addActionListener(e -> {
            if (male.isSelected()) result.setText("Selected: Male");
            else if (female.isSelected()) result.setText("Selected: Female");
            else if (other.isSelected()) result.setText("Selected: Other");
            else result.setText("No selection");
        });

        frame.add(new JLabel("Select Gender:"));
        frame.add(male);
        frame.add(female);
        frame.add(other);
        frame.add(submit);
        frame.add(result);

        frame.setVisible(true);
    }
}