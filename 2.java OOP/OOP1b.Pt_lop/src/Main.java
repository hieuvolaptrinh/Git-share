
public class Main {
	public static void main(String[] args) {

		BillCoffe hd = new BillCoffe("Cafe trung nguyen", 120000, 3);
		BillCoffe hd2 = new BillCoffe("Cafe trung nguyen", 120000, 5);
		System.out.println("tong tien la " + hd.tongTien());

//		kiểm tra khối lượng
		System.out.println("kiểm tra khối lượng có lớn hơn 2 kq không ?" + hd.KtraKL(2));
		System.out.println("kiểm tra khối lượng có lớn hơn 1 kq không ?" + hd.KtraKL(1));
//	kiểm tra thành tiền có lớn hơn 500k hay không ?
		System.out.println("kiểm tra thành tiền có lớn hơn 500k hay không " + hd.Check500k());
//	tiền sau khi giảm giá
		System.out.println(
				"giá trươc khi giảm là :" + hd.tongTien() + " và số tiền được giảm giá là:" + hd.Sale(10));
		System.out.println("giá trươc khi giảm là :" + hd2.tongTien() + " vvà số tiền được giảm giá là:"
				+ hd2.Sale(10));
//	tiền khách cần phải thanh toán
		System.out.println("khách hàng 1 thanh toán số tiền là " + hd.Payment_price(10));
		System.out.println("khách hàng 2 thanh toán số tiền là :" + hd2.Payment_price(10));
	}
}
