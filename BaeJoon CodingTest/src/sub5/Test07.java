package sub5;

import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스의 개수

        for (int i = 0; i < T; i++) {
            int R = sc.nextInt(); // 반복 횟수
            String S = sc.next(); // 문자열

            String P = ""; // 새 문자열

            for (int j = 0; j < S.length(); j++) {
                char ch = S.charAt(j);
                for (int k = 0; k < R; k++) {
                    P += ch; // 문자를 R번 반복하여 P에 추가
                }
            }

            System.out.println(P);
        }

        sc.close();
    }
}

