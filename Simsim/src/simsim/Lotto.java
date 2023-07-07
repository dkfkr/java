package simsim;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lotto {

    public static void main(String[] args) {
        List<Integer> lottoNumbers = generateLottoNumbers();
        System.out.print("로또 번호: ");
        for (int number : lottoNumbers) {
            System.out.print(number + " ");
        }
    }

    public static List<Integer> generateLottoNumbers() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 45; i++) {
            numbers.add(i);
        }

        Collections.shuffle(numbers);

        List<Integer> lottoNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            int number = numbers.get(i);
            lottoNumbers.add(number);
        }

        Collections.sort(lottoNumbers);
        return lottoNumbers;
    }
}
