package helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
    private static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost:3306/";
    private static String DB_NAME = "db_pekerjaan_rumah";
    private static String TIMEZONE = "?serverTimezone=Asia/Makasar";
    private static String USER = "root";
    private static String PASS = "";

    public Connection getConnection(){
        Connection con = null;

        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("Sedang Menghubungkan...");
            con = DriverManager.getConnection(URL+DB_NAME+TIMEZONE,USER,PASS);
            System.out.println("Berhasil");
            return con;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        MyConnection myConnection = new MyConnection();
        myConnection.getConnection();
    }
}
