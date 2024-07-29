
public class MyMath {
	public int min(int a, int b) {
		if (a > b)
			return b;
		else
			return a;
	}

	public double min(double a, double b) {
		if (a > b)
			return b;
		else
			return a;
	}
	public double tinhTong(double[] arr) {
		double tong=0;
		for(double x:arr) {
			tong+=x;
		}
		return tong;
	}
}
