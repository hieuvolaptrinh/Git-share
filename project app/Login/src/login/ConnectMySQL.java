package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectMySQL {

    private static String url = "jdbc:mysql://localhost:3306/loginform?autoReconnect=true&useSSL=false";
    private static String username = "root";
    private static String password = "vndhieu123";

    // Tạo kết nối với cơ sở dữ liệu
    public static Connection getConnections() throws ClassNotFoundException, SQLException {
        // Nạp driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, username, password);
    }

    public static void main(String[] args) {
        try (Connection con = getConnections()) {
            if (con != null) {
                con.setAutoCommit(false);
                System.out.println("Kết nối thành công");
            } else {
                System.out.println("Kết nối thất bại");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Lỗi: Không tìm thấy lớp driver.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Lỗi: Không thể kết nối tới cơ sở dữ liệu.");
            e.printStackTrace();
        }
    }
}
