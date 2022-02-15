package lesson8.blackjack;

public interface IPlayer {

    //Брать карту и сохранять в руке
    void addCardToHand(Card card);

    //Отвечать нужна ли еще карта
    boolean needsCard();

    //Открыть свои карты
    void openCards();

    //Подсчет баллов в руке
    int valuesHand();
}
