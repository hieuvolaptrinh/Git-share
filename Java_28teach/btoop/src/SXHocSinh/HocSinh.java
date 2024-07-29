package SXHocSinh;

import java.util.Arrays;

public class HocSinh {
    private String ten, masv;
    private double[] diem;

    //mỗi sv có 1 bảng điểm của 10 môn
//    mã tự động tăng
    public HocSinh(int ma, String ten, double[] diem) {
        this.masv = "HS" + String.format("%02d", ma);
        this.ten = ten;
        this.diem = new double[10];
        for (int i = 0; i < 10; i++) {
            this.diem[i] = diem[i];
        }
    }

    public double getTrungBinh() {
        double res = 0;
        for (int i = 0; i < 10; i++) {
            res += this.diem[i];
        }
        return res / 10;
    }

    //đánh giá xếp loại của học sinh
    @Override
    public String toString() {
        String resfult ;
        if ( getTrungBinh( ) >= 9 ) {
            resfult = "xuất sắt";
        }
        else if ( getTrungBinh( ) >=8) {
            resfult = "gioi";
        }
        else if ( getTrungBinh( )  >=6) {
            resfult = "khá";
        }
       else resfult="yeu";

        return this.masv + " " + this.ten + " " + this.getTrungBinh()+" "+ resfult;
    }
}
