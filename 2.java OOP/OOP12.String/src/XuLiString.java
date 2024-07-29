import java.util.Scanner;

public class XuLiString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1="hieu";
		String s2="dz";
		String s3= s1+s2;
//		hàm concat => nối chuỗi
		String s4= s1.concat(s2);
		System.out.println(s3);
		
		System.out.println(s4);
		
		
//		replace => thay thế
		String s5="abcde";
		s5=s5.replaceAll("a","123");
		System.out.println(s5);
		
		
		String s7= s3.toLowerCase();
		String s8= s3.toUpperCase();
		System.out.println(s7);
		System.out.println(s8);
		
//		trim()  => xóa khoảng trắng dư thừa ở đầu chuỗi
		String s9="    nhieu dau space";

		System.out.println(s9.trim());
		
//		subString => cắt chuỗi con
		 String  s10="hoc thu 2 thu 3 thu4 thu5 thu 6 thu 7";
		 String s11=s10.substring(10); // cắt từ vị trí thứ 10
		 String s12=s10.substring(10,15); // cắt từ vị trí thứ 10 đến 15
		 
 		
		 System.out.println(s11);
		 System.out.println(s12);
		
	}
}
