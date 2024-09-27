/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.MenuExampleController;
import com.sun.java.accessibility.util.AWTEventMonitor;
import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

/**
 *
 * @author hieuvo
 */
public class MenuExampleView extends JFrame {

    private JTextArea textArea;

    public MenuExampleView() throws HeadlessException {
        this.setTitle("Draw Example");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

//        tạo controller    
        MenuExampleController control = new MenuExampleController(this);

        JMenuBar jMenuBar = new JMenuBar();

        JMenu jMenu_file = new JMenu("file");
//        tạo item trong menu
        JMenuItem jMenuItem_new = new JMenuItem("New");
        jMenuItem_new.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_DOWN_MASK));//tạo phím tắt
        JMenuItem jMenuItem_open = new JMenuItem("Open", KeyEvent.VK_O);
        JMenuItem jMenuItem_exit = new JMenuItem("Exit", KeyEvent.VK_X);
//        thêm vào trong menu file
        jMenu_file.add(jMenuItem_exit);
        jMenu_file.add(jMenuItem_new);
        jMenu_file.addSeparator(); // tạo đường gạch ngang ngăn cách 2 menu
        jMenu_file.add(jMenuItem_open);

        JMenu jMenu_help = new JMenu("help");
        JMenuItem jMenuItem_welcom = new JCheckBoxMenuItem("welcom");
        jMenu_help.add(jMenuItem_welcom);

//        add 2 cái menu vào trong thanh menubar
        jMenuBar.add(jMenu_file);
        jMenuBar.add(jMenu_help);

//add menubar vào trong JFrame\
        textArea = new JTextArea("abc");
        // Bật chế độ xuống dòng khi văn bản vượt quá chiều rộng của JTextArea
        textArea.setLineWrap(true);
        // Đảm bảo xuống dòng ở ranh giới từ
        textArea.setWrapStyleWord(true);

        // Đặt JTextArea vào JScrollPane
        JScrollPane scrollPane = new JScrollPane(textArea,
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

//        nhé sự kiện vào từng cái menuItem
        jMenuItem_exit.addActionListener(control);
        jMenuItem_open.addActionListener(control);
        jMenuItem_welcom.addActionListener(control);
        jMenuItem_new.addActionListener(control);

        this.setLayout(new BorderLayout());
        this.add(jMenuBar, BorderLayout.NORTH);

        this.add(scrollPane, BorderLayout.CENTER);

        this.setVisible(true);
    }

    public void setTextJLabel(String s) {
        this.textArea.setText(s);
    }
}
