/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chess;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author hieuvo
 */
public class chess {

    public static void main(String[] args) {
        JFrame frame = new JFrame("bàn cờ vua");

        JButton[][] btn = new JButton[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                btn[i][j] = new JButton();
                if ((i + j+1) % 2 == 0) {
                    btn[i][j].setBackground(Color.BLACK);
                }
                else
                    btn[i][j].setBackground(Color.WHITE);
            }
        }
        frame.setLayout(new GridLayout(8, 8));
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                frame.add(btn[i][j]);
            }
        }

        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
