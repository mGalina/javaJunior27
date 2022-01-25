package lesson1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Введите любое целое положительное число: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        for (int i = 1; i<=n; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
