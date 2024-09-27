package main;

public class Box2Test {
	public static void main(String[] args) {
		Box2 b1 = new Box2(15);
		System.out.println("Giá trị: "+ b1.getValue());
		
		Box2 b2 = new Box2("Hello TITV!");
		System.out.println("Giá trị: "+ b2.getValue());
		
		Box2 b3 = new Box2(15.5);
		System.out.println("Giá trị: "+ b3.getValue());
		
	}
}
