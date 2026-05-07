import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Factorialapp extends Applet implements ActionListener {

    TextField input, output;
    Button btn;

    public void init() {
        add(new Label("Enter Number:"));
        input = new TextField(10);
        add(input);

        btn = new Button("Find Factorial");
        add(btn);

        add(new Label("Result:"));
        output = new TextField(10);
        add(output);

        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        int n = Integer.parseInt(input.getText());
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        output.setText(String.valueOf(fact));
    }
}