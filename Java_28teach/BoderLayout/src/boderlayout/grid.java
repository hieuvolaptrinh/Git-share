/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boderlayout;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author hieuvo
 */
public class grid {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Panel");
        
        JButton[] btn= new JButton[9];
        
        for(int i=0;i<9;i++)
        {
            btn[i] = new JButton(i+1+"");
        }
        frame.setLayout(new GridLayout(3,3));
        for(int i=0;i<9;i++){
        frame.add(btn[i]);
        }
        
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
}

    
}
