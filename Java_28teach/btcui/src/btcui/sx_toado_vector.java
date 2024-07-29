package btcui;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// pari<int ,int>
//cho n điểm tọa độ Oxy, sắp xêếp các điểm theo hoành độ tăng dân, nếu có  cùng hoành thì sắp xếp theo tung
public class sx_toado_vector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt( );
        Integer[][] a = new Integer[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt( );
            a[i][1] = sc.nextInt( );
        }

        Arrays.sort(a, new Comparator<Integer[]>( ) {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                if ( o1[0] != o2[0] )
                    return o1[0] - o2[0];// sắp xếp theo hoành độ tăng dần
                else
                    return o2[1]-o2[1];
            }
        });
        for (int i = 0; i < n; i++) {
            System.out.println(a[i][0] + " " + a[i][1]);
        }
    }
}
