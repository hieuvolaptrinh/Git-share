package oopSX;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;

public class test {
    public static void main(String[] args) {
//        tạo danh sách sản phẩm
        ArrayList<SanPham> ds = new ArrayList<>( );
//        khời tạo các đối tượng sản phẩm
        SanPham sp1 = new SanPham(1, "sámung", 1234);
        SanPham sp2 = new SanPham(2, "nokida", 89934234);
        SanPham sp3 = new SanPham(3, "iphonre", 1212334);
// add sản phẩm vào list
        ds.add(sp1);
        ds.add(sp2);
        ds.add(sp3);
        for (SanPham sp : ds) {
            System.out.println(sp);
        }
//        gọi phương thức sắp xếp
        Collections.sort(ds);
        System.out.println("danh sách sau sắp xếp là" );
        for (SanPham sp : ds) {
            System.out.println(sp);
        }
    }
}
