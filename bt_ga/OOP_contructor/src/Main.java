import goi_moi.SinhVien;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien sv1 = new SinhVien( );
        SinhVien sv2 = new SinhVien(9.9, "hieu vo");
//căng chỉnh code là Ctrl +alt +L
        sv1.hienThiTT( );
        sv2.hienThiTT( );
//        sv2.hoTen="ádsadasd";
        sv2.hienThiTT( );

//        check lại phương thức kiểm tra điểm sử dụng suport method ( private
//    sv2.check(); // không dược vì ta để là private nên là nó chỉ có thể truy xuất được ở trong chính cái class con sinh viên
        double dtb = sv2.tinhDTB(1, 2);
        System.out.println(dtb);
        System.out.println(sv2.tinhDTB(1, 2, 3));
    double kqarr=sv2.TongDiem(1,2,3,4,5,6,7,8,99,2,99,9,2);
        System.out.println(kqarr );
    }
}