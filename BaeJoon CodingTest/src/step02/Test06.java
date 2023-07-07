package step02;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int currentHour = sc.nextInt();
        int currentMinute = sc.nextInt();

        int cookingTime = sc.nextInt();

        // 종료되는 시각 계산
        int totalMinutes = currentHour * 60 + currentMinute + cookingTime;
        int endHour = totalMinutes / 60 % 24;
        int endMinute = totalMinutes % 60;

        System.out.println(endHour + " " + endMinute);

        sc.close();
    }
}

