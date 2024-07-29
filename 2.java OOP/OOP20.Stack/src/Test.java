import java.util.Scanner;
import java.util.Stack;

public class Test {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	Stack<String> stackChuoi = new Stack<String>();
//	vào đầu ra cuối giống như chiếc hộp vậy thôi
//	stackChuoi.push("giatri1"); //đưa giá trị vào stack
//	stackChuoi.pop(); // lấy giá trịra
//	stackChuoi.peek(); // lấy giá trị ra nhưng k xóa khỏi stack
//	stackChuoi.clear(); // xóa tất cả phần tử trong stack
//	stackChuoi.contains("giatri1");//xác định giá trị có  tồn tại trong stack
	
//	ví dụ đảo ngược chuổi
	String s= sc.nextLine();
	for(int i=0;i<s.length();i++) {
		stackChuoi.push(s.charAt(i)+"");
	}
	for(int i=0;i<s.length();i++) {
		System.out.println(stackChuoi.pop());
	}
	
//	ví dụ chuyển 1 số từ tập phân sang hệ nhị phân
	int x=sc.nextInt();
	Stack<Integer> stackSoDu=new Stack<Integer>();
	while(x>0) {
		int soDu = x%2;
		System.out.println(soDu);
		stackSoDu.push(soDu);
		x = x/2;
	}
	System.out.println("Số nhị phân là:");
	int n = stackSoDu.size();
	for(int i=0; i<n;i++) {
		System.out.println(stackSoDu.pop());
	}
	
}
}
