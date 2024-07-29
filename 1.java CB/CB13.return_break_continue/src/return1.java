import java.util.Scanner;

public class return1 {
public static void main(String[] args) {
	for (int i = 1; i <= 9; i++) {
		System.out.println("bảng cửu chuong "+i+" là:");
		
		for (int j = 1; j < 10; j++) {
			if(i<5)
				return;
			System.out.println(i+ " * "+j +" = " +i*j);
		}
		System.out.println("");
	}
	
}
}
