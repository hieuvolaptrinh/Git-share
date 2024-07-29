package addRow_Table;

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
public class mainTable {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("table student");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        Object[][] row = {
            {"sv01", "nguyen van a", "23t1", 8.70},
            {"sv02", "nguyen van b", "24Ox", 1.123},
            {"sv03", "le van c", "21t5", 1.33},
            {"sv04", "tran  x", "22y6", 6.0},
            {"sv05", "nguyen van a", "23t1", 8.70},
            {"sv06", "nguyen van b", "24Ox", 1.123},
            {"sv07", "le van c", "21t5", 1.33}
        
        };
        Object[] col = {"MSV", "Name", "Class", "GPA"};
        JTable table = new JTable(new DefaultTableModel(row, col));
        DefaultTableModel model = (DefaultTableModel) (table.getModel());
        JScrollPane scrollPane = new JScrollPane(table);
        
        table.setAutoCreateRowSorter(true);
        frame.setLayout(new BorderLayout());
        JPanel pn1 = new JPanel();
        JButton btnDelete = new JButton("Delete");
        JButton btnAdd = new JButton("add row");
        
        btnDelete.setBounds(200, 500, 100, 30);
        btnAdd.setBounds(300, 500, 100, 30);
        pn1.add(btnDelete);
        pn1.add(btnAdd);
        
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(pn1, BorderLayout.SOUTH);
        
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int delRow = table.getSelectedRow();
                if (delRow != -1) {
                    model.removeRow(delRow);
                }
            }
            
        });
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addStudent add = new addStudent();
                add.setVisible(true);
                
            }
        });
        
    }
}
