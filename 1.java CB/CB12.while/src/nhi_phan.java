import java.util.Scanner;

public class nhi_phan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("nhap so can chuyen san he nhi phan");
		n = sc.nextInt();
		String kq = "";
		while (n > 0) {
			kq = n % 2 + kq;
			n = n / 2;
		}
		System.out.println(kq);
	}
}
