package lesson4;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Введите ваш возвраст: ");

        Scanner scanner = new Scanner(System.in);
        String age = scanner.next();

        int ageInt = Integer.parseInt(age);
        if (ageInt > 0 && ageInt <= 10) {
            System.out.println("Вы ребенок!");
        } else if (ageInt > 11 && ageInt <= 17) {
            System.out.println("Вы подросток!");
        } else if (ageInt > 18 && ageInt <= 35) {
            System.out.println("Вы взрослый!");
        } else if (ageInt > 36 && ageInt <= 50) {
            System.out.println("Вы зрелый!");
        } else if (ageInt > 51 && ageInt <= 150) {
            System.out.println("Вы старик!");
        } else {
            System.out.println("Вы мертвы(");
        }
    }
}
