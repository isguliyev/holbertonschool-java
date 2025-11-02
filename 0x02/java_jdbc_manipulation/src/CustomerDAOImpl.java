import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomerDAOImpl implements CustomerDAO {
    @Override
    public Connection connect(String connectionUrl) {
        if (connectionUrl == null) {
            System.out.println("connectionUrl is null");
            return null;
        }

        try (Connection connection = DriverManager.getConnection(connectionUrl);) {
            return connection;
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }

        return null;
    }

    @Override
    public void createTable(String connectionUrl) {
        if (connectionUrl == null) {
            System.out.println("connectionUrl is null");
            return;
        }

        try (Connection connection = DriverManager.getConnection(connectionUrl); Statement statement = connection.createStatement();) {
            statement.executeUpdate(
                """
                CREATE TABLE IF NOT EXISTS Customer (
                    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
                    name TEXT,
                    age SMALLINT,
                    cpf TEXT,
                    rg TEXT
                );
                """
            );
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
    }

    @Override
    public void insert(String connectionUrl, Customer customer) {
        if (connectionUrl == null) {
            System.out.println("connectionUrl is null");
            return;
        }

        if (customer == null) {
            System.out.println("customer is null");
            return;
        }

        String sql = "INSERT INTO Customer (name, age, cpf, rg) VALUES (?, ?, ?, ?);";

        try (Connection connection = DriverManager.getConnection(connectionUrl); PreparedStatement preparedStatement = connection.prepareStatement(sql);) {
            preparedStatement.setString(1, customer.getName());
            preparedStatement.setInt(2, customer.getAge());
            preparedStatement.setString(3, customer.getCpf());
            preparedStatement.setString(4, customer.getRg());
            preparedStatement.executeUpdate();
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
    }

    @Override
    public void selectAll(String connectionUrl) {
        if (connectionUrl == null) {
            System.out.println("connectionUrl is null");
            return;
        }

        String sql = "SELECT * FROM Customer;";

        try (Connection connection = DriverManager.getConnection(connectionUrl); Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(sql);) {
            System.out.println("id,name,age,cpf,rg");
            while (resultSet.next()) {
                System.out.printf("%d,%s,%d,%s,%s\n",
                    resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getInt("age"),
                    resultSet.getString("cpf"),
                    resultSet.getString("rg"));
            }
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
    }

    @Override
    public void update(String connectionUrl, int id, String name, int age) {
        if (connectionUrl == null) {
            System.out.println("connectionUrl is null");
            return;
        }

        if (name == null) {
            System.out.println("name is null");
            return;
        }

        String sql = "UPDATE Customer SET name=?, age=? WHERE id=?;";

        try (Connection connection = DriverManager.getConnection(connectionUrl); PreparedStatement preparedStatement = connection.prepareStatement(sql);) {
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            preparedStatement.setInt(3, id);
            preparedStatement.executeUpdate();
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
    }

    @Override
    public void delete(String connectionUrl, int id) {
        if (connectionUrl == null) {
            System.out.println("connectionUrl is null");
            return;
        }

        String sql = "DELETE FROM Customer WHERE id=?;";

        try (Connection connection = DriverManager.getConnection(connectionUrl); PreparedStatement preparedStatement = connection.prepareStatement(sql);) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
    }
}