import java.util.Iterator;
import java.util.Scanner;

public class break_d {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
int out, in;
//		for ( out = 0; out <= 10; out++) {
//			for (in = 0; in < 20; in++) {
//				if (in > 10)
//					break;
//			}
//			System.out.println("vong lap out :" + out);
//		}
//		System.out.println("ben ngoai vong lap out: out= "+out);

//	sos sanh
		
		outer :for (out = 0; out < 10; out++) {
			for (in = 0; in < 20; in++) {
				System.out.println(in);
				if (in > 10)
				
					break outer;
			}
			System.out.println("vong lap out :" + out);
		}
		System.out.println("ben ngoai vong lap out: out= " + out);
	}
}
