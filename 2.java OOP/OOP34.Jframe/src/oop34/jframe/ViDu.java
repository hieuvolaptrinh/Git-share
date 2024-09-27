/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop34.jframe;

import javax.swing.JFrame;

/**
 *
 * @author hieuvo
 */
public class ViDu {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		// Gắn tên
		jf.setTitle("Vi Du JFrame");
		// Gán kích cỡ
		jf.setSize(600, 400);
		
//		while(true) {
//			System.out.println("Chương trình đang chạy!");
//		}
		
		// Gán vị trí hiển thị
		jf.setLocation(300, 300);
		
		// Thoát ra khỏi chương trình khi đóng cửa sổ JFrame
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Cho phép hiển thị
		jf.setVisible(true);
	}
}