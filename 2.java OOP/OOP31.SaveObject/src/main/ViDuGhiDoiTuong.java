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
		OutputStream os= new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(os);
		SinhVien st = new SinhVien("001","hieuvo",2005,10);
	
		oos.writeObject(st);
		oos.flush();
		oos.close();
	
	
	
	
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
