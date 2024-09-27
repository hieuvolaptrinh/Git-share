package main;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ViDuGhiDoiTuong {
public static void main(String[] args) {
	
	try {
		File file = new File("D:\\CODE\\java\\2.java OOP\\OOP31.SaveObject\\file.data");
		InputStream is= new FileInputStream(file);
		ObjectInputStream ois=new ObjectInputStream(is);
		SinhVien st = (SinhVien) ois.readObject();
		System.out.println(st);		
		ois.close();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
