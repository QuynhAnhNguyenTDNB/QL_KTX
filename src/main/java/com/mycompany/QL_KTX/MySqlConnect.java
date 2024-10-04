package com.mycompany.QL_KTX;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlConnect {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/ktx"; // ktx = tên database của bạn
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    private static Connection connection = null;

    // Phương thức tạo kết nối
    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            } catch (SQLException e) {
                System.out.println("Failed to connect to the MySQL database.");
                e.printStackTrace();
            }
        }
        return connection;
    }

    // Phương thức thực hiện câu lệnh SQL SELECT và trả về ResultSet
    public static ResultSet executeSQL(String sql) {
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Lấy kết nối
            Connection connection = getConnection();

            if (connection != null) {
                statement = connection.createStatement();
                resultSet = statement.executeQuery(sql);  // Thực hiện câu lệnh SQL
                return resultSet;
            } else {
                System.out.println("Failed to connect to the MySQL database.");
            }
        } catch (SQLException e) {
            System.out.println("Error executing SQL: " + e.getMessage());
            e.printStackTrace();
        }
        return null;
    }

    // Phương thức thực hiện câu lệnh SQL INSERT, UPDATE, DELETE
    public static int executeUpdate(String sql) throws SQLException {
        Statement statement = null;
        int result = 0;

        try {
            // Lấy kết nối
            Connection connection = getConnection();

            if (connection != null) {
                statement = connection.createStatement();
                result = statement.executeUpdate(sql);  // Thực hiện câu lệnh SQL
            } else {
                System.out.println("Failed to connect to the MySQL database.");
            }
        } catch (SQLException e) {
            System.out.println("Error executing SQL: " + e.getMessage());
            e.printStackTrace();
            throw e;
        }
        return result;
    }

    // Phương thức thực hiện câu lệnh DELETE
    public static int executeDelete(String sql, Object... params) {
        PreparedStatement pstmt = null;
        int result = 0;

        try {
            // Lấy kết nối
            Connection connection = getConnection();

            if (connection != null) {
                pstmt = connection.prepareStatement(sql);
                // Set các tham số cho câu lệnh SQL, nếu có
                for (int i = 0; i < params.length; i++) {
                    pstmt.setObject(i + 1, params[i]);
                }
                result = pstmt.executeUpdate();  // Thực hiện câu lệnh SQL
            } else {
                System.out.println("Failed to connect to the MySQL database.");
            }
        } catch (SQLException e) {
            System.out.println("Error executing SQL: " + e.getMessage());
        }
        return result;
    }
    
    // Đóng kết nối, statement, resultSet sau khi sử dụng
    public static void closeResources(ResultSet rs, Statement stmt, Connection conn) {
        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null && !conn.isClosed()) conn.close();
            connection = null; // Đặt connection về null sau khi đóng
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
