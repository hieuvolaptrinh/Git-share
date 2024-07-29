
public class Sach {
	private String tenSach;
	private double giaBan;
	private int namSx;
	private TacGia tacGia;

	public Sach(String tenSach, double giaBan, int namSx, TacGia tacGia) {

		this.tenSach = tenSach;
		this.giaBan = giaBan;
		this.namSx = namSx;
		this.tacGia = tacGia;
	}

	public String getTenSach() {
		return tenSach;
	}

	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}

	public double getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}

	public int getNamSx() {
		return namSx;
	}

	public void setNamSx(int namSx) {
		this.namSx = namSx;
	}

	public TacGia getTacGia() {
		return tacGia;
	}

	public void setTacGia(TacGia tacGia) {
		this.tacGia = tacGia;
	}

//	phuong thuc in ten sach
	public void inTenSach() {
		System.out.println(this.tenSach);
	}

//	kiểm tra có cùng năm xuất bản không
	public boolean CheckNam(Sach sach2) {
		if (this.namSx != sach2.namSx)
			return false;
		return true;

	}
//	giá sau khi giảm
	public double SalePrice(double x) {
		return this.giaBan-this.giaBan*x/100;
	}
}
