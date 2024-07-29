//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        NhanVien nv1 = new NhanVien("hieu vo", 21343534,"gialai");
//        double luongnv1 = nv1.tinhLuong( );
//        System.out.println("lương nhân viên 1 là " + luongnv1);
//tạo đối tượng nv hành chính
        NhanVienDiCa dc1= new NhanVienDiCa("hiếu võ",4568768,"việt nam thân yêu");
        NhanVienHanhChinh hc1=new NhanVienHanhChinh("le bao",123123,"quangnam");
        System.out.println(hc1.tinhLuong() );
        System.out.println(dc1.tinhLuong() );
//
        NhanVienDiCa ca2=new NhanVienDiCa("tí",124423544,"hà nội",1);
        System.out.println("lunog nhân viên ca 2 là " +ca2.ca);
    }
}
