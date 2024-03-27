package com.situ.foundation4.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCUtil {
    private static String driver;
    private static String url;
    private static String username;
    private static String password;

    //防止外部可以newJDBCUtil
    private JDBCUtil() {
    }

    //静态代码块，只执行一次
    static {

        try {
            //配置properties
            //1.通过当前的类获取加载器
            ClassLoader classLoader = JDBCUtil.class.getClassLoader();
            //2.通过类加载器的方法获取输入流
            InputStream inputStream = classLoader.getResourceAsStream("db.properties");
            //3.创建一个Properties对象
            Properties properties = new Properties();
            properties.load(inputStream);
            driver = properties.getProperty("driver");
            url = properties.getProperty("url");
            username = properties.getProperty("username");
            password = properties.getProperty("password");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //加载驱动
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

    public static void close(Connection connection, Statement statement,
                             ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
