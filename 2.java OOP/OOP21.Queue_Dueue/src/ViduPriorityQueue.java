import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ViduPriorityQueue {
	public static void main(String[] args) {
		Queue danhSachSV = new PriorityQueue();
//		nhận thấy khi in ra có sự sắp xếp
		danhSachSV.offer("TITV 1");
		danhSachSV.offer("Nguyen Van B");
		danhSachSV.offer("Nguyen Van A");
		danhSachSV.offer("TITV 2");
		
		while(true) {
			String ten = (String) danhSachSV.poll();  // => lấy ra và xóa
			if(ten==null) {
				break;
			}
			//peek => lấy ra nhưng không xóa.
			System.out.println(ten);
		}
	}
}