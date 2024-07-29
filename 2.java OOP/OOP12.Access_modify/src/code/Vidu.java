package code;

public class Vidu {
	private Infor infor;
	public void method() {
//		this.Test.a không truy xuất đc
		this.infor.b = 2; // truy cập đc
		this.infor.c=4;
	}

}
