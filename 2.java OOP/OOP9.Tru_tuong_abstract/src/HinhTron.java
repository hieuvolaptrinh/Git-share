
public class HinhTron extends Hinh {
	private double r;

	public HinhTron(ToaDo td, double r) {
		super(td);
		this.r = r;
	}
	public double DienTich() {
		return Math.PI*r*r;
	}
}
