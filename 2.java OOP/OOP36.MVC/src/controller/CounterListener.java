/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.CounterView;

/**
 *
 * @author hieuvo
 */
public class CounterListener implements ActionListener {

    private CounterView ctv;

    public CounterListener(CounterView ctv) {
        this.ctv = ctv;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand(); // lấy ra tên nút 
        System.out.println("bạn đã nhấn nút " + src);
        if (src.equals("up")) {
            this.ctv.increment();
        } else if (src.equals("down")) {
            this.ctv.decremet();
        } else if(src.equals("RESET"))  {
            this.ctv.reset();
        }

    }
}
