package ch02.sec07;

public class PromotionExample {
	public static void main(String[] args) {
		//자동타입변환
		byte bytrValue = 10;
		int intValue = bytrValue;
		System.out.println("intValue" + intValue);

		char charvalue = '가';
		intValue = charvalue;
		System.out.println("가의 유니코드: " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValaue: " + longValue);
				
		longValue = 100;
		float floatValue = intValue;
		System.out.println("floatValue: " + floatValue);
				
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);
	}

}
