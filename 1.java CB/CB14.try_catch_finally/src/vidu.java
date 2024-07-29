import java.util.Scanner;

public class vidu {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n=0;
	try {
		 System.out.println("nhap vao 1 so nguyen n");
		 n=sc.nextInt();
		
	} catch (Exception e) {
		System.out.println("nhap gia tri bi loi");
	}
	finally {
		System.out.println("thanh cong");
	}
	 System.out.println("gia tri cua n la"+ n);
	 System.out.println("ket thuc chuong trinh");
}
}
