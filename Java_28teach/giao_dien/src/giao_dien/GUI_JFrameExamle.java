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

/**
 *
 * @author hieuvo
 */
public class GUI_JFrameExamle {

    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame Example");  //hiển thị tên cửa sở

//        cài đặt kích thước
        frame.setSize(500, 500);
//ấn dấu tick là tắt chươngtrinhf
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    GUi hiển thị lên sẽ ở giữa màn hình ko phải ở góc màn hình nữa
        frame.setLocationRelativeTo(null);
//    để hiển thị giao diện
        frame.setVisible(true);

//        tạo nút
        JButton btn = new JButton("UserName");
        JButton btn2 = new JButton("PassWord");
//xét vị trí nút
        btn.setBounds(50, 20, 80, 30); // x y w h
        frame.add(btn); // thêm nút vào frame
        frame.add(btn2);
        frame.setLayout(null); // để layout nó không tràng viền, cái nút nó k có bao hết layout á
        btn2.setBounds(50, 80, 80, 30);

//    thêm sự kiện cho nút button
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("bạn đã ấn vào username");

//                thay đổi text trong btn
                btn.setText("click");
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("bạn đã ấn vào passwword");
            }
        });

//        
//
//
//
//
//
//.............. TẠO MỘT CÁI LABEL ( NHÃN )............
        JLabel lbl = new JLabel("Username : ");
        JLabel lbl2 = new JLabel("passWord");
        lbl.setBounds(200,20, 100, 50);
        lbl2.setBounds(200,80, 100, 50);
        frame.add(lbl);
        frame.add(lbl2);
    }
    
}
