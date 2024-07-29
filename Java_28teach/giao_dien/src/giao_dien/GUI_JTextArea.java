/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giao_dien.src.giao_dien;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author hieuvo
 */
public class GUI_JTextArea {
    public static void main(String[] args) {
        JFrame frame = new JFrame("");
        JTextArea jta1 = new JTextArea( );
        jta1.setBounds(50, 50, 200, 100);

        jta1.setLineWrap(true); // để dài hết dòng nó tự xuống dòng
        jta1.setWrapStyleWord(true ); // gói từ lại với nhau

        JButton btn= new JButton( "cuont" );
        btn.setBounds(20,180,80,30);
        btn.addActionListener(new ActionListener( ) {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(jta1.getText());
            }
        });

        frame.add(btn);
        frame.add(jta1);






        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
