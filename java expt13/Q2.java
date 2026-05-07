public import java.sql.*;

public class Q2 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college", "root", "password");

            Statement stmt = con.createStatement();

            // INSERT
            stmt.executeUpdate("INSERT INTO student VALUES (101, 'Ali', 85)");

            // UPDATE
            stmt.executeUpdate("UPDATE student SET marks=90 WHERE id=101");

            // DELETE
            stmt.executeUpdate("DELETE FROM student WHERE id=101");

            // SELECT
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");
            while (rs.next()) {
                System.out.println(
                    rs.getInt(1) + " " +
                    rs.getString(2) + " " +
                    rs.getInt(3));
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
} Q2 {
    
}
