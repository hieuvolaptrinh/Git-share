/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table1;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.*;

/**
 *
 * @author hieuvo
 */
public class Example2 {

    public static void main(String[] args) {

        JFrame frame = new JFrame("JTable Example");
        Object[][] data = {
            {"CNTT01", "Nguyen Van Tuan", 3.2},
            {"DTVT01", "Nguyen Thi Hanh", 2.8},
            {"DTVT02", "Nguyen Manh Tuong", 2.5},
            {"CNTT03", "Pham Thi Nhung", 2.9},
            {"CNTT04", "Huynh Van Phan", 2.1}
        };
        String[] col = {"ID", "Name", "Gpa"};
        JTable table = new JTable(data, col);
        table.setBounds(30, 30, 300, 300);
        frame.setLayout(new BorderLayout());
        frame.add(table.getTableHeader(), BorderLayout.NORTH);
        frame.add(table, BorderLayout.CENTER);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
