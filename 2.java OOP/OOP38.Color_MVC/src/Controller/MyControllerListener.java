/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.MyColorView;

/**
 *
 * @author hieuvo
 */
public class MyControllerListener implements ActionListener {

    private MyColorView myColorView;

    public MyControllerListener(MyColorView myColorView) {
        this.myColorView = myColorView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if (src.equals("Red Text")) {
            this.myColorView.changeTextColor(Color.RED);
        } else if (src.equals("Yellow Text")) {
            this.myColorView.changeTextColor(Color.YELLOW);
        } else if (src.equals("Green Text")) {
            this.myColorView.changeTextColor(Color.GREEN);
        } else if (src.equals("Red Background")) {
            this.myColorView.changeBacgroundColor(Color.RED);
        } else if (src.equals("Yellow Background")) {
            this.myColorView.changeBacgroundColor(Color.YELLOW);
        } else if (src.equals("Green Background")) {
            this.myColorView.changeBacgroundColor(Color.GREEN);
        }
    }

}
