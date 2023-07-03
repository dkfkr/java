package step5;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int T = scanner.nextInt();

            for (int i = 0; i < T; i++) {
                String input = scanner.next();

                System.out.println(input.charAt(0) + "" + input.charAt(input.length() - 1));
            }
        }
    }
}
