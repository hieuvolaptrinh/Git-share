import java.util.Scanner;

public class contineu {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		outer: for (int i = 1; i <= 9; i++) {
			System.out.println("bảng cửu chuong "+i+" là:");
			
			for (int j = 1; j < 10; j++) {
				if(i<5)
					continue outer ;
				System.out.println(i+ " * "+j +" = " +i*j);
			}
			System.out.println("");
		}
	}
}
