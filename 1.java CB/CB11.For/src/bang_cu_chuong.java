import java.util.Iterator;
import java.util.Scanner;

public class bang_cu_chuong {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	for (int i = 1; i <= 9; i++) {
		System.out.println("bảng cửu chuong "+i+" là:");
		for (int j = 1; j < 10; j++) {
			System.out.println(i+ " * "+j +" = " +i*j);
		}
		System.out.println("");
	}
}
}
