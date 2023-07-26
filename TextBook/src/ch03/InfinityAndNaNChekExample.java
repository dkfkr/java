package ch03;

public class InfinityAndNaNChekExample {

	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		double z = x / y;
		
		System.out.println(z + 2);
		
		if(Double.isFinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		}else {
			System.out.println(z + 2);
		}
		
	}

}
