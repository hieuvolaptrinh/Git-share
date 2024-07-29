import java.util.Scanner;
public class pt_bac_2 {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        double a,b,c,dental,x1,x2;
        System.out.println("nhan he so a, b ,c ");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        dental= Math.pow(b,2) - 4*a*c;
        if(dental > 0){
            x1=(-b-Math.sqrt(dental))/(2*a);
            x2=(-b + Math.sqrt(dental))/ (2*a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        else if( dental==0)
            System.out.println("nghiem kep "+ (-b/(2*a)));
        else
            System.out.println("vo nghiem");
    }
}