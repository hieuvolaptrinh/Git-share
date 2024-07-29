package ctdl_gt.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TT_SX {
//    public static  boolean LinearSearch(ArrayList<Integer> a, int n, int x){
//        for(int i=0;i<n;i++){
//            if(x==a.get(i))
//                return true;
//        }
//        return false;
//    }
    public static boolean binarySearch(int a[], int n, int x ){
        int l=0,r=n-1;
        while(l<=r){
            int m=(r+l)/2;
            if(a[m]==x){
                return true;
            }
            else if(a[m]<x){
                l=m+1;
            }
            else r=m-1;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap so luong phan tu cua mang" );
        int n = sc.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++){
            a[i] =sc.nextInt();
        }
//        System.out.println(binarySearch(a,n,15) );
        System.out.println(Arrays.binarySearch(a,5) );



    }
}
