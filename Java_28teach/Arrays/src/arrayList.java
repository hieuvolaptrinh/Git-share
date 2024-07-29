import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void Print(Integer[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt( );
        ArrayList<Integer> arr = new ArrayList<>( );
//        arr.add(1 );
//        arr.add(2);
//        arr.add(4);
//        arr.add(7);
//        System.out.println(""+ arr.size() );
//        for(int i=0;i< arr.size( );i++){
//            System.out.print(arr.get(i));
//        }

//        nhập vào araylist bằng cách nhập vào biến tạm sau đó nhét vào arraylisst
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            arr.add(tmp);
        }
        for(int i=0;i< arr.size( );i++){
          System.out.print(arr.get(i)+" ");
      }
//        clear() xóa toàn bộ các phần tử trong arraylist
//        isEmpty() kiểm trA ARRAY LIST RỖNG
//        .contains() kiểm tra phần tử có tồn tại ko
//         thay đổi phần tử ở chỉ số 2 thành 8 arr.set(2,100)
//        remove(2) xóa phần tử có chỉ số là 2
//        indexOf(): trả về chỉ số đầu tiên của mot phần tử xuất hiện trong array list, trả về -1 nếu ko tìm thấy
    }
}
