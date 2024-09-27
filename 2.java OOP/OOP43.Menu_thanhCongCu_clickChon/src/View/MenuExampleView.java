package view;

import Controller.MenuExampleController;
import controller.MenuExampleMouseListener;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

public class MenuExampleView extends JFrame {

    public JPopupMenu jPopupMenu;
    private JLabel jLabel;
    private final JToolBar jToolBar;

    public MenuExampleView() {
        this.setTitle("Menu Example");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        // Tạo controller
        MenuExampleController menuExampleController = new MenuExampleController(this);

        // Tạo thanh menu
        JMenuBar jMenuBar = new JMenuBar();

        // Tạo 1 menu
        JMenu jMenu_file = new JMenu("File");
        jMenu_file.setMnemonic(KeyEvent.VK_F);
        jMenu_file.setDisplayedMnemonicIndex(0);

        // Tạo các menu con
        JMenuItem jMenuItem_new = new JMenuItem("New", KeyEvent.VK_N);
        jMenuItem_new.addActionListener(menuExampleController);
        jMenuItem_new.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));

        JMenuItem jMenuItem_open = new JMenuItem("Open", KeyEvent.VK_O);
        jMenuItem_open.addActionListener(menuExampleController);
        jMenuItem_open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));

        JMenuItem jMenuItem_exit = new JMenuItem("Exit", KeyEvent.VK_X);
        jMenuItem_exit.addActionListener(menuExampleController);
        jMenuItem_exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_DOWN_MASK));

        jMenu_file.add(jMenuItem_new);
        jMenu_file.add(jMenuItem_open);
        jMenu_file.addSeparator();
        jMenu_file.add(jMenuItem_exit);

//        Menu View tick chọn
        JMenu jMenu_View = new JMenu("View");
        JCheckBoxMenuItem jCheckBoxMenuItem_toolbar = new JCheckBoxMenuItem("ToolBar");
        jMenu_View.add(jCheckBoxMenuItem_toolbar);
       jCheckBoxMenuItem_toolbar.addActionListener(menuExampleController);

// Menu help
        JMenu jMenu_help = new JMenu("Help");
        jMenu_help.setMnemonic(KeyEvent.VK_L);
        jMenu_help.setDisplayedMnemonicIndex(0);

        JMenuItem jMenuItem_welcome = new JMenuItem("Welcome");
        jMenuItem_welcome.addActionListener(menuExampleController);
        jMenu_help.add(jMenuItem_welcome);

//        add jMenu
        jMenuBar.add(jMenu_file);
        jMenuBar.add(jMenu_help);
        jMenuBar.add(jMenu_View);

        // Thêm thanh thanh menu vào chương trình
        this.setJMenuBar(jMenuBar);
//                tạo ToolBar ( thanh công cụ)
        jToolBar = new JToolBar();
        JButton jButton_Undo = new JButton("Undo");
        jButton_Undo.addActionListener(menuExampleController);
        jButton_Undo.setToolTipText("nhấn vào đây để quay lại thao tác  vừa rồi"); //

        JButton jButton_Redo = new JButton("Redo");
        jButton_Redo.addActionListener(menuExampleController);

        JButton jButton_Copy = new JButton("Copy");
        jButton_Copy.addActionListener(menuExampleController);

        JButton jButton_Cut = new JButton("Cut");
        jButton_Cut.addActionListener(menuExampleController);

        JButton jButton_Past = new JButton("Past");
        jButton_Past.addActionListener(menuExampleController);

        jToolBar.add(jButton_Undo);
        jToolBar.add(jButton_Redo);
        jToolBar.add(jButton_Copy);
        jToolBar.add(jButton_Cut);
        jToolBar.add(jButton_Past);

        

//        Menu chuột phải JPopupMenu
        jPopupMenu = new JPopupMenu();

        JMenu jMenuPopupFont = new JMenu("font ");
        jMenuPopupFont.addSeparator();
        JMenuItem jMenuItemType = new JMenuItem("Type");
        JMenuItem jMenuItemSize = new JMenuItem("SIze");

        jMenuPopupFont.add(jMenuItemSize);
        jMenuPopupFont.add(jMenuItemType);

        JMenuItem jMenuItemCut = new JMenuItem("Cut");
        JMenuItem jMenuItemCopy = new JMenuItem("Copy");
        JMenuItem jMenuItemPast = new JMenuItem("Past");

        jPopupMenu.add(jMenuPopupFont);
        jPopupMenu.add(jMenuItemCut);
        jPopupMenu.add(jMenuItemCopy);
        jPopupMenu.add(jMenuItemPast);

        this.add(jPopupMenu);
        //thêm sự kiện chuột phải để hiển thị menu
        MenuExampleMouseListener menuExampleMouseListener = new MenuExampleMouseListener(this);
        this.addMouseListener(menuExampleMouseListener);
        // Tạo label hiển thị
        Font font = new Font("Arial", Font.BOLD, 50);
        jLabel = new JLabel();

        this.add(jLabel, BorderLayout.CENTER);

        this.setVisible(true);
    }

    public void setTextJLabel(String s) {
        this.jLabel.setText(s);
    }

    public void enableToolbar() {
        this.add(jToolBar, BorderLayout.NORTH);
        this.refresh();
    }
    public void disableToolbar(){
        this.remove(jToolBar);
          this.refresh();
    }
    public void refresh(){
        
        this.pack();
        this.setSize(500,500);
    }
}
