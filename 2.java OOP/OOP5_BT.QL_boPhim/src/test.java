
public class test {
	public static void main(String[] args) {
		Ngay date1 = new Ngay(12, 20, 2002);
		Ngay date2 = new Ngay(9, 10, 2001);
		Ngay date3 = new Ngay(31, 1, 2036);

		HangSX hang1 = new HangSX("hãng 1", "Viet nam");
		HangSX hang2 = new HangSX("hãng 2", "Viet nam");
		HangSX hang3 = new HangSX("hãng 3", "China");
		
		BoPhim film1 = new BoPhim("nha ba nu", 2220, hang1, 2222000, date1);
		BoPhim film2= new BoPhim("nád", 2220, hang2, 12000, date2);
		BoPhim film3= new BoPhim("iron man", 2220, hang3, 9999990, date3);
	
//	kiểm tra giá
		System.out.println("bo phim 1 rẻ hơn bộ pphim 2 "+film1.Giare(film2));
		System.out.println("bo phim 1 rẻ hơn bộ pphim 3 "+film1.Giare(film3));
		System.out.println("hãng sản xuqaats bộ phim 3 là"+film3.getHangSX().getNameHang());
	}
}
