
import java.util.Scanner;

public class fibo {

    public static boolean fibo(long n) {

        if (n == 0 || n == 1) {
            return true;
        }
        long f1 = 0, f2 = 1;
        for (int i = 2; i <= 92; i++) {
            
            long fn = f1 + f2;
            System.out.println(fn);
            if (fn == n) {
                return true;
            }
            f1 = f2;
            f2 = fn;
            
        }
        return false;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong();
        System.out.println(fibo(34));
    }
}
