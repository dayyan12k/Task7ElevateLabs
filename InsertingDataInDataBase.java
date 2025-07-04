import java.sql.*;
public class InsertingDataInDataBase
{
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/dayyan";
        String username = "root";
        String password = "DAYYANsheikh@9529.";

        // Table creation SQL
        String createTable = "CREATE TABLE IF NOT EXISTS employees (" +
                "id INT PRIMARY KEY AUTO_INCREMENT," +
                "name VARCHAR(50)," +
                "Title VARCHAR(100)," +
                "salary INT);";

        // Insert queries
        String query1 = "INSERT INTO employees(name, Title, salary) VALUES('saif', 'mern stack developer', 7780);";
        String query2 = "INSERT INTO employees(name, Title, salary) VALUES('ayan', 'java developer', 8800);";

        try {
            // Step 1: Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Connect to database
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database.");

            // Step 3: Create the table if it doesn't exist
            PreparedStatement createStmt = conn.prepareStatement(createTable);
            createStmt.execute();
            createStmt.close();
            System.out.println(" Table 'employees' checked/created.");

            // Step 4: Insert records
            PreparedStatement stmt1 = conn.prepareStatement(query1);
            int rows1 = stmt1.executeUpdate();
            System.out.println(" Query 1: Rows inserted = " + rows1);
            stmt1.close();

            PreparedStatement stmt2 = conn.prepareStatement(query2);
            int rows2 = stmt2.executeUpdate();
            System.out.println(" Query 2: Rows inserted = " + rows2);
            stmt2.close();

            // Step 5: Close connection
            conn.close();
            System.out.println(" Connection closed.");

        } catch (ClassNotFoundException e) {
            System.out.println(" JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println(" Database error.");
            e.printStackTrace();
        }
    }
}
