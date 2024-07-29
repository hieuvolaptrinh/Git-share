package String.src;

import java.math.BigInteger;
import java.util.Scanner;

public class Big_Integer {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        BigInteger a= new BigInteger("24534534523423434234234");
        BigInteger b = new BigInteger("123464564645656");
        System.out.println(a.add(b) ); // cộng
        System.out.println(a.subtract(b) ); //truwf
        System.out.println(a.multiply(b) ); // nhân
        System.out.println(a.divide( b) ); // chia
    }
}
