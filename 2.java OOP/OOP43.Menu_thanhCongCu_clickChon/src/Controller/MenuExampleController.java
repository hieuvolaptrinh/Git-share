/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import view.MenuExampleView;

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
        String button = e.getActionCommand();
        if (button.equalsIgnoreCase("Exit")) {
            //this.menuExampleView.setTextJLabel("Bạn đã click JmenuItem Exit");
            System.exit(0);
        } else if (button.equalsIgnoreCase("Toolbar")) {
//            ép kiểu sự kiện về cái nút
            System.out.println("toolbar");
            AbstractButton checkBox = (AbstractButton) e.getSource();
            boolean check = checkBox.getModel().isSelected();
            if (check) {
                this.menuExampleView.enableToolbar();
            } else {
                this.menuExampleView.disableToolbar();
            }
        } else {
            this.menuExampleView.setTextJLabel("bạn đã Click vào " + button);
        }
    }
}
