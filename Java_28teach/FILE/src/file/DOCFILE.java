/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package file;

import java.io.*;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author hieuvo
 */
public class DOCFILE {

    public static void main(String[] args) {
        try {
            File file = new File("D:\\CODE\\java\\Java_28teach\\FILE\\INPUT.TXT");
            Scanner sc = new Scanner(file);
            String s = sc.nextLine();
            System.out.println(s);

            sc.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }
}
