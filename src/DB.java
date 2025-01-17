import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
    static Connection conn = null;

    public static Connection getConnect() {
        try {
            String url = "jdbc:mysql://localhost:3306/";
            String username = "root";
            String password = "Developer_01";
            String db = "soex";
            conn = DriverManager.getConnection(url + db, username, password);
        } catch (Exception e) {
            System.out.println("DB eroor");
            e.printStackTrace();
        }
        return conn;
    }
}
