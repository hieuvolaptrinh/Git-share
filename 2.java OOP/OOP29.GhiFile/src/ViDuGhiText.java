import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ViDuGhiText {
public static void main(String[] args) {
//	PrintWriter pw= new PrintWriter(System.out);
	
	try {
		PrintWriter pw = new PrintWriter("D:\\CODE\\java\\2.java OOP\\OOP29.GhiFile\\newFile.txt","utf-8");
		pw.println("XIn chào các bạn");
		pw.printf("123234234234234 "+4);
		Student st= new Student("123", "dxcad");
		pw.flush();
		pw.close();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
