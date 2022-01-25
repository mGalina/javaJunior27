package lesson5;

public class Main1 {
    public static void main(String[] args) {
        int money = 100000;
        int year = 5;
        int prosent = 7;

        for (int i = 0; i < year; i++) {
            for (int month = 0; month < 12; month++) {
                money = money + ((money / 100 * prosent) / 12);
            }
        }
        System.out.println("Ежемесячная - " + money);

        money = 100000;
        for (int i = 0; i < year; i++) {
            money = money + (money / 100 * prosent);
        }
        System.out.println("Годовая - " + money);
    }
}
