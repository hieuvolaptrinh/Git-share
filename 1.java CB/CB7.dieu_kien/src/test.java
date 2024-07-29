import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;

		System.out.println("nhập số a ");
		a = sc.nextInt();
		String kq = (a % 2 == 0) ? "số chẵn" : "số lẻ ";
		System.out.println(a+"la"+kq);	}
}
