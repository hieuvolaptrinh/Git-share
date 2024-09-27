/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.CounterListener;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.CounterModel;

public class CounterView extends JFrame {
    
    private CounterModel counterModel;
    private JButton JButton_up;
    private JButton JButton_down;
    private JLabel jLable_value;
    private JButton reset;

    public CounterView() {
        this.counterModel = new CounterModel();
        this.init();
    }
    
    public void init() {
        this.setTitle("counter");
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        reset = new JButton("RESET");
        
        JButton_up = new JButton("up");
        JButton_down = new JButton("down");
        jLable_value = new JLabel(this.counterModel.getValue() + "", JLabel.CENTER);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.add(JButton_up, BorderLayout.WEST);
        jPanel.add(JButton_down, BorderLayout.EAST);
        jPanel.add(jLable_value, BorderLayout.CENTER);
//        JButton_up.addActionListener(new ActionListener(){
//            
//            public void actionPerformed(ActionEvent e) {
//              
//            }
//        });

        ActionListener ac = new CounterListener(this);
        JButton_up.addActionListener(ac);
        JButton_down.addActionListener(ac);
        reset.addActionListener(ac);
       
        this.setLayout(new BorderLayout());
        this.add(jPanel, BorderLayout.CENTER);
        this.add(reset, BorderLayout.SOUTH);
        
    }

    public void increment() {
        this.counterModel.increment();
        this.jLable_value.setText(this.counterModel.getValue() + " ");
        
    }

    public void decremet() {
        this.counterModel.decrement();
        this.jLable_value.setText(this.counterModel.getValue() + " ");
    }

    public void reset() {
        this.jLable_value.setText("0");
            }
    
}
