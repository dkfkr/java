package sub3;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        int v = scanner.nextInt();

        scanner.close();

        System.out.println("정수의 개수 N: " + N);
        System.out.print("정수들의 배열: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("찾으려는 정수 v: " + v);
    }
}
