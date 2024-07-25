package Project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
    
    public static void main(String[] args) {
        Connection con = ConnectionProvider.getCon();
        if (con != null) {
            System.out.println("Connection successful!");
            // Perform database operations here if needed
            // Don't forget to close the connection when done
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error closing connection: " + e.getMessage());
            }
        } else {
            System.out.println("Failed to establish connection!");
        }
    }

    public static Connection getCon(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
            return con;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
            return null;
        }
    }
}

