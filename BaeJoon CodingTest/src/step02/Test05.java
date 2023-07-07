package step02;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("시간을 입력하세요");
		int hour = sc.nextInt();
		System.out.println("분을 입력하세요");
		int minute = sc.nextInt();
		int nowm = minute - 45; 

		if (hour > 0 && nowm < 0) {
			int result1 = hour - 1;
			int result2 = nowm + 60;
			System.out.print(result1 + " ");
			System.out.print(result2);
		} else if (hour > 0 && nowm >= 60) {
			int result3 = hour - 1;
			int result4 = nowm % 60;
			System.out.print(result3 + " ");
			System.out.print(result4);
		} else if (hour == 0 && nowm < 0) {
			int result5 = hour + 23;
			int result6 = nowm + 60;
			System.out.print(result5 + " ");
			System.out.print(result6);
		} else {
			System.out.print(hour);
			System.out.print(" ");
			System.out.print(nowm);
		}

		sc.close();
	}
}
