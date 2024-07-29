package SXHocSinh;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt( );
        ArrayList<HocSinh> arr = new ArrayList<>( );
        for (int i = 0; i < n; i++) {
            sc.nextLine( );
            String name = sc.nextLine( );
            double[] tmp = new double[10];
            for (int j = 0; j < 10; j++) {
                tmp[j] = sc.nextDouble( );

            }
            HocSinh hs = new HocSinh(i + 1, name, tmp);
            arr.add(hs);
        }
//        sap xep tong diem tb giam dan, nếu bằng thì mã
        Collections.sort(arr, new Comparator<HocSinh>( ) {
            @Override
            public int compare(HocSinh o1, HocSinh o2) {
                if ( o1.getTrungBinh( ) < o2.getTrungBinh( ) )
                    return 1;
                else
                    return -1;// vì nó  trả inteher mà nêu trừ thì double nên mình ghi t-1 với 1 cho nhanh
            }


        });
        for (HocSinh hs : arr) {
            System.out.println(hs.toString( ));
        }


//        3
//        hieu
//        10 01 20 6.4 10 10 10 10 10 10
//         Phan Van Nam
//           8.2 6.4 8.3 2.3 8.3 2.9 8.7 7.1 9.4
//        le
//        1
//        2
//        3
//        4
//        5
//        6
//        7
//        8
//        9
//        10
    }
}
