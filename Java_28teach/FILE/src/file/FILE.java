
import java.io.*;


public class FILE {

    public static void main(String[] args) {
        File file = new File("D:\\CODE\\java\\Java_28teach\\FILE\\INPUT.TXT");
        try {
            if (file.createNewFile()) {
                System.out.println("File vua duoc tao");
            } else {
                System.out.println("File da ton tai");
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }}
