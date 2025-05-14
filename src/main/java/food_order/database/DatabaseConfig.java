package food_order.database;

public class DatabaseConfig {
    private static final String URL =
            "jdbc:mysql://localhost:3306/food_order_db"
                    + "?useSSL=false"
                    + "&createDatabaseIfNotExist=true"
                    + "&serverTimezone=Europe/Berlin"
                    + "&useUnicode=true"
                    + "&characterEncoding=UTF-8";

    private static final String USER = "root";
    private static final String PASS = "ali1080766898";

    public static String getURL() { return URL; }
    public static String getUser() { return USER; }
    public static String getPass() { return PASS; }
}
