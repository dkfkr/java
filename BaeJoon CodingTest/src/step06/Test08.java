package step06;

import java.io.*;
import java.util.StringTokenizer;

public class Test08 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        String str[] = new String[20];
        double totalSum = 0;
        double scoreSum = 0;
        String gradeList[] = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"}; // 모든 등급표시
        double gradeScore[] = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};// 등급에 따른 과목 점수

        for (int i = 0; i < 20; i++) {// 과목명 체크
            str[i] = bfr.readLine();
            StringTokenizer st = new StringTokenizer(str[i], " ");
            String subject = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            for (int j = 0; j < 10; j++) {
                if (grade.equals(gradeList[j])) {
                    totalSum += score * gradeScore[j];// 총 학점
                    if (j != 9) {
                        scoreSum += score;
                    }
                }
            }
        }

        double average = totalSum / scoreSum;// 총 평균 / 총학점
        System.out.printf("%.6f\n", average);

        bfr.close();
    }
}
