import java.util.Scanner;
//liệt kê các gía trị xuất hiện trong mảng kèm theo số lần xuất hiện của phần tử đó

public class bt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10000];
        int n = sc.nextInt( );
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt( );
        }
        for (int i = 0; i < n; i++) {
            boolean check = true;

            for (int j = 0; j < i; j++) {
                if ( a[i] == a[j] ) {
                    check = false;
                    break;
                }
            }
      if(check==true){
          int dem = 1;
          for (int j = i+1; j < n;j++) {
              if ( a[i] == a[j] )
                  dem++;
          }
          System.out.println(a[i]+" xuat hien "+dem);
      }

        }
    }
}

