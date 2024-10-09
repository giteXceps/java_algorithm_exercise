import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        deleteDemo();
    }

    //how to delete
    public static void deleteDemo() throws Exception {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null;
        try {
            connection = dbHelper.getConnection();
            String sql = "delete from city where ID = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, 4082);
            int result = statement.executeUpdate();
            System.out.println("Updated " + result);
        } catch (SQLException exception) {
            dbHelper.sohwErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }

    // how to update data
    public static void updateDemo() throws Exception {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null;
        try {
            connection = dbHelper.getConnection();
            String sql = "update city set population = 100000, district = 'Turkiye' where ID = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, 4082);
            int result = statement.executeUpdate();
            System.out.println("deleted " + result);
        } catch (SQLException exception) {
            dbHelper.sohwErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }

    // how to do insert
    public static void insertDemo() throws Exception {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null;
        try {
            connection = dbHelper.getConnection();
            String sql = "insert into city (Name, CountryCode, District, Population) values(?, ?, ?, ?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1, "Suvas");
            statement.setString(2, "TUR");
            statement.setString(3, "Turkey");
            statement.setInt(4, 70000);
            int result = statement.executeUpdate();
            System.out.println("Added " + result);
        } catch (SQLException exception) {
            dbHelper.sohwErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }

    // how to do selection
    public static void selectionDemo() throws Exception {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        java.sql.Statement statement = null;
        ResultSet resultSet;
        ArrayList<Country> countries = new ArrayList<>();
        try {
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select Code, Name, Continent, Region from country");
            while (resultSet.next()) {
                countries.add(new Country(resultSet.getString("Code"), resultSet.getString("Name"),
                        resultSet.getString("Continent"), resultSet.getString("Region")));
            }
            System.out.println(countries.size());
        } catch (SQLException exception) {
            dbHelper.sohwErrorMessage(exception);
        } finally {
            connection.close();
        }
    }
}
