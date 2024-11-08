import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLConnectionExample{
    public static void main(String[] args) {
        // Database URL, username, and password
        String url = "jdbc:mysql://localhost:3306/customers?useSSL=false&serverTimezone=UTC";
        String username = "root";   // Replace with your MySQL username
        String password = "root";   // Replace with your MySQL password
        //load the driver
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);

            // Execute a query
            String query = "SELECT customers_id, firstname,lastname,phone,address, email FROM customers";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            // Process the result set
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("customers_id"));
                System.out.println("Name: " + resultSet.getString("firstname"));
                System.out.println("LastName: " + resultSet.getString("lastname"));
                System.out.println("Email: " + resultSet.getString("email"));
                System.out.println("phone: " + resultSet.getString("Phone"));
                System.out.println("address: " + resultSet.getString("address"));
                System.out.println("--------------");
            }

            // Close resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
 }
}
}