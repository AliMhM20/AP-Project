package food_order.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    public static Connection getConnection() throws SQLException {
        // DriverManager رشته‌ی URL، یوزرنیم و پسورد رو می‌فهمه و اتصال می‌سازه
        return DriverManager.getConnection(
                DatabaseConfig.getURL(),
                DatabaseConfig.getUser(),
                DatabaseConfig.getPass()
        );
    }
}

