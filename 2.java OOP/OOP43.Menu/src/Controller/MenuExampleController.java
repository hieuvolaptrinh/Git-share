/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.MenuExampleView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author hieuvo
 */
public class MenuExampleController implements ActionListener {

    private MenuExampleView menuExampleView;

    public MenuExampleController(MenuExampleView menuExampleView) {
        this.menuExampleView = menuExampleView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if (src.equalsIgnoreCase("open")) {
            this.menuExampleView.setTextJLabel("bạn đã ấn vào trong cái nút open trongg thanh menu n");

        } else if (src.equalsIgnoreCase("Exit")) {
            //this.menuExampleView.setTextJLabel("Bạn đã click JmenuItem Exit");
            System.exit(0);
        } else if (src.equalsIgnoreCase("Welcome")) {
            this.menuExampleView.setTextJLabel("Bạn đã click JmenuItem Welcome");
        }
          else if (src.equalsIgnoreCase("New")) {
            this.menuExampleView.setTextJLabel("Bạn đã click newww");
            
        }
    }
}
