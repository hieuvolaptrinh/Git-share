/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hieuvo
 */
public class Example {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("table");
        Object[][] row = {
            {"sv01", "nguyen van a", "23t1", 8.70},
            {"sv02", "nguyen van b", "24Ox", 1.123},
            {"sv03", "le van c", "21t5", 1.33},
            {"sv04", "tran  x", "22y6", 6.0},
            {"sv05", "nguyen van a", "23t1", 8.70},
            {"sv06", "nguyen van b", "24Ox", 1.123},
            {"sv07", "le van c", "21t5", 1.33}
        
        };
        Object[] col = {"ID", "ho va ten", "lop", "DIEM"};

//        JTable table = new JTable(row, col);
        JTable table = new JTable(new DefaultTableModel(row, col));
        DefaultTableModel model = (DefaultTableModel) (table.getModel());
        JScrollPane scrollPane = new JScrollPane(table);
//hoặc só thể sử dụng borderLayout  
        
//        nếu thêm trực tiếp như thế này là mình sẽ không thấy id ,ten,diem,... 
//        frame.add(table);

        System.out.println(table.getValueAt(3, 1));
        table.setValueAt("vox nguyeenx dai hieu", 1, 1);

//        for (int i = 0; i < data.size(); i++) {
////       data[i]:1 dong
//            for (int j = 0; j < data.get[i].size(); j++) {
//                System.out.println(data.get[i].get[j] + " ");
//            }
//        }
//        for (int i = 0; i < table.getRowCount(); i++) {
////        duyệt qua các hàng và cột trong table
//            for (int j = 0; j < table.getColumnCount(); j++) {
//                System.out.println(table.getValueAt(i, j) + " ");
//            }
//        }
//        sắp xêp bảng theo thứ tự...
        table.setAutoCreateRowSorter(true);
        
//        frame.add(scrollPane);
        
        
        
        frame.setLayout( new BorderLayout());
        JPanel pn1 = new JPanel();
        JButton btnDelete = new JButton("Delete");
        btnDelete.setBounds(100,500,100,30);
        pn1.add(btnDelete);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(pn1, BorderLayout.SOUTH);
        
        btnDelete.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int delRow= table.getSelectedRow();
                if(delRow!=-1)
                    model.removeRow(delRow);
            }
        
        
        });
        
        
        
        frame.setSize(800, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        model.addRow(new Object[]{"sv08", "nguyen van long", "22t2", 4.0});// thêm thông qua object
        Vector<Object> newRow = new Vector<>();
        newRow.add("SV10");
        newRow.add("nguyen nhat nam");
        newRow.add("24t6");
        newRow.add(2.9);
        model.addRow(newRow);

//        trả về chỉ số dòng đầu tien được chọn
//        model.removeRow(table.getSelectedRow());
          model.removeRow(3);
          
          
//          sắp xếp theo sort.Key
    }
}
