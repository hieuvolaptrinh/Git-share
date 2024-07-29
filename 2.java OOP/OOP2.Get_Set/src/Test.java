
public class Test {
	public static void main(String[] args) {
		MyDate md = new MyDate(19, 10, 2005);
		System.out.println("ngày sinh là :" + md.getDay());
		md.setDay(35);
		System.out.println("ngày sinh là :" + md.getDay());
		md.setDay(12);
		System.out.println("ngày sinh là :" + md.getDay());
	}
}
