import java.util.Scanner;
public class lamtron_cv_dtich {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        double r,dt;
        System.out.println(" nhap ban kinh hinh tron");
        r= sc.nextDouble();
        dt= Math.PI*Math.pow(r,2);
        System.out.println("dien tich la "+Math.round(dt*100.0)/100.0);
    }
    
}
