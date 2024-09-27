package main;

import java.io.File;
import java.io.IOException;

public class ViDuTaoTapTinVaThuMuc {
public static void main(String[] args) {
	// Lưu ý:
			// MS Windows: \ => \\ | Ví dụ: "C:\\Thu muc 1\\Thuc muc\\Ten tap tin.xxx";
			// Linux, MacOS: / | Ví dụ: /Thu muc 1/Thuc muc 2 /Ten tap tin.xxx"
	
//	kiểm tra thư mục hoạc tập tin có tồn tại hay chưa
	File folder1= new File("D:\\CODE\\java\\2.java OOP\\OOP25.taoFile");
	File folder2= new File("D:\\CODE\\java\\2.java OOP\\abc");
	System.out.println("kiểm tra thư mục hoạc tập tin có tồn tại hay chưa"+ 	folder1.exists());//true
	System.out.println("kiểm tra thư mục hoạc tập tin có tồn tại hay chưa"+ 	folder2.exists());//false\
	
	
//	tạo thư mục
//	phương thứ mkdir()
	File d1= new File("D:\\CODE\\java\\2.java OOP\\OOP25.taoFile\\Directory_1");
	d1.mkdir();
//	tạo ra nhiều thư mục mkdirs()
	File d2= new File("D:\\CODE\\java\\2.java OOP\\OOP25.taoFile\\Directory_1\\a\\b\\c\\d");
	d1.mkdirs();
	
// tạo tập tin ( có phần mở rộng exe,.txt,.doc
	File file1= new File("D:\\\\CODE\\\\java\\\\2.java OOP\\\\OOP25.taoFile\\vidu.txt");
	try {
		file1.createNewFile();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	






}
}
