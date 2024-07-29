public class NhanVienDiCa  extends NhanVien{
protected  int ca;

    public NhanVienDiCa(String ten, int cccd, String que) {
        super(ten, cccd, que);

    }
    public NhanVienDiCa(String ten, int cccd, String que, int ca) {
        super(ten, cccd, que);
        this.ca=ca;
    }
    @Override //nghĩa là tái định nghĩa
    public double tinhLuong() {
        return luongCb*1.5;
    }
}
