package btcui;

import java.util.Scanner;

public class Btcui {
    public static boolean Sphenic(long n) {
        int res = 0;// đếm số lượng thừa só nguyên tố khác nhau cuart n
        for (int i = 2; i<=Math.sqrt(n); i++){
             int cnt = 0;
            while (n % i == 0) {
                cnt++;
                n = n / i;
            }
        if(cnt>=2){
            return false;
            
        }
        if(cnt!=1){
            res++;
            }
        }
        if(n!=1)
            res++;
        return true;
    }
//số Sphenic (có 3 ước số là số nguyên tố) : là số mà có thể phân tích các thừa số để nhân vào thành nó đều là số nguyên tố
//    ví dụ như 30=2x3x5 , 60 không phải vì 60=2x2x3x5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n;
        n = sc.nextLong();
        System.out.println(Sphenic(n));
    }

}
