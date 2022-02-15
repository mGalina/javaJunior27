package lesson12;

import java.util.HashSet;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        TreeSet<Coin> coins = new TreeSet<>();
        coins.add(new Coin(2.5, "Золото", 1900, 5));
        coins.add(new Coin(2.5, "Золото", 1900, 5));
        coins.add(new Coin(3, "Серебро", 1800, 10));
        coins.add(new Coin(4.5, "Бронза", 1958, 1));
        coins.add(new Coin(5.5, "Золото", 1799, 4));

        for (Coin coin: coins){
            System.out.println(coin);
        }
        System.out.println();

        TreeSet<Coin> sortByDiam = CoinSort.sortByDiametr(coins);
        for (Coin c: sortByDiam){
            System.out.println(c);
        }
        System.out.println();

        TreeSet<Coin> sortByDiamFromBigest = CoinSort.sortByDiametr(coins);
        for (Coin c: sortByDiamFromBigest){
            System.out.println(c);
        }
    }
}
