package lesson2;

public class DZ2 {
    public static void main(String[] args) {
        //1) вывести на консоль только четные от 100 до 150

        for (int i = 100; i <= 150; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }

        //2) вывести на консоль сумму четных чисел от 20 до 40

        int sum = 0;
        for (int i = 20; i <= 40; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("\n" + sum);

        //3) вывести на консоль числа от 10 до 50, при этом не выводить от 20 до 25

        for (int i = 10; i <= 50; i++) {
            if (i < 20 || i > 25) {
                System.out.print(i + ", ");
            }
        }
        System.out.print("\n");

        //4) вывести на консоль среднее значение всех нечетных чисел от 0 до 100

        sum = 0;
        int countOdd = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                sum += i;
                countOdd++;
                System.out.print(i + ", ");
            }
        }
        System.out.println("\n" + sum / countOdd);

        //5) вывести на консоль числа от -10 до -40

        for (int i = -10; i >= -40; i--) {
            System.out.print(i + ", ");
        }
    }
}
