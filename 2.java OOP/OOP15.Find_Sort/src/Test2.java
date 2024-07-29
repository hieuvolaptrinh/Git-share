import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SinhVien sv1 = new SinhVien(123, "hieuvo", "lop 123", 10);
		SinhVien sv2 = new SinhVien(124, "hoang", "lop 123", 9);
		SinhVien sv3 = new SinhVien(124, "tam", "lop 123", 9);
		SinhVien sv4 = new SinhVien(124, "tam", "lop 123", 9);

		SinhVien[] a_sv = new SinhVien[] { sv1, sv2, sv3 };

		System.out.println("ban đầu : " + Arrays.toString(a_sv));

//sau khi sắp xếp
		Arrays.sort(a_sv);
		System.out.println("sau khi sắp xếp " + Arrays.toString(a_sv));

//	tìm kiếm đối tượng trong mảng
		System.out.println("tìm kiếm đối tượng sv 1 trong mảng :" + Arrays.binarySearch(a_sv, sv1));

		System.out.println("tìm kiếm đối tượng sv 4 trong mảng :" + Arrays.binarySearch(a_sv, sv4));
	}
}