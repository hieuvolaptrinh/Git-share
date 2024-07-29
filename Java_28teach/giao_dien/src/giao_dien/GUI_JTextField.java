/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giao_dien;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author hieuvo
 */
public class GUI_JTextField {

    public static void main(String[] args) {
        JFrame frame = new JFrame("text field");
        frame.setSize(500, 500);
//        để hiển thị giao diện
        frame.setVisible(true);
        //ấn dấu tick là tắt chươngtrinhf
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //    GUi hiển thị lên sẽ ở giữa màn hình ko phải ở góc màn hình nữa
        frame.setLocationRelativeTo(null);
        frame.setLayout(null); // để layout nó không tràng viền, cái nút nó k có bao hết layout á

        
        
        
        
        JLabel lbl = new JLabel("Username : ");
        JLabel lbl2 = new JLabel("passWord");
        
        
        
        lbl.setBounds(50, 20, 100, 30);
        lbl2.setBounds(50, 80, 100, 30);
        frame.add(lbl);
        frame.add(lbl2);

        
        
        
        
//        JText Field
        JTextField userName= new JTextField ("nhập userName");
        JTextField passWord= new JTextField ();
        userName.setBounds(200, 20, 100, 30);
        passWord.setBounds(200, 80, 100, 30);
        frame.add(userName);
        frame.add(passWord);
        
        
        JButton login= new JButton("Login");
        login.setBounds(150, 150, 100, 30);
        frame.add(login);
        
//        xử lí sự kiện nut login
login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(userName.getText());
                System.out.println(passWord.getText());                    
            }
        });
    }
}
