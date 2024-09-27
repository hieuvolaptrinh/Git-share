package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.List;

public class ViDuDocText {
	public static void main(String[] args) {
		/*// Cách 1
		File f = new File("D:\\CODE\\java\\2.java OOP\\OOP30.ReadFile\\newFile.txt");
//	Path p = new Path("D:\\CODE\\java\\2.java OOP\\OOP30.ReadFile\\newFile.txt");
		try {
			BufferedReader br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
			String line = null;
			while (true) {
				line = br.readLine();
				if (line == null) {
					break;
				} else
					System.out.println(line);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
//		cách 2
		File f2 = new File("D:\\CODE\\java\\2.java OOP\\OOP30.ReadFile\\newFile.txt");
		try {
			List<String> allText= Files.readAllLines(f2.toPath(),StandardCharsets.UTF_8);
			
			for (String line: allText) {
				System.out.println(line);
			}
		
		} catch (Exception e) {
			// TODO: handle exception
				e.printStackTrace();
		}
		
			
		
	}
}
