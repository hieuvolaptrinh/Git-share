import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class tan_xuat_XH_MAP {

        public static void main(String[] args) {
            String s = "28tech28te";
            TreeMap<Character, Integer> map = new TreeMap<>();
            for(char x : s.toCharArray()){
                if(map.containsKey(x)){
                    map.put(x, map.get(x) + 1);
                }
                else map.put(x, 1);
            }
            Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
            for(Map.Entry<Character, Integer> entry : entrySet){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }

}
