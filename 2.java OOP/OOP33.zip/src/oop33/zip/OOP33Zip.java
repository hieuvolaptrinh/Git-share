
package oop33.zip;

import java.io.*;
import java.util.zip.*;

public class OOP33Zip {
    public static void main(String[] args) throws IOException {
  String sourceFile = "D:\\CODE\\java\\2.java OOP\\OOP33.zip\\test.txt";
        FileOutputStream fos = new FileOutputStream("D:\\CODE\\java\\2.java OOP\\OOP33.zip\\nen.zip");
        ZipOutputStream zipOut = new ZipOutputStream(fos);
        
        File fileToZip = new File(sourceFile);
        FileInputStream fis = new FileInputStream(fileToZip);
        
        ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
        zipOut.putNextEntry(zipEntry);
        byte[] bytes = new byte[1024];
        int length;
        while((length = fis.read(bytes)) >= 0) {
            zipOut.write(bytes, 0, length);
        }
        
        zipOut.close();
        fis.close();
        fos.close();
    }
    
}
