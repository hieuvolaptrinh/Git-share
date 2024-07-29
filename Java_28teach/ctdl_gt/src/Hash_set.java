package ctdl_gt.src;

import java.util.HashSet;
import java.util.Scanner;

public class Hash_set {
    //    HashSet
//    LinkedHashSet
//    TreeSet
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        HashSet<Integer> set= new HashSet<>();
//        set.add(100);
//        set.add(2450);
//        set.add(160);
//        set.add(1040);
//        set.add(99);
//        set.add(235);
//        System.out.println("kích thước là "+set.size() );
//        for(int x:set){
//            System.out.print(x+" " );
//        }
        int[] a={1,34,6,3,234,5,756,43};

        for(int x:a){
           set.add(x);
      }
    }
}
