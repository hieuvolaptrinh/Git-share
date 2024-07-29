
public class Test {
	public static void main(String[] args) {
		ToaDo td1 = new ToaDo(5, 5);
		ToaDo td2 = new ToaDo(1, 57);
		ToaDo td3 = new ToaDo(3, 9);

//	Hinh h=new Hinh(td1); lớp trườu tượng không  thể tạo trực tiếp kiểu này
		Hinh h1 = new Diem(td1);
		Hinh h2 = new HinhChuNhat(td1,3,5);
		Hinh h3 = new HinhTron(td3,2);
		System.out.println("dien tich 1 la "+h1.DienTich());
		System.out.println("dien tich hinh tron là "+h3.DienTich());
		System.out.println("dien tich hinh chu nhat là "+h2.DienTich());
	}
}
