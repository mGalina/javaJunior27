package lesson8.blackjack;

public class Dealer extends Player {

    @Override
    public boolean needsCard() {
        if (this.valuesHand() < 18) {
            return true;
        }
        return false;
    }
}
