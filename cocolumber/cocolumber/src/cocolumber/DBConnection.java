package cocolumber;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection connect() {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/cocolumber_rms"; // your database name
            String user = "root"; // your MySQL username
            String pass = ""; // your MySQL password (leave empty if none)
            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("✅ Database Connected Successfully!");
        } catch (Exception e) {
            System.out.println("❌ Database Connection Failed: " + e.getMessage());
        }
        return conn;
    }
}

