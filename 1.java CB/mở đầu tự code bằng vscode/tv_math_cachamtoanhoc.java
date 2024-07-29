import java.util.Scanner;

public class tv_math_cachamtoanhoc {
    public static void main(String[] args  ){
        Scanner sc= new Scanner(System.in);
        float a,b;
        a=sc.nextFloat();
        // b=sc.nextFloat();
        //
        System.out.println("|a| = "+Math.abs(a) );// trị tuyệt đối
        System.out.println("min "+Math.min(a,b));// min
        System.out.println("min "+Math.max(a,b));// max
        System.out.println("min "+Math.ceil(a));// ceil làm tròn lớn vd 9.5=10
        System.out.println(Math.floor(a));// làm tròn nhỏ xuống
        System.out.println(Math.round(a));// làm tròn bt
    }
}