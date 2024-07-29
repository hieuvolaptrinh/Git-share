/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giao_dien;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author hieuvo
 */
public class Class_maytinh extends JFrame {

    private JLabel lblFirst, lblSecond, lblResult;
    private JTextField txtFirst, txtSecond, txtResult;
    private JButton btnClear, btnAdd, btnSub, btnMul, btnDiv;

    public Class_maytinh(String title) {
        this.setTitle(title);
        lblFirst = new JLabel("first number");
        lblSecond = new JLabel("second number");
        lblResult = new JLabel("Result");
        this.add(lblFirst);
        this.add(lblSecond);
        this.add(lblResult);
        lblFirst.setBounds(50, 50, 100, 30);
        lblSecond.setBounds(50, 100, 100, 30);
        lblResult.setBounds(50, 150,100, 30);
        this.setSize(500, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
//        this.setVisible(true);
    }

}
