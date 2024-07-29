import java.util.Scanner;

public class ep_kieudulieu {
    //(New Type) value; chuyển đổi kiểu dữ liệu cơ bản
    //(New Class) object; chuyển đổi kiểu dữ liệu cho các đối tượng
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a, b;
        boolean c= false;
        System.out.println( !c);
        System.out.println("gia tri phu dinh cua c la "+ !c);
        System.out.println("nhap a va b");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println(a+ " " +b);
        // ép kiểu  ngầm đinh
        float x =a;
        float d=b;
        System.out.println(a+ "==" + b + (a==b));
        System.out.println(x+ " " +d);
        // ép kiểu tường minh
        System.out.println(+(float)a+ " " +(float)b);
        // ép kiểu dữ liêu giữa biến nguyên thủy và đối tượng
        
    }
    
}
