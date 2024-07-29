import java.util.Scanner;

public class dequy1 {
    public static  int Tong(int n){
        if(n==0)
            return 0;
        else
            return n+ Tong(n-1);
    }
    public static void main(String[] args) {

        System.out.println("nhap n" );
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("tong  tu 1 den n la"+ Tong(n) );

    }
}
