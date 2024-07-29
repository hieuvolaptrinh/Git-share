public  class PhoPhong extends NhanSU {

    public PhoPhong() {
    }

    public PhoPhong(String cccd, String ten) {
        super(cccd, ten);
    }

    public PhoPhong(String que, String cccd, String ten) {
        super(que, cccd, ten);
    }

    public  double tinhLuong(int ngayCong){
        return 40*ngayCong;
    };
}
