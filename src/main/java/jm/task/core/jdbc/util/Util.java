package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/project_db";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "Forpost3034!";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {

        Connection connection = null;

            Class.forName(DB_DRIVER);
            connection = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);

        return connection;
    }
}
