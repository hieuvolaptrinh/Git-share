
public class BillCoffe {
	private String NameCoffe;
	private double price;
	private double weight;

//	tạo ra đối tượng 
	public BillCoffe(String name, double gia, double kl) {
		this.NameCoffe = name;
		this.price = gia;
		this.weight = kl;
	}

	public double tongTien() {
		return this.weight * this.price;
	}

//	phương thức kiểm tra khối lượng có lớn hơn 1 số mình nhập từ bàn phím hay không?
	public boolean KtraKL(double kl) {
//		if (this.weight > kl)
//			return true;
//		else
//			return false;
		return this.weight > kl;
	}

//	kiểm tra tổng  tiền có lớn hơn 500k hay không >?
	public boolean Check500k() {
		return this.tongTien() > 500000;
	}

//	giảm giá x% cho hóa đơn lớn hơn 500k 
	public double Sale(double x) {
		if (this.tongTien() > 500000)
			return this.tongTien() * x / 100;
		return 0;
	}
//	thành tiền sau khi thanh toán tiền
	public double Payment_price(double x) {
		return this.tongTien()-this.Sale(x);
	}

}
