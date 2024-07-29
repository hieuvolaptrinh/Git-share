import java.util.Scanner;

public class chien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,x;
        System.out.println("Nhap so phan tu cua mang: ");       
        n= sc.nextInt();
        int[] arr = new int[n];
    
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Nhap phan tu thu " + i + ": ");
            arr[i]=sc.nextInt();
            }
        

        // danh sách số nguyên tố
        System.out.println("Số nguyên tố trong mảng là: " );
 
        for(int i = 0; i < arr.length; i++) {
            {
                if(check(arr[i])==true) {
                  
                  
                   System.out.println(arr[i]);
                }
            }
        }

        System.out.println("nhập số cần tìm gần nhất với số nguyên tố trong mảng");
        x=sc.nextInt();
        int min=99999;
        for(int i = 0; i < arr.length; i++) {
            if(Math.abs(arr[i]-x)<min && check(arr[i])==true && Math.abs(arr[i]-x)!=0)
            {
              
                     min=Math.abs(arr[i]-x);
            }
        }
        System.out.println(min);
        for(int i = 0; i < arr.length; i++) {
            if(Math.abs(arr[i]-x)==min && check(arr[i])==true)
            {
                System.out.println("Số nguyên tố gần nhất với số cần tìm là: "+arr[i]);
            }
        }
    }
     // check so nguyen to
     public static boolean check(int n) {
        
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

        

