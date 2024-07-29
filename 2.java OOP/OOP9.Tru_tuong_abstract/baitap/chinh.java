
public class chinh {
	public static void main(String[] args) {
		HangSanXuat h1 = new HangSanXuat("hãng 1", "VieetjNam");
		HangSanXuat h2 = new HangSanXuat("hãng 2", "usa");
		HangSanXuat h3 = new HangSanXuat("hãng 3", "china");

		PhuongTienDiChuyen p1 = new MayBay(h1, "xang");
		PhuongTienDiChuyen p2 = new Oto(h3, "dầu");
		PhuongTienDiChuyen p3 = new XeDap(h2);

		System.out.println("lấy hãng sản xuất");
		System.out.println(p2.layTenHangSanXuat());
		p2.BatDau();
		System.out.println("vân tốc " + p1.VanToc());
		System.out.println("vân tốc " + p2.VanToc());
		System.out.println("vân tốc " + p3.VanToc());
	}
}
