import java.util.Scanner;

public class dequy4 {
    public static void he16(int n){
        if(n==0)
            return;
        else
        {

           long  r= n%16;
            he16(n/16);
           if(r<=9)
               System.out.print(r );
           else System.out.print((char)(55+r) );
        }
    }

    public static void main(String[] args) {
        int n;
        System.out.println("chuyen tu n sang he 16");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt( );
        he16(n);
    }
}
