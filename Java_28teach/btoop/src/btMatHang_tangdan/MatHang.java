package btoop.src.btMatHang_tangdan;

public class MatHang {
    private String ma, ten, donvi;
    private int giaMua, giaBan;

    public MatHang(int ma, String ten, String donvi, int giaMua, int giaBan) {
        this.ma = "MH" + String.format( "%05d",ma);
        this.ten = ten;
        this.donvi = donvi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }
    public int getLoiNhuan(){
        return this.giaBan-this.giaMua;
    }

    @Override
    public String toString() {
        return "MatHang{" +
                "ma='" + ma + '\'' +
                ", ten='" + ten + '\'' +
                ", donvi='" + donvi + '\'' +
                ", giaMua=" + giaMua +
                ", giaBan=" + giaBan +"loi nhuan"+this.getLoiNhuan()+
                '}';
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDonvi() {
        return donvi;
    }

    public void setDonvi(String donvi) {
        this.donvi = donvi;
    }

    public int getGiaMua() {
        return giaMua;
    }

    public void setGiaMua(int giaMua) {
        this.giaMua = giaMua;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }
}
