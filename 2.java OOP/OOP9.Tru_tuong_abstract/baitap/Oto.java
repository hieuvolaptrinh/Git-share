
public class Oto extends PhuongTienDiChuyen {
private String loaiNhienLieu;

public Oto( HangSanXuat hangSanXuat, String loaiNhienLieu) {
	super("vin vin", hangSanXuat);
	this.loaiNhienLieu = loaiNhienLieu;
}

public String getLoaiNhienLieu() {
	return loaiNhienLieu;
}

public void setLoaiNhienLieu(String loaiNhienLieu) {
	this.loaiNhienLieu = loaiNhienLieu;
}

@Override
public double VanToc() {
	return 60;
}



	
}
