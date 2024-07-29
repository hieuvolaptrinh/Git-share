package String.src;

import java.util.Scanner;
import java.util.StringTokenizer;

public class tach_tu_StringTokenizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= "Hieu   vo Dai hoc    spkt";
        StringTokenizer st = new StringTokenizer(s);
//        hỗ trợ tách từng từ
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken() );
        }
    }
}
