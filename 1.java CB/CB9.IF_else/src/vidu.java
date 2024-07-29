import java.util.Scanner;

public class vidu {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n;
	System.out.println("nhap 1 so nguyen n");
	n= sc.nextInt();
	if(n%2==0)
		System.out.println("so chan");
	else
		System.out.println("n la so le");
}
}
