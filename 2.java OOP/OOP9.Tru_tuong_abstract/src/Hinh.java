
public abstract class Hinh {
	protected ToaDo toaDo;

	public Hinh(ToaDo td) {
		super();
		this.toaDo = td;
	}

	public ToaDo getToaDo() {
		return toaDo;
	}

	public void setToaDo(ToaDo toaDo) {
		this.toaDo = toaDo;
	}
	public abstract double DienTich();
	
}
