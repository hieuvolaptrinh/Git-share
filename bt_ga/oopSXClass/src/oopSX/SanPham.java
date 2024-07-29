package oopSX;

//sắp xếp đối tượng dựa vào Interface
public class SanPham implements Comparable<SanPham> {
    //    thuộc tính
    private int ma;
    private String ten;
    private double gia;

    public SanPham(int ma, String ten, double gia) {
        this.ma = ma;
        this.gia = gia;
        this.ten = ten;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
//to String

    @Override
    public String toString() {
        return ma+ "\t"+ten+"\t"+gia;
    }

    @Override
    public int compareTo(SanPham o) {
        return this.ten.compareToIgnoreCase((o.ten));
    }

    //    phương thức
//    @Override
//    public int compareTo(SanPham o) {
////        sắp xếp theo giá tăng dần
//        if ( this.gia < o.gia )
//            return -1; // nhỏ hơn thì -1
//        if ( this.gia > o.gia )
//            return 1; // lớn hơn thì 1
//        return 0; //bằng thì 0
//    }
}
