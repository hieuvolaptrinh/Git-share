package main;

import javax.swing.Box;

public class TestBox {
	public static void main(String[] args) {
		box box = new box(15);

		System.out.println("Giá trị: "+ box.getValue());
		
		
//		Box box = new Box(15.5); => Báo lỗi
//		Box box = new Box("Mười lăm")=> Báo lỗi
	}
	
}
