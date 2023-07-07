package step04;

import java.util.Arrays;
import java.util.Scanner;
 
public class Test10 {
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
 
		double arr[] = new double[in.nextInt()]; // 입력 받는 점수
		
		for(int i = 0; i < arr.length; i++) {// 원래 평균
			arr[i] = in.nextDouble();
		}
		in.close();
		
		double sum = 0;
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {// 새로운 평균
			sum += ((arr[i] / arr[arr.length-1]) * 100);
		}
		System.out.print(sum / arr.length);
	}
}