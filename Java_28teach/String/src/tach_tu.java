import java.util.Arrays;
import java.util.Scanner;

public class tach_tu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = "ngon    ngu lap   trinh java";

        String[] a = s.split("\\s+");// nghĩa là mình tách theo dấu cách
//        split(" ") chỉ đúng khi tách theo dấu cách

        Arrays.sort(a); // sắp xếp từ theo thứ tự từ điển
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        s = s.replace("n", "@@@"); // thay thế kí tự n thành chữ @@@
        System.out.println(s);
        String b = "hieu.vo.dep.trai";
//        ví dụ muốn tách , . / ' ./ \\
        b = s.replace(".", " ");
        System.out.println(a );

    }
}
