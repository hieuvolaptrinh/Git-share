package Controller;


import View.ThucDonView;

import java.awt.event.*;
import java.util.Enumeration;
import java.lang.*;
import javax.swing.*;


public class ThucDonController implements ActionListener{
    private ThucDonView thucDonView;

    public ThucDonController(ThucDonView thucDonView) {
        this.thucDonView = thucDonView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String monChinh = "";
        Enumeration<AbstractButton> buttons_monChinh =  thucDonView.buttonGroup_MonChinh.getElements();
        while(buttons_monChinh.hasMoreElements()) {
            AbstractButton b = buttons_monChinh.nextElement();
            if (b.isSelected()) {
                monChinh = b.getText();
                break;  // Chỉ cần một nút được chọn
            }
        }

        if (monChinh.isEmpty()) {
            // Xử lý nếu không có món chính nào được chọn
            JOptionPane.showMessageDialog(thucDonView, "Vui lòng chọn một món chính!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        StringBuilder monPhu = new StringBuilder();
        for (AbstractButton b : thucDonView.list_buttonGroup_MonPhu) {
            if (b.isSelected()) {
                monPhu.append(b.getText()).append("; ");
            }
        }

        thucDonView.thucDonModel.setLuaChon_MonChinh(monChinh);
        thucDonView.thucDonModel.setLuaChon_MonPhu(monPhu.toString().trim());
        thucDonView.thucDonModel.tinhTongTien();
        thucDonView.hienThiKetQua();
    }
}
