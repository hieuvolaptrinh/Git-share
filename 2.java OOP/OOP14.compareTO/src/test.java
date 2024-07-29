import java.util.*;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		SinhVien[] sv = new SinhVien[n];
		for (int i = 0; i < n; i++) {
			int masv = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			String lop = sc.nextLine();
			double diem = sc.nextInt();
			sv[i] = new SinhVien(masv, name, lop, diem);
		}
//	SinhVien sv1=new SinhVien(123,"hieuvo", "lop 123",10);
//	SinhVien sv2=new SinhVien(124,"hieuvo2", "lop 123",9);

//	for(int i=0;i<n;i++) {
//		for(int j=i+1;j<n;j++) {
//		if(sv[i].compareTo(sv[j])>0) {
//			SinhVien tg=sv[i];
//			sv[i]=sv[j];
//			sv[j]=tg;
//			
//		}
//		}
//	}
		Arrays.sort(sv, new Comparator<SinhVien>() {
			@Override
			public int compare(SinhVien o1, SinhVien o2) {

				return o1.getTen().compareTo(o2.getTen());
			}

		});
//	
		for (SinhVien x : sv) {
			System.out.println(x.toString());
		}

//	3
//	123
//	hieu dz
//	lop12
//	10
//	1234
//	hau
//	lop123
//	12
//	000
//	baole
//	lop12
//	9

	}
}
