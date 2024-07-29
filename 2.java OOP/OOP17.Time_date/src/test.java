import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class test {
	public static void main(String[] args) {

//	hàm lấy thời gian hiện tại
		long t1 = System.currentTimeMillis();
		for (int i = 0; i < 14; i++) {
			System.out.println("test");
		}
		long t2 = System.currentTimeMillis();
		System.out.println("thời gian trước khi chạy for " + t1);
		System.out.println("thời gian sau khi chạy for " + t2);
		System.out.println("thời gian for chạy là " + (t2 - t1) + " mls");

//	timeUnit
		System.out.println("3000 năm = " + TimeUnit.DAYS.toSeconds(3000 * 365) + "s");
		System.out.println("25h = " + TimeUnit.HOURS.toSeconds(25) + "s");

//	sql.Date
		Date d = new java.sql.Date(System.currentTimeMillis());
//		System.out.println(d.getDate());
		
//		Calendar
		Calendar c= Calendar.getInstance();
		System.out.println(c.get(Calendar.DATE) +" "+c.get(Calendar.MONTH)+" "+ c.get(Calendar.YEAR));
	
		c.add(Calendar.HOUR, 30);
		System.out.println(c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));
		
		c.add(Calendar.DATE, 14);
		System.out.println(c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));
		
		// DateFormat
		DateFormat df = new SimpleDateFormat();
		System.out.println(df.format(d));
		
		 df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 System.out.println(df.format(d));
		 
		 
	}
}
