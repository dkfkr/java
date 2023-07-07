package step04;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test07{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> submittedNumbers = new HashSet<>();

        for (int i = 0; i < 28; i++) {
            int number = sc.nextInt();
            submittedNumbers.add(number);
        }

        for (int i = 1; i <= 30; i++) {
            if (!submittedNumbers.contains(i)) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
