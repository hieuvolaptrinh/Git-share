import java.util.Arrays;

public class test {
public static void main(String[] args) {
	String s="hieu voo  asd asd ht sdf   d";
	String[] a=s.split(" ");
	System.out.println(Arrays.toString(a));
//	cắt theo dấu ,
	String [] b= s.split(",");
	System.out.println(Arrays.toString(b));
	
	String s2= "day, là , hieu. oke !";
	String[] c= s2.split("\\,|\\.");
	System.out.println(Arrays.toString(c));
}
}
