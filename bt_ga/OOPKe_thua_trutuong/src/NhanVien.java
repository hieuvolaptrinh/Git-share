public abstract class NhanVien {
    protected String ten;
    protected String que;
    protected int cccd;
    protected double luongCb = 850;

    public NhanVien(String ten, int cccd, String que) {
        this.ten = ten;
        this.cccd = cccd;
        this.que = que;
    }
//public double tinhLuong(){
//        return luongCb;
//}
//abstract class : lớp trừu tượng (tính trừu tượng trong java)
//    1. nó là phương thức abstract thì nó phải để trong lớp abstracy
//    2. nó chỉ có tên hàm, các đối só, không có nội dung hàm
//    3. nố là một lớp trừ tượng, nên ta không thể khởi tạo nó bằng toán tử new
//    4.Class con kế thừa abstract thì phải định nghia lại các phương thức abstract từ cha nó
public abstract double tinhLuong();
}