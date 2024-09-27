package main;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;

public class ViDuXoaFile {
//	xóa file 
	public static void xoaFile(File fx) {
		if (fx.isFile()) {
			System.out.println("đã xóa " + fx.getAbsolutePath());
//			xóa nếu là tập tin
			fx.delete();
		} else if (fx.isDirectory()) {
//			lấy các file con để xóa
			File[] mangCon = fx.listFiles();
			for (File fn : mangCon) {
				xoaFile(fn);
			}

			System.out.println("đã xóa " + fx.getAbsolutePath());
			fx.delete();
		}

	}

	public static void main(String[] args) {
		File f0 = new File("D:\\CODE\\java\\2.java OOP\\OOP27.DeleteFile\\f0");
		File f0_1 = new File("D:\\CODE\\java\\2.java OOP\\OOP27.DeleteFile\\f0_1");
		File f = new File("D:\\CODE\\java\\2.java OOP\\OOP27.DeleteFile\\Vidu.txt");

//	f0.deleteOnExit(); // khoong xoa đc vì thư mục không rỗng
//	f0_1.deleteOnExit();// xóa đc vì là thư mục rỗng
//	f.deleteOnExit();//xóa đc file vidu.txt
//	xoaFile(f0);
//	

//	sử dung class FIle để xóa tập tin và thư mục
		Path p = f0.toPath();
		Path p0_1 = f0_1.toPath();
		Path p_vidu = f.toPath();
		try {
			// Files.deleteIfExists(p0);
			Files.deleteIfExists(p0_1);
			Files.deleteIfExists(p_vidu);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
