package lesson8.blackjack;

import java.util.ArrayList;
import java.util.Random;

public class Koloda {
    public ArrayList<Card> cards = new ArrayList<>();

    public Koloda() {
        cards.add(new Card("Двойка трефа", 2));
        cards.add(new Card("Двойка бубна", 2));
        cards.add(new Card("Двойка пика", 2));
        cards.add(new Card("Двойка черви", 2));

        cards.add(new Card("Тройка трефа", 3));
        cards.add(new Card("Тройка бубна", 3));
        cards.add(new Card("Тройка пика", 3));
        cards.add(new Card("Тройка черви", 3));

        cards.add(new Card("Четверка трефа", 4));
        cards.add(new Card("Четверка бубна", 4));
        cards.add(new Card("Четверка пика", 4));
        cards.add(new Card("Четверка черви", 4));

        cards.add(new Card("Пятерка трефа", 5));
        cards.add(new Card("Пятерка бубна", 5));
        cards.add(new Card("Пятерка пика", 5));
        cards.add(new Card("Пятерка черви", 5));

        cards.add(new Card("Шестерка трефа", 6));
        cards.add(new Card("Шестерка бубна", 6));
        cards.add(new Card("Шестерка пика", 6));
        cards.add(new Card("Шестерка черви", 6));

        cards.add(new Card("Семерка трефа", 7));
        cards.add(new Card("Семерка бубна", 7));
        cards.add(new Card("Семерка пика", 7));
        cards.add(new Card("Семерка черви", 7));

        cards.add(new Card("Восьмерка трефа", 8));
        cards.add(new Card("Восьмерка бубна", 8));
        cards.add(new Card("Восьмерка пика", 8));
        cards.add(new Card("Восьмерка черви", 8));

        cards.add(new Card("Девятка трефа", 9));
        cards.add(new Card("Девятка бубна", 9));
        cards.add(new Card("Девятка пика", 9));
        cards.add(new Card("Девятка черви", 9));

        cards.add(new Card("Десятка трефа", 10));
        cards.add(new Card("Десятка бубна", 10));
        cards.add(new Card("Десятка пика", 10));
        cards.add(new Card("Десятка черви", 10));

        cards.add(new Card("Валет трефа", 10));
        cards.add(new Card("Валет бубна", 10));
        cards.add(new Card("Валет пика", 10));
        cards.add(new Card("Валет черви", 10));

        cards.add(new Card("Дама трефа", 10));
        cards.add(new Card("Дама бубна", 10));
        cards.add(new Card("Дама пика", 10));
        cards.add(new Card("Дама черви", 10));

        cards.add(new Card("Король трефа", 10));
        cards.add(new Card("Король бубна", 10));
        cards.add(new Card("Король пика", 10));
        cards.add(new Card("Король черви", 10));

        cards.add(new Card("Туз трефа", 11));
        cards.add(new Card("Туз бубна", 11));
        cards.add(new Card("Туз пика", 11));
        cards.add(new Card("Туз черви", 11));
    }
    //метод возврата рондомной карты
    public static Card getRandArrayElement(ArrayList<Card> cards){
        Random random = new Random();
        Card cardsRand = cards.get(random.nextInt(cards.size()));
        System.out.println(cardsRand.toString());
        return cardsRand;
    }
}