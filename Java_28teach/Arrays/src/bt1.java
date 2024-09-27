import java.util.Scanner;
//liệt kê các giá trị khác nhau

public class bt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10000];
        int n = sc.nextInt( );
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt( );
        }
        for (int i = 0; i < n; i++) {
            boolean seen = false;
            for (int j = 0; j < i; j++) {
                if ( a[i] == a[j] ) {
                    seen = true;
                    break;
                }
            }
            if ( seen == false )
                System.out.println(a[i]);
        }
    }
}
