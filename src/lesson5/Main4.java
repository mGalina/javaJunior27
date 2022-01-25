package lesson5;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        String[][] tours = {{"Турция", "5 дней", "самолет", "5 звезд", "12000"},
                {"Египет", "6 дней", "поезд", "2 звезд", "8000"},
                {"Турция", "7 дней", "автобус", "4 звезд", "12000"},
                {"Турция", "8 дней", "пешком", "3 звезд", "1500"},
                {"Англия", "16 дней", "самолет", "1 звезд", "7830"}};

        Scanner scanner = new Scanner(System.in);
//        System.out.println("В какую страну хотите поехать?: ");
//
//        String country = scanner.nextLine();
//
//        System.out.println("У нас есть вот такие туры в " + country);
//
//        for (int i = 0; i < tours.length; i++) {
//            if (country.equalsIgnoreCase(tours[i][0])) {
//                System.out.println(tours[i][0] + ", на " + tours[i][1] +
//                        ", " + tours[i][2] + ", " + tours[i][3] +
//                        ", цена - " + tours[i][4]);
//            }
//        }

        System.out.println("Сколько максимум дней для поездки?");
        String dayStr = scanner.nextLine();

        int day = Integer.parseInt(dayStr);
        for (int i = 0; i < tours.length; i++) {
            int dayFromTour = Integer.parseInt(tours[i][1].replaceAll("[\\D]", ""));
            if (dayFromTour <= day){
                System.out.println(tours[i][0] + ", на " + tours[i][1] +
                        ", " + tours[i][2] + ", " + tours[i][3] +
                        ", цена - " + tours[i][4]);
            }
        }
        // вывести на консоль все туры:
        // от и до введенной цены
        // среднюю цену любого тура
        // туры от стольких-то звезд и выше
    }
}
