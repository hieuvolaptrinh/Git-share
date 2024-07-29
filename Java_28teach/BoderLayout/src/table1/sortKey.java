/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table1;

import java.awt.BorderLayout;
import java.util.List;
import java.util.*;
import java.util.Comparator;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author hieuvo
 */
public class sortKey {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Chess");
        Object[][] row = {
            {"SV01", "Nguyen Van Nam", "CNTT1", 3.2},
            {"SV02", "Vo Quoc Lam", "DTVT1", 3.1},
            {"SV03", "Nguyen Hung Lam", "CNTT2", 2.7},
            {"SV04", "Tran Van Thang", "CNTT2", 2.8},};
        Object[] col = {"ID", "Ho ten", "Lop", "GPA"};
        JTable table = new JTable(new DefaultTableModel(row, col));
        JScrollPane scrollPane = new JScrollPane(table);
        frame.setLayout(new BorderLayout());
        frame.add(scrollPane, BorderLayout.CENTER);
        JPanel pane = new JPanel();
        JButton btn = new JButton("Delete");
        pane.add(btn);
        btn.setBounds(50, 50, 100, 30);
        frame.add(pane, BorderLayout.SOUTH);
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        DefaultTableModel model = (DefaultTableModel) (table.getModel());
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(model);

//        cài đặt comparator để nó sắp xếp theo tên bắt đầu ở tên chứ k phải tên đệm
        sorter.setComparator(1, new Comparator<>() {
            @Override
            public int compare(Object o1, Object o2) {
                String[] arr1 = ((String) o1).split("\\s+");
                String[] arr2 = ((String) o2).split("\\s+");
                int vt1 = arr1.length;
                int vt2 = arr2.length;
                if (!arr1[vt1 - 1].equalsIgnoreCase(arr2[vt2 - 1])) {
                    return arr1[vt1 - 1].compareToIgnoreCase(arr2[vt2 - 1]);
                }

                return -1;
            }

        });

        table.setRowSorter(sorter);
        List<RowSorter.SortKey> sortKeys = new ArrayList<RowSorter.SortKey>();
        sortKeys.add(new RowSorter.SortKey(2, SortOrder.ASCENDING));
        sorter.setSortKeys(sortKeys);
    }

}
//        ArrayList<RowSorter.SortKey> sortKeys = new ArrayList<RowSorter.SortKey>();
