import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SAPXEP_array_sort {
    public static void Print(Integer[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt( );
//        int[] a = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt( );
//        }
//        Arrays.sort(a);
//        Print(a,n);
//
//        Arrays.sort(a,2,10);
//        Print(a,n);
        int n = sc.nextInt( );
        Integer[] a = {1, 2, 64, 3, 7, 78, 2, 34, 64, 9};//kiểu dối tượng mới có thể sắp xếp theo cách khác được
        Arrays.sort(a, new Comparator<Integer>( ) {
            @Override
            public int compare(Integer o1, Integer o2) {
//                nếu muốn o1 xuất hiện trước o2 thì trả về  -1
//                muốn o2 xuất hiện sau trong thứ tự xắp xếp thì trả về 1
               if(o1<o2)
                    return -1;
               else
                   return 1;
            }
        }
    );
        for(int x: a){
            System.out.print(a[x] );
        }
}
}
