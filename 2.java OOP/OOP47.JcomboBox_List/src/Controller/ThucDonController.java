package Controller;


import View.ThucDonView;

import java.awt.event.*;

import java.lang.*;


public class ThucDonController implements ActionListener {
    private ThucDonView thucDonView;

    public ThucDonController(ThucDonView thucDonView) {
        this.thucDonView = thucDonView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String monChinh = thucDonView.jComboBox_MonChinh.getSelectedItem().toString();

        String monPhu = "";
        Object[] luaChonMonPhus = thucDonView.jList_MonPhu.getSelectedValues();
        for (Object o : luaChonMonPhus) {
            monPhu = monPhu + o.toString() + "; ";
        }

        thucDonView.thucDonModel.setLuaChon_MonChinh(monChinh);
        thucDonView.thucDonModel.setLuaChon_MonPhu(monPhu);
        thucDonView.thucDonModel.tinhTongTien();
        thucDonView.hienThiKetQua();
    }

}