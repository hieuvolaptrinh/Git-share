package giao_dien.src.Panel;

import javax.swing.*;
import java.awt.*;

public class Example1 {
    public static void main(String[] args) {
        JFrame frame =new JFrame("Panel");
        JPanel pn1= new JPanel();
        JPanel pn2= new JPanel();
        JButton btn1= new JButton("Panel1");
        JButton btn2 = new JButton("Panel2");
        btn1.setBounds (50, 50, 100, 30);
        btn2.setBounds (50, 50, 100, 30);
        pn1.add(btn1);
        pn2.add(btn2);
        pn1.setBounds(50,50,200,200);
        pn2.setBounds(260,50,200,200);
        pn1.setBackground(Color.red);
        pn2.setBackground(Color.blue);
        frame.add(pn1);
        frame.add(pn2);

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Sử dụng layout null để đặt vị trí tuyệt đối
        frame.setLocationRelativeTo(null); // Hiển thị giao diện ở giữa màn hình
        frame.setVisible(true);
    }
}
