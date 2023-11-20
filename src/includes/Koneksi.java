package includes;
import java.sql.*;
import java.util.ArrayList;

public class Koneksi {
    private final String DB_NAME = "java";
    private final String HOST = "root";
    private final String PASSWORD = "";
    private final String DRIVER = "com.mysql.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost:3306/" + DB_NAME;

    private Connection conn;
    private Statement stmt;
    private ResultSet rs;

    public Koneksi(String query, String column){
        try {
            conn = DriverManager.getConnection(URL, HOST, PASSWORD);
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);

            while (rs.next()) {
                System.out.println(rs.getString(column));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Koneksi(){

    }

    public User queryUser(String query, User user){
        try {
            int[] id = {};
            int i = 0;
            conn = DriverManager.getConnection(URL, HOST, PASSWORD);
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                user.setMoney(rs.getInt("money"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    public Connection getConnection(){
        return conn;
    }

}
