/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.LastButtonView;

public class LastButtonListener implements ActionListener {
  private LastButtonView lastButtonView;

    public LastButtonListener(LastButtonView lastButtonView) {
        this.lastButtonView = lastButtonView;
    }
	public void actionPerformed(ActionEvent e) {
		String nguonSuKien = e.getActionCommand();
		if (nguonSuKien.equals("1")) {
			this.lastButtonView.changeTo_1();
		}else if (nguonSuKien.equals("2")) {
			this.lastButtonView.changeTo_2();
		}else if (nguonSuKien.equals("3")) {
			this.lastButtonView.changeTo_3();
		}else if (nguonSuKien.equals("4")) {
			this.lastButtonView.changeTo_4();
		}
	}
}
