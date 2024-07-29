
public class TacGia {
	private String TenTG;
	private Ngay ngaySinh;

	public TacGia(String tenTG, Ngay ngaySinh) {

		TenTG = tenTG;
		this.ngaySinh = ngaySinh;
	}
//

	public String getTenTG() {
		return TenTG;
	}

	public void setTenTG(String tenTG) {
		TenTG = tenTG;
	}

	public Ngay getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Ngay ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
//
}
