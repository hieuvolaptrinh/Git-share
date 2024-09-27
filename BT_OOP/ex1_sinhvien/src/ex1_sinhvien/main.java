/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1_sinhvien;

import java.util.Scanner;

/**
 *
 * @author hieuvo
 */
public class main {

    public main() {
        Scanner sc = new Scanner(System.in);
        Student[] sv = new Student[111];
        System.out.println("nhập số lượng sinh viên"); 
        int n= sc.nextInt();
        for (int i=0;i<n;i++){
        sv[i]= getStudentInfor();
        }
    }

    public static Student getStudentInfor() {
Scanner sc = new Scanner(System.in);
        String id, fullName, phoneNum, email, address;
        
        float fee;
        System.out.println("nhập id ");
        id = sc.nextLine();
        System.out.println("nhâp tên");
        fullName = sc.nextLine();
        System.out.println("nhập địa chỉ ");
        address = sc.nextLine();
        System.out.println("nhâp emai");
        email = sc.nextLine();
        System.out.println("nhập số điện thoai");
        phoneNum = sc.nextLine();
        System.out.println("nhập học phí ");
        fee = sc.nextFloat();
        Student sv = new Student(id, fullName, email, address, phoneNum, fee);
        return sv;

    }

}
