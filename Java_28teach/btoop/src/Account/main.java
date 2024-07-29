package btoop.src.Account;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt( );
        sc.nextLine( ); // Đọc dòng mới
        Account[] accountsList = new Account[n];
        // Nhập danh sách tài khoản
        for (int i = 0; i < n; i++) {
            accountsList[i] = new Account(sc.nextLine( ), sc.nextLine( ), sc.nextLine( ), sc.nextLine( ));
        }
        // Nhập danh sách tài khoản cần kiểm tra
        int q = sc.nextInt( );
        sc.nextLine( ); // Đọc dòng mới
        for (int i = 0; i < q; i++) {
            System.out.println("Nhập tài khoản thứ " + (i + 1) + " : ");
            String username = sc.nextLine( );
            System.out.println("Nhập mật khẩu thứ " + (i + 1) + " : ");
            String password = sc.nextLine( );
            boolean check = false;

            // Kiểm tra tài khoản và mật khẩu
            for (int j = 0; j < n; j++) {
                if ( accountsList[j].checkLogin(username, password) ) {
                    check = true;
                    break; // Dừng lại khi tìm thấy tài khoản đúng
                }
            }
            // Xuất kết quả
            if ( check ) {
                System.out.println(username + " " + password + " : chính xác");
            } else {
                System.out.println(username + " " + password + " : không chính xác");
            }
        }
//2
//346sds
//cus082
//28tech
//28tech123xyz
//122clo
//cus809
//nguyenmy
//my123456
//1
//28tech
//28tech123xyz
    }
}