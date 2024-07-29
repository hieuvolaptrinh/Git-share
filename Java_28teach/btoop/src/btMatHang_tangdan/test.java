package btoop.src.btMatHang_tangdan;

import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt( );
        ArrayList<MatHang> arr = new ArrayList<>( );
        for (int i = 0; i < n; i++) {
            sc.nextLine( );
            MatHang mh = new MatHang(i + 1, sc.nextLine( ), sc.nextLine( ), sc.nextInt( ), sc.nextInt( ));
            arr.add(mh);
        }
        Collections.sort(arr, new Comparator<MatHang>( ) {
            @Override
            public int compare(MatHang o1, MatHang o2) {
//                if ( o1.getLoiNhuan( ) < o2.getLoiNhuan( ) )
//                    return -1;
//                else
//                    return 1;
                if ( o1.getLoiNhuan( ) != o2.getLoiNhuan( ) )
                    return o1.getLoiNhuan( ) - o2.getLoiNhuan( );
                else
                    return o1.getMa().compareTo(o2.getMa( )) ;
            }
        });
        for (MatHang x : arr) {
            System.out.println(x);
        }
//     6
//Ca phe
//Thung
//388000
//492000
//Dep
//Thung
//376000
//495000
//Giay Nguoi Lon
//Cai
//389000
//580000
//Giay Nguoi Lon
//Thung
//383000
//503000
//Dep
//Thung
//484066
//647000
//Vay Nu
//Cai
//366000
//516000
    }
}
