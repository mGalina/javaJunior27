package lesson8.blackjack;

public interface IGame {

    //Добавить участника
    void addPlayer(Player player);

    //Раздать каждому по 2 карты
    void dealTwoCards();

    //Все дать максимум карт
    void dealMaxCards();

    //Определить победителя
    void printWinner();
}
