import java.util.Scanner;
import java.util.StringTokenizer;

public class Lop_StringTokenizer {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
//         sử dụng lớp này mình có thể thêm, sửa , xóa các thứ ở trong java
        String s="ngon ngu lap tring JaVa";
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        System.out.println(sb );
    }
}
