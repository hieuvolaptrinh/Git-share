import java.util.Scanner;
//tính tổng s(n) = -1 +2-3+4-5+6................
public class dequy3 {
    public static  int Gt(int n){
        if(n==1)
            return 1;
        else
            return n*Gt(n-1);
    }
    public static void main(String[] args) {

        System.out.println("nhap n" );
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(n + "giay thua  la"+ Gt(n) );

    }
}
