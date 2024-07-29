public abstract class NhanSU {
//    thêm các thuộc tính
private  String ten;
private  String cccd;
private  String que;
//chỗ này gọi là over loading
    public NhanSU(String que, String cccd, String ten) {
        this.que = que;
        this.cccd = cccd;
        this.ten = ten;
    }

    public NhanSU(String cccd, String ten) {
        this.cccd = cccd;
        this.ten = ten;
    }

    public NhanSU() {
    }

    //    phuong thức tính luong
    public abstract double tinhLuong(int ngayCong);


    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getQue() {
        return que;
    }

    public void setQue(String que) {
        this.que = que;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    
}
