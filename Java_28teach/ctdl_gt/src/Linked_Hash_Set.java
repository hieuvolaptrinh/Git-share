import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class Linked_Hash_Set {
    //    HashSet
//    LinkedHashSet
//    TreeSet
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        LinkedHashSet<Integer> set= new LinkedHashSet<>();
//        int[] a={1,34,6,3,234,5,756,43};
//
//        for(int x:a){
//            set.add(x);
//        }
//        System.out.println("kích thước là "+set.size() );
//        for(int x:set){
//            System.out.print(x+" " );
//        }


//        bài tập in ra các giá trị xuất hiện trong mảng, mỗi giá trị in ra 1 lần sử dụng hashset
        System.out.println("nhập số lượng phần tử" );
        int n=sc.nextInt();
        for(int i=1;i<n;i++){
            int tmp= sc.nextInt();
            set.add(tmp);
        }
        for (int x: set){
            System.out.print(x+" " );
        }
    }
}
