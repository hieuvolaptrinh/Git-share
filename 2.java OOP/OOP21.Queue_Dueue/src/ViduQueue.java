import java.util.LinkedList;
import java.util.Queue;

public class ViduQueue {
	public static void main(String[] args) {
		Queue<String> danhSachSV = new LinkedList<String>();
		danhSachSV.offer("hieu1");
		danhSachSV.offer("hieu2");
		danhSachSV.offer("hieu3");
		
		while(true) {
			String ten = danhSachSV.poll();  // => lấy ra và xóa
			if(ten==null) {
				break;
			}
			//peek => lấy ra nhưng không xóa.
			System.out.println(ten);
		}
	}
}
//Queue (Hàng đợi)
//add(E e): Thêm phần tử e vào hàng đợi. Nếu hàng đợi đầy, ném ra ngoại lệ IllegalStateException.
//offer(E e): Thêm phần tử e vào hàng đợi. Trả về true nếu thêm thành công, false nếu không.
//remove(): Lấy và xóa phần tử đầu tiên của hàng đợi. Ném ra ngoại lệ NoSuchElementException nếu hàng đợi rỗng.
//poll(): Lấy và xóa phần tử đầu tiên của hàng đợi. Trả về null nếu hàng đợi rỗng.
//element(): Lấy nhưng không xóa phần tử đầu tiên của hàng đợi. Ném ra ngoại lệ NoSuchElementException nếu hàng đợi rỗng.
//peek(): Lấy nhưng không xóa phần tử đầu tiên của hàng đợi. Trả về null nếu hàng đợi rỗng.
//Deque (Hàng đợi hai đầu)
//Deque kế thừa từ Queue và cung cấp thêm các phương thức để làm việc với hai đầu của hàng đợi:
//
//addFirst(E e): Thêm phần tử e vào đầu hàng đợi.
//addLast(E e): Thêm phần tử e vào cuối hàng đợi.
//offerFirst(E e): Thêm phần tử e vào đầu hàng đợi. Trả về true nếu thêm thành công, false nếu không.
//offerLast(E e): Thêm phần tử e vào cuối hàng đợi. Trả về true nếu thêm thành công, false nếu không.
//removeFirst(): Lấy và xóa phần tử đầu tiên của hàng đợi. Ném ra ngoại lệ NoSuchElementException nếu hàng đợi rỗng.
//removeLast(): Lấy và xóa phần tử cuối cùng của hàng đợi. Ném ra ngoại lệ NoSuchElementException nếu hàng đợi rỗng.
//pollFirst(): Lấy và xóa phần tử đầu tiên của hàng đợi. Trả về null nếu hàng đợi rỗng.
//pollLast(): Lấy và xóa phần tử cuối cùng của hàng đợi. Trả về null nếu hàng đợi rỗng.
//getFirst(): Lấy nhưng không xóa phần tử đầu tiên của hàng đợi. Ném ra ngoại lệ NoSuchElementException nếu hàng đợi rỗng.
//getLast(): Lấy nhưng không xóa phần tử cuối cùng của hàng đợi. Ném ra ngoại lệ NoSuchElementException nếu hàng đợi rỗng.
//peekFirst(): Lấy nhưng không xóa phần tử đầu tiên của hàng đợi. Trả về null nếu hàng đợi rỗng.
//peekLast(): Lấy nhưng không xóa phần tử cuối cùng của hàng đợi. Trả về null nếu hàng đợi rỗng.
//removeFirstOccurrence(Object o): Xóa lần xuất hiện đầu tiên của phần tử o trong hàng đợi.
//removeLastOccurrence(Object o): Xóa lần xuất hiện cuối cùng của phần tử o trong hàng đợi.
//push(E e): Thêm phần tử e vào đầu hàng đợi (giống như addFirst).
//pop(): Lấy và xóa phần tử đầu tiên của hàng đợi (giống như removeFirst). Ném ra ngoại lệ NoSuchElementException nếu hàng đợi rỗng.
//}
