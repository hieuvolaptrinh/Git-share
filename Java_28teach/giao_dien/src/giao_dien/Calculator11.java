/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giao_dien;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Font.ITALIC;

/**
 * @author hieuvo
 */
public class Calculator11 {

    public static void main(String[] args) {


        JFrame frame = new JFrame("casio");

        frame.setSize(900, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Sử dụng layout null để đặt vị trí tuyệt đối
        frame.setLocationRelativeTo(null); // Hiển thị giao diện ở giữa màn hình

        JLabel lbl1 = new JLabel("First number");
        JLabel lbl2 = new JLabel("Second number");
        JLabel lbl3 = new JLabel("Result");

        lbl1.setBounds(50, 50, 120, 30);
        lbl2.setBounds(50, 100, 120, 30);
        lbl3.setBounds(50, 150, 120, 30);

        JTextField jtf1 = new JTextField("");
        JTextField jtf2 = new JTextField("");
        JTextField jtf3 = new JTextField("");

        jtf1.setBounds(200, 50, 120, 30);
        jtf2.setBounds(200, 100, 120, 30);
        jtf3.setBounds(200, 150, 120, 30);

        JButton btnClear = new JButton("Clear");
        btnClear.setBackground(Color.magenta);

        JButton btnAdd = new JButton("Add");
        JButton btnSub = new JButton("Sub");
        JButton btnMul = new JButton("Mul");
        JButton btnDiv = new JButton("Div");

        btnClear.setBounds(50, 200, 80, 30);
        btnAdd.setBounds(50, 250, 80, 30);
        btnSub.setBounds(150, 250, 80, 30);
        btnMul.setBounds(250, 250, 80, 30);
        btnDiv.setBounds(350, 250, 80, 30);

//        thêm sự kiện
        btnClear.addActionListener(new ActionListener( ) {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtf1.setText("");
                jtf2.setText("");
                jtf2.setText("");
            }
        });
        btnAdd.addActionListener(new ActionListener( ) {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(jtf1.getText( ));
                double num2 = Double.parseDouble(jtf2.getText( ));

                jtf3.setText(num2 + num1 + " ");// cộng vơi dấu cách đằng sau để chuyển thành số.
            }
        });
        btnDiv.addActionListener(new ActionListener( ) {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(jtf1.getText( ));
                double num2 = Double.parseDouble(jtf2.getText( ));

                jtf3.setText(num1 / num2 + " ");// cộng vơi dấu cách đằng sau để chuyển thành số.
            }
        });
        btnMul.addActionListener(new ActionListener( ) {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(jtf1.getText( ));
                double num2 = Double.parseDouble(jtf2.getText( ));

                jtf3.setText(num1*num2 + " ");// cộng vơi dấu cách đằng sau để chuyển thành số.
            }
        });
        btnSub.addActionListener(new ActionListener( ) {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(jtf1.getText( ));
                double num2 = Double.parseDouble(jtf2.getText( ));

                jtf3.setText(num1 -num2 + " ");// cộng vơi dấu cách đằng sau để chuyển thành số.
            }
        });

        frame.add(lbl1);
        frame.add(lbl2);
        frame.add(lbl3);
        frame.add(jtf1);
        frame.add(jtf2);
        frame.add(jtf3);
        frame.add(btnAdd);
        frame.add(btnClear);
        frame.add(btnDiv);
        frame.add(btnMul);
        frame.add(btnSub);

        frame.setVisible(true);
    }
}
