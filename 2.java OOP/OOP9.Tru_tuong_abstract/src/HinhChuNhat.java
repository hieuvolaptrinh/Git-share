
public class HinhChuNhat extends Hinh {
	private double dai, rong;

	public HinhChuNhat(ToaDo td, double dai, double rong) {
		super(td);
		this.dai = dai;
		this.rong = rong;
	}

	@Override
	public double DienTich() {
		return dai*rong;
	}
	


	

	
	
}
