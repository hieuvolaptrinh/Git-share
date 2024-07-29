import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
public static void  cong(int a, int b){
    double kq= a+b;
    System.out.println(kq);
}
public static void tru(int a,int b){
    double kq=a-b;
    System.out.println(kq);
}
public static void nhan(int a,int b){
    double kq=a*b;
    System.out.println(kq);
}
public static void chia(int a, int b){
    double kq;
    if(b!=0) {
        kq = 1.0 * a / b;
        System.out.println(kq);
    }    else
        System.out.println("không tính toán được");
}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhập số a");
        int a,b;
        a= sc.nextInt();
        System.out.println("nhap só b");
        b=sc.nextInt();
        System.out.println("nhập phép tính cộng trừ nhân chia");
//        phải thêm biến scanner riêng mới đc
        Scanner scString = new Scanner(System.in);
        String pt= scString.nextLine();
        switch (pt){
            case "+":
                cong(a,b);
                break;
            case"-":
                tru(a,b);
                break;
            case" *":
                nhan(a,b);
                break;
            case "/":
                chia(a,b);
                break;
            default :
                System.out.println("phím bấm không hơp lệk");
                break;
        }

    }
}