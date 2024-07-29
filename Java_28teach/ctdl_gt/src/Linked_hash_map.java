import java.util.*;

public class Linked_hash_map {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
//        put(key, val) Thêm cặp key, value vào map
        map.put(1, 2);//(1,2)
        map.put(2, 24);//(1,2)(2,24)
        map.put(3, 6);
        map.put(4, 2); // mỗi phần tử trong map người ta gọi nó là cái Entry
//        để duyệt từng phần tử thì mình sẽ lấy entry của map bằng hàm ; entrySet();
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet( ); // trả về một cái set chứa các cái entry
        for (Map.Entry<Integer, Integer> entry : entrySet) {
//            entry.getKey()
//            entry.getValue()
            System.out.println(entry.getKey() + " "+entry.getValue() );
        }
    }
}
