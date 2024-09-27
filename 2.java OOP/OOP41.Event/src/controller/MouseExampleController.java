/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import view.MouseExampleView;

/**
 *
 * @author hieuvo
 */
public class MouseExampleController implements MouseListener, MouseMotionListener {

    private MouseExampleView mouseExampleView;

    public MouseExampleController(MouseExampleView mouseExampleView) {
        this.mouseExampleView = mouseExampleView;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.mouseExampleView.click();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.mouseExampleView.enter();
        int x = e.getX();
        int y = e.getY();
        this.mouseExampleView.update(x, y);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.mouseExampleView.exit();
    }

    @Override
    public void mouseDragged(MouseEvent e) {

        this.mouseExampleView.enter();
        int x = e.getX();
        int y = e.getY();
        this.mouseExampleView.update(x, y);

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

}
