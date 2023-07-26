package ch04check;

public class Test07 {
	public static void main(String[] args) {
		double x = 5.0;
		double y = 0.0;
		double z = x % y;
		// Double.isNaN(z) 를 써도 됨
		if (y == 0.0) {
			System.out.println("0으로 나눌 수 없습니다.");
		}else {
			double result = z + 10;
			System.err.println("결과 " + result);
		}
	}
	
}
