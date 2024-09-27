import java.util.Scanner;

public class bai2167 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10000];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int time = 0;

        int l = 0, r = n - 1;


        while (true) {
            if (a[l] == 1) {
                time++;
                l++;
            }
            if (a[r] == 1) {
                time++;
                r--;
            }
            if (a[r] == 0 && a[l] == 0) {
                break;
            }


        }
        for (int i = l; i <= r; i++) {
            if (a[i] == 1) {
                time = time + 2;
            }
        }
        System.out.println(time);

    }
}
