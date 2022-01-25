package lesson3;

public class Main2 {
    public static void main(String[] args) {
        int[] number = {7, 6, 7, 2, 3, 12, 56, 87755, 6};

        int sumChet = 0;
        for (int i = 0; i < 8; i++) {
            if (number[i] % 2 == 0) {
                sumChet += number[i];
            }
        }
        System.out.println(sumChet);
    }
}
