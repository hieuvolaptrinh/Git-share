import java.util.Scanner;

public class bt {
	public static void main(String[] args) {
		float a;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập vào số a");
		a = sc.nextFloat();
		a += a;
		System.out.println(+a);
		a -= 2;
		System.out.println(a);
		a *= a;
		System.out.println(a);

		a = a % 5;
		System.out.println(a);
	}

}
