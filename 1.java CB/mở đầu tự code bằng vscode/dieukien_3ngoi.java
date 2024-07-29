import java.util.Scanner;

public class dieukien_3ngoi {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap 2 so a va b");
        int a, b;
        a= sc.nextInt();
        b= sc.nextInt();
        String kq=(a>=b)?"a lon hon hoac bang b":"a be hon b";
        System.out.print(kq);
    }
    
}
