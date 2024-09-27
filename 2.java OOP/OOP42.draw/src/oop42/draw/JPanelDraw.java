package oop42.draw;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class JPanelDraw extends JPanel {

    public JPanelDraw() {
        this.setBackground(Color.white);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.drawLine(15,12, 50, 120);
        
        g.drawOval(255, 255,50, 50);
        g.setColor(Color.blue);
        
        
        g.drawRect(45, 400, 54, 100);
        g.setColor(Color.green);
        
        g.fillOval(100, 300, 54, 100);
        g.setColor(Color.yellow);
        
        
    }
    
}
