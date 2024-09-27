package ex2;

import java.io.Serializable;

public class SinhVien implements Comparable<SinhVien> {
	private int maSinhVien;
	private String hoVaTen;
	private String tenLop;
	private double diemTrungBinh;

	public SinhVien(int maSinhVien, String hoVaTen, String tenLop, double diemTrungBinh) {
		this.maSinhVien = maSinhVien;
		this.hoVaTen = hoVaTen;
		this.tenLop = tenLop;
		this.diemTrungBinh = diemTrungBinh;
	}

	public int getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}

	
	@Override
	public String toString() {
		return "SinhVien [maSinhVien=" + maSinhVien + ", hoVaTen=" + hoVaTen + ", tenLop=" + tenLop + ", diemTrungBinh="
				+ diemTrungBinh + "]";
	}

	public String getTen() {
		String s = this.hoVaTen.trim();
		if (s.indexOf(" ") >= 0) {
			int vt = s.lastIndexOf(" ");
			return s.substring(vt + 1);
		} else {
			return s;
		}
	}

	public String getTen(String s) {
		s.trim(); // xóa đi khoảng trắng ở 2 đầu
		if (s.indexOf(" ") >= 0) {
			int vt = s.lastIndexOf(" ");
			return s.substring(vt + 1);

		} else {
			return s;
		}
	}

	@Override
	public int compareTo(SinhVien o) {
//		< 0 
//		= 0
//		>0
//		 ví dụ so sánh theo tên
		String tenThis =this.getTen();
		String tenO = o.getTen();

		return tenThis.compareTo(tenO) ; // 
	}

}