import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    private String userName = "root";
    private String password = "2116923";
    private String dbUrl = "jdbc:mysql://localhost:3306/world";

    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(dbUrl, userName, password);
    }

    public void sohwErrorMessage (SQLException exception){
        System.out.println("Erorr >" + exception.getMessage());
        System.out.println("Error Code: " + exception.getErrorCode());
    }
}
