package lesson8.blackjack;

public class Main {

    public static void main(String[] args) {

        Game game = new Game();
        Player player = new Player();
        Dealer dealer = new Dealer();

        game.addPlayer(player);
        game.addPlayer(player);
        game.addPlayer(dealer);

        game.dealTwoCards();
        game.dealMaxCards();

        game.printWinner();
    }
}
