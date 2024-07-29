
public class ThoiKhoaBieu {
	private Day thu;

	private String monhoc;

	public ThoiKhoaBieu(Day thu, String monhoc) {
		super();
		this.thu = thu;
		this.monhoc = monhoc;
	}

	public Day getThu() {
		return thu;
	}

	@Override
	public String toString() {
		return "ThoiKhoaBieu [thu=" + thu + ", monhoc=" + monhoc + "]";
	}

	public void setThu(Day thu) {
		this.thu = thu;
	}

	public String getMonhoc() {
		return monhoc;
	}

	public void setMonhoc(String monhoc) {
		this.monhoc = monhoc;
	}

}
