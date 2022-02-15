package lesson8.blackjack;

import java.util.ArrayList;
import java.util.Scanner;

public class Player implements IPlayer {
    private ArrayList<Card> hand = new ArrayList<>();
    private boolean canWin = true;

    @Override
    public void addCardToHand(Card card) {
        hand.add(card);
    }

    @Override
    public boolean needsCard() {
        Scanner scanner = new Scanner(System.in);
        this.openCards();
        System.out.println("Нужна ли еще одна карта? ");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("да")) {
            return true;
        }
        return false;
    }

    @Override
    public void openCards() {
        for (Card c : hand) {
            System.out.println(c);
        }
    }

    @Override
    public int valuesHand() {
        int values = 0;
        for (Card c : hand) {
            values += c.getValue();
        }
        return values;
    }

    public boolean isCanWin() {
        return canWin;
    }

    public void setCanWin(boolean canWin) {
        this.canWin = canWin;
    }
}
