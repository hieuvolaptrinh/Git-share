package file;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class bt {
 public static boolean nt(int n) {
     if (n <= 1) {
            return false; // 1 and less are not prime
        }
       for(int i=2; i<=Math.sqrt(n);i++){
           if(n%i==0)
            return false;
       }
     return true;
     
    
     
    }
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("D:\\CODE\\java\\Java_28teach\\FILE\\xuatdl.txt", true);
//            Khi bạn sử dụng true ở đây, nội dung mới sẽ được thêm vào cuối file hiện có. Nếu file chưa tồn tại, nó sẽ được tạo mới

            File file = new File("D:\\CODE\\java\\Java_28teach\\FILE\\laydl.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {

                int n = sc.nextInt();
                if (nt(n)) {
                    writer.write(n + " ");
                }
            }
            writer.close();
            sc.close();

        } catch (IOException ex) {
            Logger.getLogger(bt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   }
