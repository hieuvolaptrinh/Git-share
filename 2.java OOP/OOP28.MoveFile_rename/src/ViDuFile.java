import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class ViDuFile {
//	viết lại hàm copy all
	public static void copyAll(File f1, File f2) {
		try {
			// Copy ban than no
			Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(f1.isDirectory()){
			// Copy cac tap tin va thu muc con
			File[] mangCon = f1.listFiles();
			for (File file : mangCon) {
				File file_new = new File(f2.getAbsoluteFile()+"/"+file.getName());
				copyAll(file, file_new);
			}
		}
	}
	
	
public static void main(String[] args) {
	File f1= new File("D:\\CODE\\java\\2.java OOP\\OOP28.MoveFile_rename\\File_1.txt");
	File f2= new File("D:\\CODE\\java\\2.java OOP\\OOP28.MoveFile_rename\\File_2.txt");
	File f3= new File("D:\\CODE\\java\\2.java OOP\\OOP28.MoveFile_rename\\File_2xyzx.txt");
//	đổi tên file 1 thành file 2
//	f1.renameTo(f2);
	
//	sử dụng File để thay đổi tên
//	path
//	Files.move(...): Phương thức move của lớp Files di chuyển hoặc đổi tên tệp từ vị trí nguồn đến vị trí đích.
//	try {
//		Files.move(f2.toPath(), f3.toPath(), StandardCopyOption.REPLACE_EXISTING);
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	2.di chuyển file 
//	File f3_new= new File("D:\\CODE\\java\\2.java OOP\\OOP28.MoveFile_rename\\f0\\File_2xyzx.txt");
//
//	try {
//		Files.move(f3.toPath(), f3_new.toPath(), StandardCopyOption.REPLACE_EXISTING);
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	
	
	File f_nocopy=new File("D:\\CODE\\java\\2.java OOP\\OOP28.MoveFile_rename\\f0");
	File f_copy=new File("D:\\CODE\\java\\2.java OOP\\OOP28.MoveFile_rename\\f0_copy");
	
	try {
		Files.copy(f_nocopy.toPath(), f_copy.toPath(), StandardCopyOption.REPLACE_EXISTING);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	ViDuFile.copyAll(f_nocopy, f_copy);
}
}
