package lesson1;

public class DZ1 {
    public static void main(String[] args) {
        double totalMoney = 1000;
        double pizzaCost = 230;
        double gumCost = 26;
        double candyCost = 2.5;
        int numberOfPizzas;
        int numberOfGum;
        int numberOfCandy;
        double balance;

        System.out.println("На эти деньги мы можем купить:");

        numberOfPizzas = (int) (totalMoney / pizzaCost);
        System.out.println("- " + numberOfPizzas + " пиццы");

        balance = totalMoney % pizzaCost;
        numberOfGum = (int) (balance / gumCost);
        System.out.println("- " + numberOfGum + " жвачки");

        balance = totalMoney % pizzaCost % gumCost;
        numberOfCandy = (int) (balance / candyCost);
        System.out.println("- " + numberOfCandy + " конфет");

        balance = totalMoney % pizzaCost % gumCost % candyCost;
        System.out.println("Сдача с магазина:" + balance + " рубля.");
    }
}
