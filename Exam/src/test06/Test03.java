package test06;

public class Test03 {
    public static void main(String[] args) {
        int sum = 0;
        int days = 1;
        int money = 1000;

        while (true) {
            sum += money;
            System.out.printf("%d일자: %,8d, sum = %,9d\n", days, money, sum);

            if (sum >+ 1000000) {
                break;
            }

            days++;
            money *= 2;
        }

        System.out.printf("%d일자에 %,d원이 됩니다.", days, sum);
    }
}
