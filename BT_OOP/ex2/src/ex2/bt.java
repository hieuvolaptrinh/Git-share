package ex2;
import java.util.Scanner;

public class bt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a= new int[10000];
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int duration= sc.nextInt();
        int time=duration;
        for(int i=0;i<n-1;i++){

            if(a[i]+duration<a[i+1]){
                time+=duration;
            }
            else {
                time=time +(a[i+1]-a[i]);
            }
        }
        System.out.println(time);

    }
}
