import java.util.Scanner;

public class day03_nhap {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap vao ho va ten");
        String hoten=sc.nextLine();
        System.out.println("nhap ma sinh vien");
        long masv=sc.nextLong();
        System.out.println("nhap vao diem thi");
        float diem=sc.nextFloat();
        System.out.println("---------------------");
        System.out.println("ho va ten " +hoten);
        System.out.println("ma sinh vien " + masv + " diem so la" +diem);    
    }
}
// nextBoolear() docjd một giá trị boolean từ bàn phím
// nextByte() đọc một giá trị byte từ bàn phím
// nextDouble() đọc một giá trị double từ bàn phím
// nextFloat() đọc một giá trị float từ bàn phím
// nextInt() đọc một giá trị int từ bàn phím
// nextLine() đọc một giá trị String từ bàn phím
// nextLong() đọc một giá trị long từ bàn phím
// nextShort() đọc một giá trị short từ bàn phím