package test05;

import java.util.Scanner;

public class Test07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키(cm) 입력 : ");
		double height = sc.nextDouble();
		height /= 100;
		
		System.out.println("체중(kg) 입력 : ");
		double weight = sc.nextDouble();
	
		double bmi = weight / (height * height);
		
		String result;
		if(bmi < 20)
			result = "low";
		else if (bmi < 25)
			result = "standard";
		else if (bmi < 30)
			result = "high standard";
		else if (bmi < 40)
			result = "high";
		else
			result = "very high";
		
		System.out.printf("BMI=%.2f, '%s입니다.", bmi, result);
		
		sc.close();
	}
}
