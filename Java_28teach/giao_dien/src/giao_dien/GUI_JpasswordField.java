package giao_dien.src.giao_dien;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_JpasswordField {
    public static void main(String[] args) {
        JFrame frame = new JFrame("");
        JPasswordField pw = new JPasswordField( );
        pw.setBounds(50, 50, 100, 50);
        JButton btn= new JButton( "click" );
        btn.setBounds(50, 100, 100, 50);
        btn.addActionListener(new ActionListener( ) {
            @Override
            public void actionPerformed(ActionEvent e) {
//                xử lý sự kiện lấy mk
                System.out.println(pw.getPassword() ); // trả về mảng char
                String s= String.valueOf(pw.getPassword()); // trả về chuỗi string
            }
        });

        frame.add(pw);
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
