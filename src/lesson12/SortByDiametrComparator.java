package lesson12;

import java.util.Comparator;

public class SortByDiametrComparator implements Comparator<Coin> {
    @Override
    public int compare(Coin o1, Coin o2) {
        //o1 - первая монета
        //o2 - вторая монета
        if (o1.getDiametr() != o2.getDiametr()){
            return Double.compare(o1.getDiametr(), o2.getDiametr());
        }
        if (o1.getYear() != o2.getYear()) {
            return o1.getYear() - o2.getYear();
        }
        if (o1.getNominal() != o2.getNominal()) {
            return o1.getNominal() - o2.getNominal();
        }
        return o1.getMetall().compareTo(o2.getMetall());
    }
}
