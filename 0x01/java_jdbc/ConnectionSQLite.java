import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionSQLite {
    public static void main(String[] args) {
        Connection connection = initConnection();
    }

    public static Connection initConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:sqlite:sqlite_database_2022.db");
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }

        return connection;
    }
}