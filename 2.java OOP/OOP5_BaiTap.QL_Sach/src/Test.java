
public class Test {
public static void main(String[] args) {
	Ngay day1=new Ngay(1,1,2000);
	Ngay day2=new Ngay(3,11,2030);
	Ngay day3=new Ngay(4,7,1230);

	TacGia tacGia1= new TacGia("vo nguyen dai hieu", day1);
	TacGia tacGia2= new TacGia("le ba dai", day2);
	TacGia tacGia3= new TacGia("nguyen van khoa", day3);
	
	Sach sach1= new Sach("thuc hanh csdl", 12000, 2000, tacGia1);
	Sach sach2= new Sach("lap trinh c", 33000, 2001, tacGia1);
	Sach sach3= new Sach("java nang cao", 87000, 2020, tacGia1);

//	in tên sách
	sach1.inTenSach();
	sach2.inTenSach();
	sach3.inTenSach();
//	so sánh
	System.out.println("so sánh năm sản xuất sách 1 và sách 3"+sach1.CheckNam(sach3));
//	giảm giá là
	System.out.println("giá sách 1 là"+sach1.getGiaBan()+" va sau khi giam gia 50% la: "+sach1.SalePrice(50));
}
}
