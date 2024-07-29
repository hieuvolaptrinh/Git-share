import java.util.Scanner;

public class math {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b;
		System.out.println("NHAP VAO SO A");
		a = sc.nextDouble();
		b = sc.nextDouble();
		// hàm lấy giá trị tuyệt đối
		System.out.println("tri tuyet doi" + Math.abs(a));
//	min
		System.out.println("min a va b la" + Math.min(a, b));
//	tim max
		System.out.println("max a va b la " + Math.max(a, b));
//	hàm ceil
		System.out.println("ceil a va b la " + Math.ceil(b));
//	hàm floor
		System.out.println("floor a va b la " + Math.floor(b));
//căng bật 2
		System.out.println("căng bật 2" + Math.sqrt(a));
//		a mũ b
		System.out.println("a mu b la"+ Math.pow(a,b));
	}
}
