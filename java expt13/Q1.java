import java.sql.*;

public class DisplayStudent {
    public static void main(String[] args) {
        try {
            // Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college", "root", "password");

            // Statement
            Statement stmt = con.createStatement();

            // Query
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            // Display data
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name") + " " +
                    rs.getInt("marks"));
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}