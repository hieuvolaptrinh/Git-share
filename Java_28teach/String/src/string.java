import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        int n=sc.nextInt();
//        sẽ bị trôi lệnh
//        sc.nextInt();
        String s="hieuvo";
//        System.out.println(n);
        System.out.println(s );
       for (int i=0 ;i<s.length();i++){
           System.out.println(s.charAt(i) );
       }
//       không sử dụng được for each, nếu muốn thì phải chuyển nó thành mảng
        for(char x: s.toCharArray()){
            System.out.println(x );
        }
        s= s.toUpperCase(  );
        System.out.println(s );
        s= s.toLowerCase(  );
        System.out.println(s );
// nối 2 xâu vào với nhau
         String d="deptrai";
         s=s.concat(d)+ " okeee";
        System.out.println(s );
    }
}
