package lesson1;

import java.util.Scanner;

public class DZ2 {
    public static void main(String[] args) {
        double totalMoney;
        double pizzaCost = 230;
        double gumCost = 26;
        double candyCost = 2.5;
        int numberOfPizzas;
        int numberOfGum;
        int numberOfCandy;
        double balance;

/*
Округляем цены до 2-х знаков после запятой, иначе копейки считаются не верно
  */
        pizzaCost = Math.floor(pizzaCost * 100) / 100.00;
        gumCost = Math.floor(gumCost * 100) / 100.00;
        candyCost = Math.floor(candyCost * 100) / 100.00;

        Scanner scan = new Scanner(System.in); //объявление сканера

        System.out.print("Введите сумму: ");

        if (scan.hasNextDouble()) {
            totalMoney = scan.nextDouble(); //считываем число с консоли
            totalMoney = Math.floor(totalMoney * 100) / 100.00; //округление до 2-х знаков полсе запятой, если пользователь ввел больше
            System.out.println("У вас на балансе " + totalMoney);
            System.out.println("На эти деньги мы можем купить:");

            numberOfPizzas = (int) (totalMoney / pizzaCost);
            System.out.println("Пиццу: " + numberOfPizzas + " шт.");

            balance = totalMoney % pizzaCost;
            balance = Math.floor(balance * 100) / 100.00;
            System.out.println("Остаток от покупки пиццы: " + balance + " руб."); //вывела для чека, т.к. значение не округляется до 2-х знаков.Не поняла почему(.
            System.out.println("На эти деньги мы можем купить:");
            numberOfGum = (int) (balance / gumCost);

            System.out.println("Жвачку: " + numberOfGum + " шт.");

            balance = totalMoney % pizzaCost % gumCost;
            balance = Math.floor(balance * 100) / 100.00;
            System.out.println("Остаток от покупки пиццы и жвачки: " + balance + " руб.");
            System.out.println("На эти деньги мы можем купить:");
            numberOfCandy = (int) (balance / candyCost);
            System.out.println("Конфет: " + numberOfCandy + " шт.");

            balance = totalMoney % pizzaCost % gumCost % candyCost;
            balance = Math.floor(balance * 100) / 100.00;
            System.out.println("Сдача с магазина:" + balance + " руб.");
        } else {
            System.out.println("Ошибка! Вы ввели не число.");
        }
    }
}
