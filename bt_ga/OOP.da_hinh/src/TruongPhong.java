public class TruongPhong extends NhanSU{
    public TruongPhong() {
    }

    public TruongPhong(String cccd, String ten) {
        super(cccd, ten);
    }

    public TruongPhong(String que, String cccd, String ten) {
        super(que, cccd, ten);
    }

    @Override
    public double tinhLuong(int ngayCong) {
        return 50*ngayCong;
    }
}
