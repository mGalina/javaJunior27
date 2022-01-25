package lesson3;

public class DZ3 {
    public static void main(String[] args) {

        int[] number = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55};

        System.out.println("1. Ячейки всего массива по порядку:");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }

        System.out.println("\n2. Ячейки всего массива в обратном порядке:");
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i] + " ");
        }

        System.out.println("\n3. Сумма всех ячеек:");
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum += number[i];
        }
        System.out.println(sum);

        System.out.println("4. Чего больше, четных или нечетных?");
        int chetnyye = 0;
        int nechetnyye = 0;

        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                chetnyye += 1;
            } else {
                nechetnyye += 1;
            }
        }
        if (chetnyye > nechetnyye) {
            System.out.println("Четных больше!");
        } else if (chetnyye == nechetnyye) {
            System.out.println("Четных и нечетных равное количество!");
        } else {
            System.out.println("Нечетных больше!");
        }
        //для проверки выведим количество четных и нечетных:
        System.out.println("Количество четных:" + chetnyye);
        System.out.println("Количество нечетных:" + nechetnyye);
    }
}
