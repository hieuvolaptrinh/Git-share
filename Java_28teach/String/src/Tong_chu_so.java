import java.util.Scanner;

public class Tong_chu_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine( );
        int tong = 0;
        for (char x : s.toCharArray( )) {
            if ( Character.isDigit(x) )
                tong += x - '0';
        }
        System.out.println(tong );

    }
}
