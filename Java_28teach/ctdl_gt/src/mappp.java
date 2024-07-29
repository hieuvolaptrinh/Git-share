import java.util.HashMap;
import java.util.Scanner;

public class mappp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap <Integer,Integer> map=new HashMap<>(  );

//        put(key, val) Thêm cặp key, value vào map
        map.put(1,2);//(1,2)
        map.put(2,24);//(1,2)(2,24)
        map.put(3,6); //(1,2)(2,24)(3,6)
        map.put(4,2);//(1,2)(2,24)(3,6)(4,2)
        map.put(4,3); //(1,2)(2,24)(3,6)(4,3)

//        size() Trả về kích thước của map
//        isEmpty() Kiểm tra map rỗng
//        clear() Xóa toàn bộ các phần tử trong map
//        containsKey(x) Kiểm tra sự tồn tại của phần tử x trong tập key
//        containsValue(x) Kiểm tra sự tồn tại của phần tử x trong tập value
//        get(x) Trả về value tương ứng với key x
//        remove(x) Xóa cặp phần tử có key là x khỏi map
//        replace(x, y) Thay thế cặp phần tử (x, y)
        System.out.println(map.size() );
        System.out.println(map.get(2) ); // lấy value là 24 của key 2
        System.out.println( "kiểm tra trong map cos cái key nào là 1 hay không :" );
        if(map.containsKey(1))
            System.out.println("có" );
        else
            System.out.println("ko có" );

        System.out.println( "kiểm tra trong map cos có value 6 hay không :" );
        if(map.containsValue(6))
            System.out.println("có" );
        else
            System.out.println("ko có" );

    }
}
