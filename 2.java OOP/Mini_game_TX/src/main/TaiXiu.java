package main;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/*
 * Một người chơi sẽ có tài khoản. người chơi có quyền đặt số tiền ít hơn hoặc bằng số tiền họ đang có
 * có 3 viên xúc sắc từ 1=>6
 * Có 3 viên xúc xắc. Môi viên xúc có 6 mặt có giá tị từ 1 đến 6.
Mỗi lần lắc sẽ ra một kết quả. Kết quả = giá trị xx1 + giá trị xx2 + giá xx3 1. Nếu tổng = 3 hoặc 18 => Cái ăn hết, người chơi thua.
2. Nếu tổng = (4->10) <-> xỉu => nếu người chơi đặt xỉu thì người chơi thắng, ngược lại thua
3. Nếu tổng = (11-17) <-> tài => nếu người chơi đặt xỉu thì người chơi thắng, ngược lại thua
 */
public class TaiXiu {
	public static void main(String[] args) {
		double taiKhoanNguoiChoi = 5000000;
		int luachon = 1;
		Scanner sc = new Scanner(System.in);
//		định dạng khu vực và tiền tệ
		Locale lc= new  Locale("vi","VN");
//		NumberFormat numf=NumberFormat.getInstance(lc);
		NumberFormat numf=NumberFormat.getCurrencyInstance(lc);
		do {
			System.out.println("_____________________ mời bạn lựa chọn_________________________");
			System.out.println("nhấp (1) để tiếp tục chơi");
			System.out.println("nhấn phím bất kì để thoát");
			luachon = sc.nextInt();
			if (luachon == 1) {
				System.out.println("*****Bắt đầu chơi:");
				System.out.println("tài khoản của bạn có " + numf.format(taiKhoanNguoiChoi)  + " bạn muốn đặt cược bao nhiêu");
				double datCuoc = 0;
				do {
					System.out.println("đặt cược số tiền <= " + numf.format(taiKhoanNguoiChoi));
					datCuoc = sc.nextDouble();

				} while (datCuoc <= 0 || datCuoc > taiKhoanNguoiChoi);

				int luaChon = 0;
				do {
					System.out.println("1 Tài <=> 2 Xỉu");
					luaChon = sc.nextInt();
				} while (luaChon != 1 && luaChon != 2);
//				
//				
//				tung xúc xắc từ 1 đến 6 ramdom
				Random xx1 = new Random();
				Random xx2 = new Random();
				Random xx3 = new Random();

				int giaTri1 = xx1.nextInt(5) + 1;
				int giaTri2 = xx2.nextInt(5) + 1;
				int giaTri3 = xx3.nextInt(5) + 1;

//				tính toán kết quả 
				int kq = giaTri1 + giaTri2 + giaTri3;
				System.out.println("xx1 :" + giaTri1);
				System.out.println("xx2 :" + giaTri2);
				System.out.println("xx3 :" + giaTri3);
				System.out.println("tổng 3 xx là :" + kq);
				if (kq == 3 || kq == 18) {

					System.out.println("nhà cái ăn hết :>>");
					taiKhoanNguoiChoi -= datCuoc;
					System.out.println("số tiền còn lại của bạn là " + numf.format(taiKhoanNguoiChoi));
				} else if (kq >= 4 && kq <= 10) {
					if (luaChon == 1) {
						System.out.println("bạn đã thắng");
						taiKhoanNguoiChoi += datCuoc;
						System.out.println("số tiền của bạn là " + numf.format(taiKhoanNguoiChoi));
					}
					else
					{
						System.out.println("bạn đã thua");
						taiKhoanNguoiChoi -= datCuoc;
						System.out.println("số tiền của bạn là " + numf.format(taiKhoanNguoiChoi));
					}
				}
				else {
					if (luaChon == 2) {
						System.out.println("bạn đã thắng");
						taiKhoanNguoiChoi += datCuoc;
						System.out.println("số tiền của bạn là " +numf.format(taiKhoanNguoiChoi));
					}
					else
					{
						System.out.println("bạn đã thua");
						taiKhoanNguoiChoi -= datCuoc;
						System.out.println("số tiền của bạn là " +numf.format(taiKhoanNguoiChoi));
					}
				}
					
				

			}

		} while (luachon != 1);

	}
}
