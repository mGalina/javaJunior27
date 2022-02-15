package lesson12;

import java.util.Comparator;
import java.util.TreeSet;

public class CoinSort {

    public static TreeSet<Coin> sortByDiametr(TreeSet<Coin> coins) {
        TreeSet<Coin> sortByDiametr = new TreeSet<>(new SortByDiametrComparator());
        sortByDiametr.addAll(coins);
        return sortByDiametr;
    }

    public static TreeSet<Coin> sortByDiametrFromBigest(TreeSet<Coin> coins) {
        TreeSet<Coin> sortByDiametr = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {

                if (o2.getDiametr() != o1.getDiametr()) {
                    return Double.compare(o2.getDiametr(), o1.getDiametr());
                }
                if (o2.getYear() != o1.getYear()) {
                    return o2.getYear() - o1.getYear();
                }
                if (o2.getNominal() != o1.getNominal()) {
                    return o2.getNominal() - o1.getNominal();
                }
                return o2.getMetall().compareTo(o1.getMetall());
            }
        });
        sortByDiametr.addAll(coins);
        return sortByDiametr;
    }

}
