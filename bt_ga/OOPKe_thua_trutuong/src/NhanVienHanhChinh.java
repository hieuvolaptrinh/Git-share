public class NhanVienHanhChinh extends NhanVien{

    public NhanVienHanhChinh(String ten, int cccd, String que) {
        super(ten, cccd, que);
    }

    @Override
    public double tinhLuong() {
        return luongCb;
    }
}
