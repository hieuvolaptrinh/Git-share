import java.util.Iterator;
import java.util.Scanner;

public class Vidu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Nhập vào chuỗi: ");
		s = sc.nextLine();
		System.out.println("------");

		// Hàm length() => lấy độ dài chuỗi
		System.out.println(s.length());
		int doDai = s.length();

//		charAt() lấy kí tự từ vị trí bất kì
		for (int i = 0; i < doDai; i++) {
			System.out.println("vi tri " + i + " la " + s.charAt(i));
		}
//	getChars(vị tri bat dau, vị trí kết thúc, mảng lưu dữ liệu, vị trí bắt đầu lưu dữ liệu
		char[] arrChar = new char[13];
		s.getChars(2, 5, arrChar, 0);
		for (int i = 0; i < arrChar.length; i++) {
			System.out.println("vi tri " + i + " la " + arrChar[i]);
		}
		byte[] arrBytes= s.getBytes();
for(byte x: arrBytes) {
	System.out.println(x);
}
	}
}
