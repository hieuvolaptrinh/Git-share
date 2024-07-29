import java.util.Scanner;

public class Tim_Chuoi {
	public static void main(String[] args) {
		String s1 = "xin chào cac bạn, xin chào cô chú, xin chào!";
		String s2 = "xin chào";
		String s3 = "xin chaop 123";
		Scanner sc = new Scanner(System.in);
//	hàm indexOf
		System.out.println("vị trí chuỗi s2 nằm trong chuỗi s1 là " + s1.indexOf(s2)); // trả về vị trí bắt đầu của
																						// chuỗi thứ 2 trong chuỗi s1
		System.out.println("vị trí chuỗi s3 nằm trong chuỗi s1 là " + s1.indexOf(s3)); // trả về -1 là không timf thấy
																						// trong chuỗi

//	sử dụng vị trí bắt đầu
		System.out.println("vị trí chuỗi s2 nằm trong chuỗi s1 là " + s1.indexOf(s2,2));  // trả về vị trí bắt đầu của chuỗi s2 trong chuỗi s1 từ vị trí thứ 2		
		System.out.println("vị trí chữ 'i' nằm trong chuỗi s1 là " +s1.indexOf('i'));
	
	
//	lastIndexof : tìm kiếm từ phải sang trái
		System.out.println("vị trí chuỗi s2 nằm trong chuỗi s1 ( từ phải sang  trái) là " +s1.lastIndexOf(s2));
	
	
	
	}
}
