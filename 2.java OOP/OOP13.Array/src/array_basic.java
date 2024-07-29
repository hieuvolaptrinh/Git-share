import java.util.Arrays;

public class array_basic {
	public static void main(String[] args) {
		int[] ar1 = { 1, 2, 3 };
//	copy mảng 
		int [] ar2= ar1;
		ar2[2]=100;
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar2));
//dùng hàm clone
		int [] ar3= ar1.clone();
		ar3[1]=100;
		System.out.println(Arrays.toString(ar3));
//	arraycopy
		int[] ar4 = new int[ar1.length];
		System.arraycopy(ar1, 0, ar4, 0, ar1.length);
		System.out.println(Arrays.toString(ar4));
	
	
	}
}
