/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package file;

import java.io.*;
import java.io.*;

/**
 *
 * @author hieuvo
 */
public class GHIFILE {

    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("D:\\CODE\\java\\Java_28teach\\FILE\\INPUT.TXT");
            writer.write("Hoc lap trinh Java");
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
