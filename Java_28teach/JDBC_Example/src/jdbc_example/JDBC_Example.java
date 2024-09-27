/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbc_example;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

/**
 *
 * @author hieuvo
 */
public class JDBC_Example {

    private static String url = "jdbc:mysql://localhost:3306/northwind?autoReconnect=true&useSSL=false";
    private static String username = "root";
    private static String password = "vndhieu123";

//    tạo kết nối với cơ sở dữ liệu
    public static Connection getConnections() throws ClassNotFoundException, SQLException {
//        nạp driver
//        Class.forName("com.mysql.jdbc.Driver");
        Class.forName("com.mysql.cj.jdbc.Driver");
        return (Connection) DriverManager.getConnection(url, username, password);
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc = new Scanner(System.in);
        Connection con = getConnections();
        con.setAutoCommit(false);
        if (con != null) {

            System.out.println("Kết nối thành công");

//            truy vấn, update dữ liệu
//            Statement stmt = con.createStatement();
//            PreparedStatement stmt = con.prepareStatement("SELECT * FROM Customers WHERE CustomerID>=? AND Country =?");
//            stmt.setInt(1, 20);
//            stmt.setString(2, "USA");
//            ResultSet rs = stmt.executeQuery();
//            while (rs.next()) {
//                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString("city") + rs.getString("PostalCode") + rs.getString(7));
//            }
            try {
                PreparedStatement stmt2 = con.prepareStatement("INSERT INTO Customers VALUES ('?,?,?,?,?,?,?');");
                int n = Integer.parseInt(sc.nextLine());
                for (int i = 0; i < n; i++) {
                    int id = Integer.parseInt(sc.nextLine());
                    String name = sc.nextLine();
                    String contactName = sc.nextLine();
                    String address = sc.nextLine();
                    String city = sc.nextLine();
                    String code = sc.nextLine();
                    String country = sc.nextLine();
                    stmt2.setInt(1, id);
                    stmt2.setString(2, name);
                    stmt2.setString(3, contactName);
                    stmt2.setString(4, address);
                    stmt2.setString(5, city);
                    stmt2.setString(6, code);
                    stmt2.setString(7, country);
                    stmt2.executeUpdate();
                }
                con.commit();
            } catch (Exception e) {
                System.out.println(e);
                con.rollback();
            }

//        ResultSet rs=stmt.executeQuery("SELECT * From Customers WHERE CustomerID>40;");
//            while (rs.next()) {                
//                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString("city"));
//            }
//execute update
//     int row= stmt.executeUpdate("INSERT INTO Customers Values(200,'võ nguyễn đại hiếu','nam','GIALAI','pleyku',2005,'vietnam');");
//            int row2 = stmt.executeUpdate("DELETE From Customers WHERE CustomerID=200;");
//            System.out.println(row2);
        } else {
            System.out.println("Kết nối thất bại");
        }

    }
}
