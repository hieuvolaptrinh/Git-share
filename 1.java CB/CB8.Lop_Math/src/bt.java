import java.util.Scanner;

public class bt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r, s, cv;
		System.out.println("nhap gia tri ban kinh cua hinh tron");
		r = sc.nextDouble();
		s = Math.pow(r, 2) * Math.PI;
		cv = Math.PI * 2 * r;

//	xuat ket qua
		System.out.println("dien tich hinh tron la " + s);
		System.out.println("dien tich hinh tron la " + Math.round(s));
		
		System.out.println("chu vi hinh tron la " + cv);
		System.out.println("chu vi hinh tron la " + Math.round(cv));
		System.out.println("chu vi hinh tron la " + Math.round(cv*100)/100.0);
	}
}