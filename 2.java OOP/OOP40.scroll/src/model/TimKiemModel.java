/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author hieuvo
 */
public class TimKiemModel {

    private String vanBan;
    private String tuKhoa;
    private String ketQua;

    public TimKiemModel() {
        this.vanBan = "";
        this.tuKhoa = "";
        this.ketQua = "";
    }

    public String getVanBan() {
        return vanBan;
    }

    public void setVanBan(String vanBan) {
        this.vanBan = vanBan;
    }

    public String getTuKhoa() {
        return tuKhoa;
    }

    public void setTuKhoa(String tuKhoa) {
        this.tuKhoa = tuKhoa;
    }

    public String getKetQua() {
        return ketQua;
    }

    public void setKetQua(String ketQua) {
        this.ketQua = ketQua;
    }

    public void timKiem() {
        int dem = 0;
        int viTri = 0;
        while (true) {
            int i = this.vanBan.indexOf(this.tuKhoa, 0);
//            Phương thức indexOf() tìm vị trí xuất hiện đầu tiên của tuKhoa trong vanBan, bắt đầu từ chỉ số 0.
            if (i == -1) {
                break;
            } else {
                dem++;
                viTri=i+1;
            }
        }
    }
//    public int timKiem() {
//        int dem = 0;
//        String[] words = this.vanBan.split(" ");
//        for (String word : words) {
//            if (word.equals(this.tuKhoa)) {
//                dem++;
//            }
//        }
//        return dem;
//    }
}
