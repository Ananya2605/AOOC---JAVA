import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Q3 extends JFrame {
    JTextField userField;
    JPasswordField passField;
    JButton loginBtn;

    public Q3() {
        setTitle("Login Form");

        userField = new JTextField(15);
        passField = new JPasswordField(15);
        loginBtn = new JButton("Login");

        setLayout(new GridLayout(3, 2));
        add(new JLabel("Username:"));
        add(userField);
        add(new JLabel("Password:"));
        add(passField);
        add(loginBtn);

        loginBtn.addActionListener(e -> checkLogin());

        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    void checkLogin() {
        String user = userField.getText();
        String pass = new String(passField.getPassword());

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college", "root", "password");

            PreparedStatement ps = con.prepareStatement(
                "SELECT * FROM users WHERE username=? AND password=?");

            ps.setString(1, user);
            ps.setString(2, pass);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Login Successful");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid User");
            }

            con.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}