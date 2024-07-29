import java.util.Scanner;
//tính tổng s(n) = -1 +2-3+4-5+6................
public class dequy2 {
    public static  int Tong(int n){
        if(n==1)
            return 0;
        else
            return (int)Math.pow(-1,n)*n + Tong(n-1);
    }
    public static void main(String[] args) {

        System.out.println("nhap n" );
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("tong la"+ Tong(n) );

    }
}
