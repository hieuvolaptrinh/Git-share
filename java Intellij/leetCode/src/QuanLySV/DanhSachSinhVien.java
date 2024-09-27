package QuanLySV;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> danhSach = new ArrayList<SinhVien>();


    public DanhSachSinhVien() {
        this.danhSach = new ArrayList<SinhVien>();

    }

    public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }

    //    1. thêm sinh viên vào danh sách
    public void themSinhVien(SinhVien sv) {
        this.danhSach.add(sv);
    }

    //    2. In danh sách
    public void inDanhSachSinhVien() {
        for (SinhVien sv : danhSach) {
            System.out.println(sv.toString());
        }
    }

    //    3. kiểm tra danh sách có rỗng hay không
    public boolean kiemTraDanhSachRong() {
        return this.danhSach.isEmpty();
    }

    //    4. lấy ra số lượng sinh viên trong danh sách
    public int laySoLuongSinhVien() {
        return this.danhSach.size();
    }

    //    5. làm rỗng danh sách sinh viên
    public void lamRongDanhSach() {
        this.danhSach.removeAll(danhSach);
    }

    //    6. kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên
    public boolean kiemTraTonTai(SinhVien sv) {
        return this.danhSach.contains(sv);
    }

    //    7. xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên
    public boolean xoaSinhVien(SinhVien sv) {
        return this.danhSach.remove(sv);
    }

    //    8. tìm kiếm tất cả sinh viên dựa trên tên được nhập từ bàn phím
    public void timSinhVien(String ten) {
        for (SinhVien sv : danhSach) {
            if (sv.getHoVaTen().contains(ten)) {
                System.out.println(sv.toString());
            }
        }
    }

    //    9. xuất ra danh sách sinh viên có điểm từ cao đến thấp
    public void sapXepSinhVienGiamDanTheoDiem() {
        Collections.sort(this.danhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.getDiemTrungBinh() > o2.getDiemTrungBinh()) {
                    return -1;

                } else if (o1.getDiemTrungBinh() < o2.getDiemTrungBinh()) {
                    return 1;
                } else return 0;

            }
        });
    }

}
