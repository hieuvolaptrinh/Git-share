package main;

import java.io.Serializable;

public class SinhVien implements Comparable<SinhVien>,Serializable{
	private String maSinhVien;
	private String hoVaTen;
	private int namSinh;
	private float diemTrungBinh;

	public SinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getMaSInhVien() {
		return maSinhVien;
	}

	public void setMaSInhVien(String maSInhVien) {
		this.maSinhVien = maSInhVien;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public float getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(float diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}

	public SinhVien(String maSInhVien, String hoVaTen, int namSinh, float diemTrungBinh) {
		super();
		this.maSinhVien = maSInhVien;
		this.hoVaTen = hoVaTen;
		this.namSinh = namSinh;
		this.diemTrungBinh = diemTrungBinh;
	}

	@Override
	public String toString() {
		return "SinhVien [maSInhVien=" + maSinhVien + ", hoVaTen=" + hoVaTen + ", namSinh=" + namSinh
				+ ", diemTrungBinh=" + diemTrungBinh + "]";
	}

	@Override
	public int compareTo(SinhVien o) {
		// TODO Auto-generated method stub
		return this.maSinhVien.compareTo(o.maSinhVien);
	}

}
