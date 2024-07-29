/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package chuanhoaten;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author hieuvo
 */
public class NameConverter extends JFrame {

    private JLabel lbl1, lbl2;
    private JTextField txt1, txt2;
    private JButton btn;

    public NameConverter(String title) {
        this.setTitle(title);
        lbl1 = new JLabel("Full name");
        lbl2 = new JLabel("Result");
        txt1 = new JTextField();
        txt2 = new JTextField();
        btn = new JButton("Convert");
        lbl1.setBounds(50, 50, 100, 30);
        lbl2.setBounds(50, 100, 100, 30);
        txt1.setBounds(200, 50, 100, 30);
        txt2.setBounds(200, 100, 100, 30);
        btn.setBounds(150, 230, 100, 30);
        this.add(lbl1);
        this.add(lbl2);
        this.add(txt1);
        this.add(txt2);
        this.add(btn);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res = "";
                String[] arr = txt1.getText().toUpperCase().split("\\s+");
                for (String x : arr) {
                    res+=x.charAt(0);
                    for (int i = 1; i < x.length(); i++) {
                         res +=Character.toLowerCase(x.charAt(i));
                    }
                   
                    res += " ";
                }
                res = res.trim();
                txt2.setText(res);
            }
        });
        this.setSize(500, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
    }

}
