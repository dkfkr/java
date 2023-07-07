package simsim;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class YearLotto {

    public static void main(String[] args) {
        List<Integer> lotteryNumbers = generateAnnuityLotteryNumbers();
        int bonusNumber = generateBonusNumber();
        System.out.println("연금복권 번호: " + lotteryNumbers);
        System.out.println("보너스 번호: " + bonusNumber);
    }

    public static List<Integer> generateAnnuityLotteryNumbers() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            numbers.add(i);
        }

        Collections.shuffle(numbers);

        List<Integer> lotteryNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int number = numbers.get(i);
            lotteryNumbers.add(number);
        }

        Collections.sort(lotteryNumbers);
        return lotteryNumbers;
    }

    public static int generateBonusNumber() {
        Random random = new Random();
        return random.nextInt(7) + 1;
    }
}
