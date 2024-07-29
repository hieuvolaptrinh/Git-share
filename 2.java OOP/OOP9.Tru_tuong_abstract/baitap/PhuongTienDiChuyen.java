
public abstract class PhuongTienDiChuyen {
 protected String tenLoaiPhuongTien;
 protected HangSanXuat hangSanXuat;


public PhuongTienDiChuyen(String tenLoaiPhuongTien, HangSanXuat hangSanXuat) {
	super();
	this.tenLoaiPhuongTien = tenLoaiPhuongTien;
	this.hangSanXuat = hangSanXuat;
}

public String getTenLoaiPhuongTien() {
	return tenLoaiPhuongTien;
}

public void setTenLoaiPhuongTien(String tenLoaiPhuongTien) {
	this.tenLoaiPhuongTien = tenLoaiPhuongTien;
}
// viết p huongwq thức
public String layTenHangSanXuat() {
	return this.hangSanXuat.getTenHangSanXuat();
}
public void BatDau() {
	System.out.println("bắt đầu..................");
}
public abstract double VanToc();
}
