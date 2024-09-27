package goi_moi;

public class SinhVien {
    protected String hoTen;
    private double diem;

    public SinhVien() {

    }

    public SinhVien(double diem, String hoTen) {
        this.diem = diem;
        this.hoTen = hoTen;
    }

    //hiển thị thông tin
    public void hienThiTT() {
        System.out.println(this.hoTen + this.diem);
    }
//   tóString

    @Override
    public String toString() {
        return "SinhVien{" +
                "hoTen='" + hoTen + '\'' +
                ", diem=" + diem +
                '}';
    }

    //    support method và service method
//    1 support method chỉ sử dụng nội tại trong class
    private boolean checkDiem() {
        return this.diem >= 24;
    }

    //    service method
    public void checkHopLe() {
        if (checkDiem()) {
            System.out.println("điểm hợp lệ");
        } else
            System.out.println("điểm không hợp lệ vui lòng kiểm tra lại điểm");
    }

    //
//
//    Overloading Method là trong cùng một class có nhiều phương thức có cùng tên
//    nhưng chúng khác nhau về Signature ( là khác nhau
//                  1. số lượng các đối số, 2. kiểu dữ liệu các đối số, 3. thứ tự các đối số;
//        constructor là trường hợp đặt biệt của overloading method
    public double tinhDTB(double diemToan, double diemVan) {
        return (diemToan + diemVan) / 2;

    }

    public double tinhDTB(double diemToan, double diemVan, double diemAnh) {
        return (diemToan + diemVan + diemAnh) / 3;

    }

    //    parametter list method là trường hợp đặt biệt của overloading method được sử dụng khi ta không thể nắm được số lượng đối só truyền vào.
    public double TongDiem(double... arr) {
        double tong = 0;
        for (double x : arr) {
            tong += x;
        }
        return tong;
    }
}
