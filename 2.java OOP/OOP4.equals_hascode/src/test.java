
public class test {
public static void main(String[] args) {
	MyDate md1= new MyDate(19,10,2005);
	MyDate md2= new MyDate(19,10,2005);
	MyDate md3= new MyDate(9,7,2035);
	
	System.out.println(md1);
	System.out.println(md2);
	System.out.println(md3);
//	int a=5,b=6;
//	if (a==b) {
//		System.out.println("a=b");
//	} else {
//		System.out.println("a!=b");
//	}
	
//	if(md1==mb2) {
//		System.out.println("md1 = md2");
//	}
////	nhận thấy không thể so sánh như bình thường được
//	else {
//		System.out.println("md1!=md2");
//	}
//	
	System.out.println("md1 so sánh với md2 là "+md1.equals(md2));
	System.out.println("md1 so sánh với md2 là "+md1.equals(md3));
	
//	hascode của từng đối tượng
	System.out.println("hascode của md 1 là "+md1.hashCode());
	System.out.println("hascode của md2 là "+md2.hashCode());
	System.out.println("hascode của md 3 là "+md3.hashCode());
}
}
