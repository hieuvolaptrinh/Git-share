/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boderlayout;

import java.awt.BorderLayout;
import java.awt.LayoutManager;
import javax.swing.*;

/**
 *
 * @author hieuvo
 */
public class BoderLayout {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Panel");
        JButton btn1 = new JButton("NORTH");
        JButton btn2 = new JButton("WEST");
        JButton btn3 = new JButton("NORTH");
        JButton btn4 = new JButton("EAST");
        JButton btn5 = new JButton("SOUTH");

        frame.setLayout(new BorderLayout(5,10));

        frame.add(btn1, BorderLayout.NORTH);
        frame.add(btn2, BorderLayout.WEST);
        frame.add(btn3, BorderLayout.CENTER);
        frame.add(btn4, BorderLayout.EAST);
        frame.add(btn5, BorderLayout.SOUTH);

//        BorderLayout() để tạo border không có khoảng cách của các phần
//BorderLayout(hgap,vgap) tạo border không có khoảng cách giữa các phần, 
//hgap : khoảng cách chiều ngang , vgap: khoảng cách chiều rộng
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
