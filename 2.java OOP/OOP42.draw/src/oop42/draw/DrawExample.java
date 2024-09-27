
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop42.draw;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author hieuvo
 */
public class DrawExample extends JFrame{

    public DrawExample() {
        this.setTitle("Draw Example");
    this.setSize(500,500);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    
    JPanelDraw jPanelDraw = new JPanelDraw();
    this.setLayout(new BorderLayout());
    this.add(jPanelDraw, BorderLayout.CENTER);
    
    
    
    this.setVisible(true);
    }
    public static void main(String[] args) {
        new DrawExample();
    }
}
