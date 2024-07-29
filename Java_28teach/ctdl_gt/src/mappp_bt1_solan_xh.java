package ctdl_gt.src;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

//cho một mảng, liệt kê các phần tử từ nhỏ đến lớn kèm theo só lần xuất hiện của nó
public class mappp_bt1_solan_xh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>( );

        System.out.println("nhập số phần tử");
        int n = sc.nextInt( ); // key giá trị value tầ xuất
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt( );
            if ( map.containsKey(a[i]) ) {
                int tanSuat = map.get(a[i]);
                tanSuat++;
                map.put(a[i], tanSuat);
            } else {
                map.put(a[i], 1);
            }
        }
        Arrays.sort(a);
       for (int i = 0; i < n; i++){
           if(map.containsKey(a[i])){
               System.out.println(a[i]+" "+map.get(a[i]) );
               map.remove(a[i]);
           }
       }
    }
}
