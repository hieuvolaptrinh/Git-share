import java.util.Arrays;

public class Test {
	public static int [] reverse(int[] x) {
		int [] rs= new int[x.length];
		int index=0;
		for(int i=x.length-1;i>=0;i--) {
			rs[index]=x[i];
			index++;
		}
		return rs;
		
		
	}
public static void main(String[] args) {
	int[] a =new int[] {1,2,3,4,35,34,5,46,6};
	int [] b =new int [15];

	System.out.println("mảng a ban ddaaauf "+Arrays.toString(a));
	Arrays.sort(a);
	System.out.println("mảng a sau khi sắp xếp tăng dần "+Arrays.toString(a));
//	sắp xếp giảm dần
	
	
//tìm kiếm
	System.out.println(Arrays.binarySearch(a, 3));
	System.out.println(Arrays.binarySearch(a,5));

	
//	hàm tìm giá trị
	Arrays.fill(b, 5);
	System.out.println("mảng b sau khi điền giá trị là "+ Arrays.toString(b));
	a=Test.reverse(a);
	System.out.println("mảng a sắp xếp giảm dần là "+ Arrays.toString(a));
	
	
}
}
