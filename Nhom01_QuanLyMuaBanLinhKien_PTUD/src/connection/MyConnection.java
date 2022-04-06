package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
    private static MyConnection instance;
    private Connection connection;

    private MyConnection() {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=QuanLyCuaHangLinhKien";
        try {
            connection = DriverManager.getConnection(url , "sa", "1234");
            System.out.println("OK");
        } catch (SQLException e) {
        	System.out.println("Lỗi");
            e.printStackTrace();
        }
    }

    public synchronized static MyConnection getInstance() {
        if(instance == null)
            instance = new MyConnection();
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}