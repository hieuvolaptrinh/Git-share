import java.util.Scanner;

public class pt_bac_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c, x1, x2, dt;
		System.out.println("nhap a b c");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		dt = Math.pow(b, 2) - 4 * a * c;
		if (dt > 0) {
			x1 = (-b + Math.pow(dt, 0.5)) / (2 * a);
			x2 = (-b - Math.pow(dt, 0.5)) / (2 * a);
			System.out.println("x1 la: " + x1 + " x2 la : " + x2);
		} else {
			if (dt == 0) {
				System.out.println("pt co nghiem kep la: " + (-b) / (2 * a));
			} else
				System.out.println("pt vo nghiem");
		}

	}
}
