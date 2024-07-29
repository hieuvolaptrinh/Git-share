
public class BoPhim {
	private String film;
	private int namSX;
	private HangSX hangSX;
	private double price;
	private Ngay ngaychieu;

	public BoPhim(String film, int namSX, HangSX hangSX, double price, Ngay ngaychieu) {
		super();
		this.film = film;
		this.namSX = namSX;
		this.hangSX = hangSX;
		this.price = price;
		this.ngaychieu = ngaychieu;
	}

	public String getFilm() {
		return film;
	}

	public void setFilm(String film) {
		this.film = film;
	}

	public int getNamSX() {
		return namSX;
	}

	public void setNamSX(int namSX) {
		this.namSX = namSX;
	}

	public HangSX getHangSX() {
		return hangSX;
	}

	public void setHangSX(HangSX hangSX) {
		this.hangSX = hangSX;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Ngay getNgaychieu() {
		return ngaychieu;
	}

	public void setNgaychieu(Ngay ngaychieu) {
		this.ngaychieu = ngaychieu;
	}

//kiểm tra giá vé rẻ hơn
public boolean Giare(BoPhim a) {
	return this.price <a.price;
			}
}
